package com.javalearning.mapdemo;

import java.util.*;

public class test02 {
    public static void main(String[] args) {
        //统计投票{A,B,C,D}数量并求最大值
        String[] arr = {"A", "B", "C", "D"};
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (map.containsKey(s)) {
                //如果已有该值，则value+1
                map.put(s, map.get(s) + 1);

            } else {
                //没有则放入，次数为1
                map.put(s, 1);
            }
        }
        System.out.println(map);

        int max = 0;
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        for (Map.Entry<String, Integer> en : entry) {
            int count = en.getValue();
            if (count > max)
                max = count;
        }
        System.out.println(max);

        for (Map.Entry<String, Integer> en : entry) {
            int count = en.getValue();
            if (count == max)
                System.out.println(en.getKey()333333333333333333333333333);
        }
    }
}
