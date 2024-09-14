package com.javalearning.listdemo;

import java.util.LinkedList;

public class test02 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        list.addFirst("a");//从索引第一位添加
        list.addLast("d");//从索引最后一位添加
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }
}
