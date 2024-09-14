package com.javalearning.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test01 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<>();
        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("javaee");

        //返回此集合中元素的迭代器，通过iterator()方法得到
        Iterator<String> it = c.iterator();

        //用whiLe循环改进元素的判断和读取 hasNext()判断当前位置是否有元素可以被取出
        while(it.hasNext()){
            String s = it.next();
            //删除java
            if("java".equals(s))
                it.remove();


        }
        System.out.println(c);

        //简化版for循环写法
        for(String str : c){
            System.out.println(str);
        }
    }
}
