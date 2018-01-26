package com.doubles.standardofjava.ch07_oop2.part01_inheritance;

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv captionTv = new CaptionTv();
        captionTv.channel = 10;
        captionTv.channelUp();
        System.out.println(captionTv.channel);
        captionTv.displayCaption("Hello World!");
        captionTv.caption = true;
        captionTv.displayCaption("Hello World!");

    }
}

class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        ++ channel;
    }

    void channelDown() {
        -- channel;
    }

}

class CaptionTv extends Tv {
    boolean caption;

    void displayCaption(String text) {
        if (caption)
            System.out.println(text);
    }
}