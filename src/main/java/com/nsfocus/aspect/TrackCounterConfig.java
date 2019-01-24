package com.nsfocus.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
//
//@Configuration
//@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public CompactDiscDemo compactDisc() {
        return new CompactDiscDemo();
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }

}
