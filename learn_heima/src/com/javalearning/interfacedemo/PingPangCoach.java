package com.javalearning.interfacedemo;

public class PingPangCoach extends Coach implements English{
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在说英语");
    }


    @Override
    public void teach() {
        System.out.println("乒乓球教练在教乒乓球");
    }
}
