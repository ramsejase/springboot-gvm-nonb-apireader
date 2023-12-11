package com.ng.ap.apiread.config;

import java.time.Duration;
import java.util.Objects;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PreDestroy;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import reactor.netty.http.client.HttpClient;
import reactor.netty.resources.ConnectionProvider;

@Slf4j
@Configuration
public class ApiClientConfig {

	public static final ObjectMapper mapper = new ObjectMapper();
	
	@Value("${netty.http.pool.maxConnection}")
	Integer maxConnections;
	@Value("${netty.http.pool.maxIdleTimeInSeconds}")
	Integer maxIdleTimeInSeconds;
	@Value("${netty.http.pool.maxLifeTimeInSeconds}")
	Integer maxLifeTimeInSeconds;
	@Value("${netty.http.pool.pendingAcquireTimeout}")
	Integer pendingAcquireTimeout;
	@Value("${netty.http.pool.evictTimeInSeconds}")
	Integer evictTimeInSeconds;
	
	ConnectionProvider poolProvider;
	
	@Getter
	WebClient webclient;
	
	@Qualifier("NettyPool")
	@Bean
	ConnectionProvider nettyPoolProvider() {
		
		this.poolProvider = ConnectionProvider
				.builder("Netty-HTTP-Connection-Pool")
				.maxConnections(maxConnections)
				.maxIdleTime(Duration.ofSeconds(maxIdleTimeInSeconds))           
				.maxLifeTime(Duration.ofSeconds(maxLifeTimeInSeconds))           
				.pendingAcquireTimeout(Duration.ofSeconds(pendingAcquireTimeout)) 
				.evictInBackground(Duration.ofSeconds(evictTimeInSeconds))    
				.build();
		log.info("Netty Http Pool Provider Configured");
		
		return poolProvider;
	}
	
	@Bean
	WebClient httpClient() {
		
		log.info("Web client getting configured now");
		HttpClient httpClient = HttpClient.create(nettyPoolProvider());
		
		ClientHttpConnector httpConnector = new ReactorClientHttpConnector(httpClient);
		
		final Jackson2JsonDecoder jDecoder = new Jackson2JsonDecoder(mapper, MediaType.APPLICATION_JSON_UTF8);
		final Jackson2JsonEncoder jEncoder = new Jackson2JsonEncoder(mapper, MediaType.APPLICATION_JSON_UTF8);
		
		ExchangeStrategies jsonMapperStrategies = ExchangeStrategies.builder()
				.codecs((clientCodecConfigurer) -> {
					clientCodecConfigurer.defaultCodecs().jackson2JsonDecoder(jDecoder);
					clientCodecConfigurer.defaultCodecs().jackson2JsonEncoder(jEncoder);
				})
				.build();
		
		this.webclient = WebClient.builder()
				.clientConnector(httpConnector)
				.exchangeStrategies(jsonMapperStrategies)
				.build();
		
		return webclient;
	}
	
	@Getter
	public Function<String, ResponseSpec> apiJsonGet = (url) -> {
		return getWebclient().get()
					.uri(url)
					.accept(MediaType.APPLICATION_JSON)
					.retrieve();
	};

	@PreDestroy
	public void close() {
		
		if(Objects.isNull(poolProvider)) {
			return;
		}
		log.info("Netty Http Pool Provider disposed");
		poolProvider.disposeLater().block();
	}
}