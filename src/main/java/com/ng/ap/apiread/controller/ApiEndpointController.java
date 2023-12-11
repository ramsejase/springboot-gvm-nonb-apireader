package com.ng.ap.apiread.controller;

import java.util.List;

import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ng.ap.apiread.model.Country;
import com.ng.ap.apiread.service.ApiReaderService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ApiEndpointController {

	@Autowired
	ApiReaderService service;
	
	@GetMapping("/health")
	public String health() {
		
		return "UP";
	}
	
	@RegisterReflectionForBinding(Country.class)
	@GetMapping(path = "/allcountry", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Country> allCountry() {

		return service.getAllCountryData();
	}
	
	@RegisterReflectionForBinding(Country.class)
	@GetMapping(path = "/allcountrystr", produces = MediaType.TEXT_EVENT_STREAM_VALUE)	
	public Mono<List<String>> returnAsString() {

		ObjectMapper mapper = new ObjectMapper();
		return service.getAllCountryData()
			.map(country -> {
				try {
					return mapper.writeValueAsString(country);
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				}
				return "";
			})
			.filter(val -> val.length() > 0)
			.collectList();

	}

	
	@GetMapping(path = "/allcountryjson", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<String> allCountryJson() {
		
		return service.getAllCountryJsonData();
	}
}
