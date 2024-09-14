package com.javalearning.array;

import java.util.ArrayList;

public class ArrayDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //1.添加元素
        list.add("tyt");
        list.add("dqq");
        list.add("zyy");

        //2.delete
        boolean result1 = list.remove("tyt");
        System.out.println(result1);

        //3.改
        String result2 = list.set(0,"ttt");
        System.out.println(result2);

        //4.查询
        String s = list.get(0);
        System.out.println(s);

        //工具类的使用
        int[] arr1 = {1,2,3,4,5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);
        double avg= ArrayUtil.getAverage(arr1);
        System.out.println(avg);


    }




}
