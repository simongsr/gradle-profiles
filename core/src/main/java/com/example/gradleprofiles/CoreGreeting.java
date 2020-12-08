package com.example.gradleprofiles;

import org.springframework.stereotype.Component;

@Component
public class CoreGreeting implements Greeting {
    @Override
    public String greet() {
        return "Greeting from CORE";
    }
}
