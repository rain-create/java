package com.javalearning.staticdemo;

import java.util.ArrayList;

public class test01 {
    public static void main(String[] args) {
        //创建集合存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        //创建3个学生对象
        Student stu1 = new Student("zhanyu", 21, "女");
        Student stu2 = new Student("wangwu", 22, "男");
        Student stu3 = new Student("lisan", 32, "女");

        //蒋对象添加到集合
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);
        //1.静态变量类名调用（推荐）
        Student.teacherName = "LL";
        Student s1 = new Student();
        System.out.println("s1"+s1);
        s1.setName("aa");
        s1.setAge(22);
        s1.setGender("女");
        //2.静态变量对象名调用
        s1.teacherName = "LL";
        s1.show1();

        Student s2 = new Student();
        System.out.println("s2"+s2);
        s2.setName("aa");
        s2.setAge(22);
        s2.setGender("女");
        s2.show1();
//        s2.teacherName = "LL";

    }
}
