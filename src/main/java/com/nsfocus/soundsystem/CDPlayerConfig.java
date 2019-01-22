package com.nsfocus.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration
//@ComponentScan(basePackages = "com.nsfocus.soundsystem")
//public class CDPlayerConfig {
//}
@Configuration
public class CDPlayerConfig{

    @Bean
    public CDPlayer CDPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
