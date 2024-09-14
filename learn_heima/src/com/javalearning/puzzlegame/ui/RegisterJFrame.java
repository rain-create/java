package com.javalearning.puzzlegame.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //注册相关代码
    private void RegisterJFrame() {
        this.setSize(488, 500); //设置界面大小

        this.setTitle("Register");//设置标题

        this.setAlwaysOnTop(true);//设置界面置顶

        this.setLocationRelativeTo(null);//页面居中

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭模式

        this.setVisible(true);//页面显示，建议放最后

        getContentPane();//初始化一个容器
    }
}
