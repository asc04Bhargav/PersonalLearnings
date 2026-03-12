package com.bhargav.esc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EurekaClientService2Application {

	public static void main(String[] args) {

		SpringApplication.run(EurekaClientService2Application.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate templete(){
		return new RestTemplate();
	}
}
