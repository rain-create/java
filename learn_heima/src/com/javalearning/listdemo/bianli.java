package com.javalearning.listdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class bianli {
    public static void main(String[] args) {
       /* list五种遍历方式：
        1.迭代器iterator
        2.列表迭代器
        3.简化for
        4.lambda
        5.普通for
            */

        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");

        //1.
        Iterator<String> it = l.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

        //2.列表迭代器格外添加了方法，可以再遍历过程中添加元素
        ListIterator<String> it2 = l.listIterator();
        while(it.hasNext()){
            String str = it2.next();
            if ("b".equals(str)){
                it2.add("e");
            }
        }
        System.out.println(l);

        //3.
        for(String str : l){
            System.out.println(str);
        }

        //4
        l.forEach(s -> System.out.println(s));

        //5
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }



    }
}
