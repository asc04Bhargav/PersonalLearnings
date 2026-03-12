package com.bhargav.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories("com.bhargav.BankAccount_RestApi1.repo")
public class BankAccountRestApi1Application {

	public static void main(String[] args) {

		SpringApplication.run(BankAccountRestApi1Application.class, args);
	}

}
