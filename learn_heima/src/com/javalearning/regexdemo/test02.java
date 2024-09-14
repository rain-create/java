package com.javalearning.regexdemo;

public class test02 {
    public static void main(String[] args) {
        /*
            正则表达式练习:
            需求
            请编写正则表达式验证用户名是否满足要求。要求:大小写字母，数字，下划线一共4-16位
            请编写正则表达式验证身份证号码是否满足要求。
            简单要求:
                18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
            复杂要求:
                按照身份证号码的格式严格要求。

            身份证号码:
            41080119930228457x
            510801197609022309
            15040119810705387X
            130133197204039024 I
            430102197606046442
        */

        //用户名
        String regex1 ="\\w{4,16}";

        //身份证号简单校验
        String regex2 = "[1-9]\\d{16}(\\d|X|x)";
        String regex3 = "[1-9]\\d{16}(\\d(?)x)";//忽略x大小写
        System.out.println("41080119930228457x".matches(regex2));
        System.out.println("510801197609022309".matches(regex2));
        System.out.println("15040119810705387X".matches(regex2));
        System.out.println("130133197204039024".matches(regex2));
        System.out.println("430102197606046442".matches(regex2));
        System.out.println("--------------------------------");

        //严格校验
        //[18-20]报错是因为表示在‘1’‘8’'-''2''0'中选择一个字符，而不是期望的18|19|20
        String regex4 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dXx]";
        System.out.println("41080119930228457x".matches(regex4));
        System.out.println("510801197609022309".matches(regex4));
        System.out.println("15040119810705387X".matches(regex4));
        System.out.println("130133197204039024".matches(regex4));
        System.out.println("430102197606046442".matches(regex4));
    }


}
