package com.javalearning.datedemo;

public class test03 {
    public static void main(String[] args) {
        /*
            自己实现parseInt方法的效果，将字符串形式的数据转成整数。要求:
            字符串中只能是数字不能有其他字符最少一位，最多10位日不能开头
        */

        String str = "123";
        if(!str.matches("[1-9]\\d{0,9}")){
            System.out.println("输入的数字格式有误");
        } else  {
            int number = 0;
            for (int i = 0; i < str.length(); i++) {
                int temp = str.charAt(i)-'0';
                number = temp+number*10;
            }
            System.out.println(number);
        }


    }
}
