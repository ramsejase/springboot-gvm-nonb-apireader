package com.ng.ap.apiread.service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.ng.ap.apiread.config.ApiClientConfig;
import com.ng.ap.apiread.model.Country;

import reactor.core.publisher.Flux;

@Service
public class ApiReaderService {

	@Autowired
	ApiClientConfig apiConfig;
	
	@Value("${api.countries}")
	String allCountriesApiURL;
	
	Function<String, Flux<Country>> apiClientCountryGet = (url) -> {

		return
				apiConfig
				.getApiJsonGet()
				.apply(url)
				.bodyToFlux(Country.class)
				.doOnError(t -> t.printStackTrace())
				.onBackpressureBuffer();	
	};
	
	Function<String, Flux<String>> apiClientStringGet = (url) -> {

		return apiConfig.getApiJsonGet()
				.apply(url)
				.bodyToFlux(String.class)
				.doOnError(t -> t.printStackTrace())
				.onBackpressureBuffer();
	};
	
	public Flux<Country> getAllCountryData() {

		AtomicLong al = new AtomicLong();
		return
		apiClientCountryGet.apply(allCountriesApiURL)
		.map(country -> {
			country.setId(al.incrementAndGet());
			return country;
		});
	}
	
	public Flux<String> getAllCountryJsonData() {

		return apiClientStringGet
			.apply(allCountriesApiURL)
			.map(data -> data.toString());
	}
}
