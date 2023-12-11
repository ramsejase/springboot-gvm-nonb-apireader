package com.ng.ap.apiread;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import com.ng.ap.apiread.service.ApiReaderService;

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles(profiles = {"test"})
class SpringbootGvmNonbApireaderApplicationTests {
	
	@Autowired
	ApiReaderService service;
	
//	@Test
	void contextLoads() {
	}

	// @Test
	void service() {
		long count = 
		service.getAllCountryData()
		.map(country -> country.toString())
		.count().block();
		Assertions.assertEquals(1, count);
		
	}
	
}
