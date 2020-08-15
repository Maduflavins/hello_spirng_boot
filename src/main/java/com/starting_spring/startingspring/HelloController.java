package com.starting_spring.startingspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//this is to check for the change
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(){
        return "Greetings In HelloWorld";
    };
};
