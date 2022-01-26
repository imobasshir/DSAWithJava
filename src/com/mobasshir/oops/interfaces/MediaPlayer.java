package com.mobasshir.oops.interfaces;

public class MediaPlayer implements Media {

    @Override
    public void start() {
        System.out.println("Music Start!");
    }

    @Override
    public void stop() {
        System.out.println("Music Stop!");
    }
}
