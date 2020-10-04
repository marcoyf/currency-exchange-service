package br.tec.marco.microservices.currencyexchangeproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchangeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeProjectApplication.class, args);
	}
	
	// method used by Spring Sleuth, which assigns a unique ID for each incoming request
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
