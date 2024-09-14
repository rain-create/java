package com.javalearning.polymorphicdemo;

public class Test02 {
    public static void main(String[] args) {
        Person p1 = new Person("老王",30);
        Person p2 = new Person("老李",25);

        Animal a = new Dog();
        Animal b = new Cat();
        a.age = 2;
        a.color = "黑";
        b.age = 3;
        b.color = "灰";
      

        p1.keepPet(a,"狗粮");
        p2.keepPet(b,"鱼");
    }
}

