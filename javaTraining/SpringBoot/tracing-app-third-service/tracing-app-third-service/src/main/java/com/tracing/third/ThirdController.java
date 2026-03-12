package com.tracing.third;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdController {
    @GetMapping("/third")
    public String goodevining(){
        return "Good evining rom 3rd controller..";
    }
}
