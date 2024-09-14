package com.javalearning.datedemo;

import java.util.ArrayList;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        //键盘录入一些1~100之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
        //1.创建一个集合
        ArrayList<Integer> list =new ArrayList<>();
        //2.键盘录入数据到集合中
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);
            if(num<1||num>100){
                System.out.println("输入数据范围不对，请重新输入");
                continue;
            }
            list.add(num);
            int sum = getSum(list);
            if(sum>200){
                System.out.println("集合中所有数据和已经满足要求");
                break;
            }
        }

    }
    private static  int getSum(ArrayList<Integer> list){
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            sum = sum+num;
        }
        return sum;
    }
}
