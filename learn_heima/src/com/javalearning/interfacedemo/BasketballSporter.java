package com.javalearning.interfacedemo;

public class BasketballSporter extends Sporter{
    public BasketballSporter(){}

    public BasketballSporter(String name, int age){
        super(name,age);
    }
    @Override
    public void study() {
        System.out.println("篮球运动员在学打篮球");
    }
}
