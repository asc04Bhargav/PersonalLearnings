package com.cb.prod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/producer")
public class NamesListProducerController {

    @GetMapping("/names")
    public List<String> getNames(){
        List<String> names = List.of("Java","Reach","Angular");
        return names;
    }
}
