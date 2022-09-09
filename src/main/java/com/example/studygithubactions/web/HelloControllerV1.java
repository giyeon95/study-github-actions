package com.example.studygithubactions.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
@RequiredArgsConstructor
public class HelloControllerV1 {

    @GetMapping
    public String getHello() {
        return "hello world! 222";
    }
}
