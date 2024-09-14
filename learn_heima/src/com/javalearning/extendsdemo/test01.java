package com.javalearning.extendsdemo;

public class test01 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }

}

class Fu{
    String name = "Fu";
}

class Zi extends Fu{
    String name = "Zi";
    public void ziShow(){
        String name = "ziShow";
        System.out.println(name);       //就近原则ziShow
        System.out.println(this.name);  //全局变量Zi
        System.out.println(super.name); //父类Fu
    }
}

