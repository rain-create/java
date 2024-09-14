package com.javalearning.polymorphicdemo;

public class Test01 {
    public static void main(String[] args) {

        //引用数据类型转换   1.自动类型转换
        Animal a = new Dog();
        // 多态
        // 调用成员变量：编译看左边，运行也看左边
        // 调用成员方法：编译看左边，运行看右边

        // 多态弊端：不能调用子类的特有功能。
        // 在编译成员方法时看左边的父类无此方法，直接报错
        // 解决方法：强制类型转换
        System.out.println(a.name);//动物
        //多态优势：方法中，使用父类型作为参数，能接收所有的子类对象
        a.show();                  //Dog---show方法

        //引用数据类型转换   2.强制类型转换
        //类型转换   instanceof判断是不是该类
        if (a instanceof Dog d) {
            d.lookhome();
        } else if (a instanceof Cat c) {
            c.catchMouse();
        } else {
            System.out.println("不存在该类型");
        }
        Dog d = (Dog) a;
        d.lookhome();
    }
}

class Animal {
    String name = "动物";
    String color = "null;";
    int age;

    public void show() {
        System.out.println("Animal--show方法");
    }

    public void eat(String food) {
        System.out.println("在吃" + food);
    }

    public Animal() {

    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class Dog extends Animal {
    String name = "狗";

    public void lookhome() {
        System.out.println("Dog--看家");
    }

    @Override
    public void show() {
        System.out.println("Dog---show方法");
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }


}

class Cat extends Animal {
    String name = "猫";

    public void catchMouse() {
        System.out.println("cat--抓老鼠");
    }
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫侧着头吃" + something );
    }
}

class Person {
    String name = "饲养员";
    int age;

    public void keepPet(Animal a, String food) {
        if (a instanceof Dog d) {
            System.out.println("年龄为" + age + "的" + name + "养了一只" + d.color + "的" + d.age + "岁的狗");
            d.eat(food);
        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + age + "的" + name + "养了一只" + c.color + "的" + c.age + "岁的猫");
            c.eat(food);
        } else {
            System.out.println("没有该种动物");
        }
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
