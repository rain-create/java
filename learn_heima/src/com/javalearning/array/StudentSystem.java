package com.javalearning.array;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("---------------Welcome to SEU management-------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.exit");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("exit");
                    //break loop; //单写break只跳出单层switch循环，loop相当于别名
                    System.exit(0); //停止虚拟机运行
                }
                default -> System.out.println("没有该选择");
            }
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        System.out.println("add");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id");
            String id = sc.next();
            if (getIndex(list, id) != -1) {
                System.out.println("id已经存在，请重新输入");
            } else {
                break;
            }
        }
        String id = sc.next();


        System.out.println("姓名");
        String name = sc.next();

        System.out.println("年龄");
        int age = sc.nextInt();

        System.out.println("家庭住址");
        String address = sc.next();

        Student s = new Student(id, name, age, address);
        list.add(s);
    }

    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("delete");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index != -1) {
            list.remove(index);
        } else {
            System.out.println("不存在！");
        }
    }

    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("update");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index != -1) {
            list.remove(index);
            addStudent(list);
        } else {
            System.out.println("不存在！");
        }


    }

    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("query");

        if (list.size() == 0) {
            System.out.println("当前无数据");
            return;
        } else {
            System.out.println("id\t姓名\t年龄\t家庭住址");
            for (int i = 0; i < list.size(); i++) {
                Student stu = list.get(i);
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
            }

        }
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }


}



