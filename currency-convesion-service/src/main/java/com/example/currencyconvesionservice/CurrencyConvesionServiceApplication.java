package com.example.currencyconvesionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrencyConvesionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConvesionServiceApplication.class, args);
	}

}
