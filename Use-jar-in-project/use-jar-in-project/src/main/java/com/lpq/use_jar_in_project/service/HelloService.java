package com.lpq.use_jar_in_project.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}