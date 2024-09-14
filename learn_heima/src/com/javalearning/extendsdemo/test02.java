package com.javalearning.extendsdemo;

import org.w3c.dom.ls.LSOutput;

public class test02 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.eat();
    }
}

class Animal {
    public Animal eat() {
        System.out.println("吃饭");
        return null;
    }

    public void drink() {
        System.out.println("喝开水");
    }
}

class Cat extends Animal {
    public void lunch() {
        System.out.println("吃罐头");
    }
}


class Dog extends Animal {
    //方法的重写：父类无法满足子类要求
    //重写方法的名称、形参列表必须与父类中的一致
    //子类重写父类方法时，访问权限子类必须大于等于父类
    //子类重写父类方法时，返回值类型子类必须小于等于父类
    //只有被添加到虚方法表中的方法才能被重写
    @Override
    public Dog eat() {
        System.out.println("吃狗粮");
        return null;
    }
}

