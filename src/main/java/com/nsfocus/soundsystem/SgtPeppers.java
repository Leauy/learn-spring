package com.nsfocus.soundsystem;

import org.springframework.stereotype.Component;

//@Component("lonelyHeartsClub") mingming
@Component
public class SgtPeppers implements CompactDisc {

    @Override
    public void play() {
        System.out.println("sgt peppers");
    }
}
