package com.cb.consumer;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/consumer")
public class NameListConsumerController {

    @Autowired
    RestTemplate template;


    @GetMapping("/names")
    @CircuitBreaker(name = "GetNamesBreaker",fallbackMethod = "getTempNames")
    public List<String> getNames(){
        String namesControllerProducerUrl ="http://localhost:8001/api/producer/names";
        String[] names =template.getForObject(namesControllerProducerUrl,String[].class);
        return Arrays.asList(names);
    }

    public List<String> getTempNames(Throwable t){
        return Arrays.asList("Temp name1","Temp name2","Temp name3","Temp name4");
    }
}
