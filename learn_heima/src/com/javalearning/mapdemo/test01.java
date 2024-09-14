package com.javalearning.mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class test01 {
    public static void main(String[] args) {
        //map的遍历


        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");

        //1.遍历1，根据key查找value
        Set<String> keySet = map.keySet();
        //增强for循环
        for (String s : keySet) {
            System.out.println(map.get(s));
        }

        //lambda
        keySet.forEach(s -> System.out.println(map.get(s)));

        //迭代器
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(map.get(str));
        }

        System.out.println("_____________________");

        //2.遍历2 entrySet,获取所有键值对集合
        Set<Map.Entry<String, String>> enrty = map.entrySet();
        for (Map.Entry<String, String> en : enrty) {
            String key = en.getKey();
            String value = en.getValue();
            System.out.println(key + "=" + value);

        }

        System.out.println("--------------------");

        //3.利用lambda表达式进行遍历
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "+" + value);
            }
        });

        map.forEach((key, value) -> System.out.println(key + "+" + value));


    }
}
