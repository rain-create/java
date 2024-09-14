package com.javalearning.listdemo;

import java.util.ArrayList;
import java.util.List;

public class test01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        list.remove(1);
        list.set(0,"b");
        System.out.println(list.get(0));
        System.out.println(list);
    }
}
