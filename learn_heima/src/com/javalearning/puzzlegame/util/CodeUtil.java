package com.javalearning.puzzlegame.util;

import java.util.ArrayList;
import java.util.Random;

public class CodeUtil {
    //验证码生成
    public static String getCode() {
        //1.创建一个集合
        ArrayList<Character> list = new ArrayList<>();//索引范围0-51

        //2.添加大小写字母
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }

        //3.生成4个随机字母
        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(list.size());
            char c = list.get(randomIndex);
            result = result + c;
        }

        //4.拼接数字
        int number = r.nextInt(10);
        result = result + number;
        //5.将字符串变成字符数组
        char[] chars = result.toCharArray();
        //6.随机交换数字位
        int index = r.nextInt(chars.length);
        char temp = chars[4];
        chars[4] = chars[index];
        chars[index] = temp;

        String code = new String(chars);
        return code;

    }
}
