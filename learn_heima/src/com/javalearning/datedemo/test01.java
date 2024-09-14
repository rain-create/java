package com.javalearning.datedemo;

import java.util.Date;

public class test01 {
    public static void main(String[] args) {
        //显示当前时间
        System.out.println(new Date());
        System.out.println("-----------------");

        //常用方法，1.获取时间,获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
        Date d = new Date();
        System.out.println(d.getTime());

        //2.设置时间
        long time  = System.currentTimeMillis();
        d.setTime(time);
        System.out.println(time);
        System.out.println(d);

    }
}
