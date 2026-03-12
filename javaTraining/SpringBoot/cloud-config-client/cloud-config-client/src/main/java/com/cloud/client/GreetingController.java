package com.cloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope

public class GreetingController {

    @Value("${firstname}")
    private String firstname;

    @Value("${lastname}")
    private String lastname;

    @GetMapping("/hello")
    public String greet(){
        return "Hello, "+ firstname+" "+lastname;
    }
}
