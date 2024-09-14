package com.javalearning.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class simpleDateFormat {
    public static void main(String[] args) throws ParseException {
         /*
            public simpleDateFormat() 默认格式
            public simpleDateFormat(String pattern) 指定格式
            public final string format(Date date) 格式化(日期对象 ->字符串)
            public Date parse(string source) 解析(字符串 ->日期对象)
        */

        String str1 = "2023-11-11 11:11:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(str1);
        System.out.println(date);
        System.out.println("----------------");

        String str2="2001-01-10";
        SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf1.parse(str2);
        System.out.println(date1);

        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf2.format(date1);
        System.out.println(result);

    }
}
