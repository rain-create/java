package com.javalearning.staticdemo;

public class Student {
    private String name;
    private int age;
    private String gender;
    public static String teacherName;

    public static void method() {
        //静态方法只能访问静态变量和静态方法
        //静态方法没有this关键字
        System.out.println("静态方法");
    }


    //非静态有this关键字，this由虚拟机赋值

    public void show1(Student this) {
        System.out.println("this:" + this);
        System.out.println(name + "," + age +
                "," + teacherName);
    }

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
