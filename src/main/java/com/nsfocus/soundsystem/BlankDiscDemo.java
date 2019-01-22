package com.nsfocus.soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlankDiscDemo {
    private String title;
    private String artist;
    public BlankDiscDemo(@Value("${dist.title}") String title,
            @Value(("${dist.artist}")) String artist) {
        this.title = title;
        this.artist = artist;
    }

    public BlankDiscDemo() {
        String title;
//        this()
    }
}
