package com.bhargav.Eureka_server_app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApp1Application.class, args);
	}

}
