package com.javalearning.datedemo;

import java.sql.SQLOutput;
import java.util.Calendar;

public class calendar {
    public static void main(String[] args) {
        //1.获取一个GregorianCalendar对象
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        //2.获取属性
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH)+1;
        int day = instance.get(Calendar.DAY_OF_MONTH);
        int hour = instance.get(Calendar.HOUR);
        int minute= instance.get(Calendar.MINUTE);
        int second = instance.get(Calendar.SECOND);

        int week =instance.get(Calendar.DAY_OF_WEEK);//返回1-7
        System.out.println(year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒");
        System.out.println(getWeek(week));

    }

    public static String getWeek(int w){
        String[] weekArray = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return weekArray[w-1];
    }

}
