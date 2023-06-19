package com.example.pushSample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class HelloController {

    @GetMapping
    public String getMessage() throws InterruptedException, ExecutionException {
        return "Message: herer";
    }
}