package com.example.gradleprofiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class StartupListener implements ApplicationListener<ContextRefreshedEvent> {

    private final Logger log = LoggerFactory.getLogger(StartupListener.class);

    @Autowired private Greeting greeting;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info(greeting.greet());
    }
}
