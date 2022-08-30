package com.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ReaderMsMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReaderMsMainApplication.class, args);
		System.out.println("hello reader");
	}

	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
