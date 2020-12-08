package com.example.gradleprofiles;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ForkGreeting extends CoreGreeting {
    @Override
    public String greet() {
        return String.format("Greeting from FORK (%s)", super.greet());
    }
}
