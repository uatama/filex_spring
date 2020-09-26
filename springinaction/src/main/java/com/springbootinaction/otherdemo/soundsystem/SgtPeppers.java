package com.springbootinaction.otherdemo.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{
    private String title = "I'am crazy";
    private String artist = "matchbox21";

    public void play(){
        System.out.println("Playing " + title + " by " +artist);
    }
}
