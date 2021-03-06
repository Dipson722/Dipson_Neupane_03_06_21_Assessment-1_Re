package com.example.demo.Test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MainProgram {

    @GetMapping("/findOddEven")

    public String BodyOfMainProgram() {
        int number = 4;

        if (number % 2 == 0) {
            return "It is Even";
        } else {
            return "It is Odd";
        }

    }

}
