package com.javalearning.interfacedemo;

public class BaskteballCoach extends Coach{

    public BaskteballCoach() {
    }

    public BaskteballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练在教篮球");
    }
}
