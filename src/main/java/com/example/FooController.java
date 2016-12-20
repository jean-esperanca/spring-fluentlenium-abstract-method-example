package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

    @GetMapping("/foo")
    public String doShit() {
        return "Yay!";
    }

}