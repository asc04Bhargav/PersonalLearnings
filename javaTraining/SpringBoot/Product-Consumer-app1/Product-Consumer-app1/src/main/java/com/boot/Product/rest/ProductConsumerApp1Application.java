package com.boot.Product.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ProductConsumerApp1Application {



	public static void main(String[] args) {
		SpringApplication.run(ProductConsumerApp1Application.class, args);
	}

}
