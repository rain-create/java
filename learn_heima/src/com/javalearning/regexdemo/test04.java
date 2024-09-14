package com.javalearning.regexdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test04 {
    public static void main(String[] args) throws IOException{
        //爬网址数据
          /* 扩展需求2:
            把连接:https://m.sengzan.com/jiaoyu/29104.html?ivk sa=1025883i
            中所有的身份证号码都爬取出来。
        */

        //创建一个URL对象
        URL url = new URL("https://m.sengzan.com/jiaoyu/29104.html?ivk sa=1025883i");
        //创建一个对象去读取网络中的数据
        URLConnection conn = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String line;
        String regex ="[1-9]\\d{17}";
        Pattern pattern = Pattern.compile(regex);
        while((line = br.readLine()) != null){
            Matcher  matcher = pattern.matcher(line);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }
        br.close();
    }



}
