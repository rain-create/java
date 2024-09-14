package com.javalearning.puzzlegame.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setSize(603, 680);

        jFrame.setTitle("事件演示");

        jFrame.setAlwaysOnTop(true);

        jFrame.setLocationRelativeTo(null);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中，取消了才会按照XY轴的形式添加组件
        jFrame.setLayout(null);

        //创建一个按钮对象
        JButton jtb = new JButton("点我");
        jtb.setBounds(0,0,100,50);

        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("憋点");
            }
        });

        //把按钮添加到界面
        jFrame.getContentPane().add(jtb);
        jFrame.setVisible(true);
    }
}
