package com.javalearning.abstractdemo;

public abstract class Person {
    //抽象类不能实例化
    //抽象类不一定有抽象方法，有抽象方法的类一定是抽象类
    //可以有构造方法
    //抽象类的子类要么重写重写类中的所有抽象方法，要么是抽象类
    private String name;
    private int age;

    public abstract void work();

    //作用：当创建子类对象时，给属性进行赋值
    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(int age){
        return age;
    }
}
