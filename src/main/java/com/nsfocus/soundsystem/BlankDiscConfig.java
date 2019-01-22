package com.nsfocus.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BlankDiscConfig {
    @Bean
    public BlankDiscDemo blankDiscDemo(){
        return new BlankDiscDemo();
    }
}
