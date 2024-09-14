package com.javalearning.puzzlegame.ui;

import com.javalearning.puzzlegame.domain.User;
import com.javalearning.puzzlegame.util.CodeUtil;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {

    static ArrayList<User> allUsers = new ArrayList<>();

    static {
        allUsers.add(new User("tyt", "123"));
        allUsers.add(new User("lisi", "123"));
    }

    JButton login = new JButton();
    JButton register = new JButton();

    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JTextField code = new JTextField();

    //验证码
    JLabel rightCode = new JLabel();


    public LoginJFrame() {


        initJFrame();

        initView();

        this.setVisible(true);
    }

    public void initJFrame() {
        //创建登录模式
        this.setSize(488, 430);
        //设置界面的标题
        this.setTitle("log in");

        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);//页面居中

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭模式

        this.setVisible(true);//页面显示，建议放最后
    }

    public void initView() {
        //1.添加用户名文字
        JLabel usernameTest = new JLabel(new ImageIcon("image\\login\\用户名.png"));
        usernameTest.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameTest);

        //2.添加用户名输入框
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //验证码提示
        JLabel codeText = new JLabel(new ImageIcon("image\\login\\验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(code);

        //验证码的输入框
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);

        String codeStr = CodeUtil.getCode();
        //设置内容
        rightCode.setText(codeStr);
        //绑定鼠标时间
        rightCode.addMouseListener(this);
        rightCode.setBounds(300, 256, 50, 30);
        this.getContentPane().add(rightCode);

        //5.添加登录按钮
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("image\\login\\登录按钮.png"));
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        login.addMouseListener(this);
        this.getContentPane().add(login);

        //6.添加注册按钮
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("image\\login\\注册按钮.png"));
        register.setBorderPainted(false);
        register.setContentAreaFilled(false);
        register.addMouseListener(this);
        this.getContentPane().add(register);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == login) {
            System.out.println("点击了登录按钮");
            //获取文本框中的输入内容
            String usernameInput = username.getText();
            String passwordInput = password.getText();
            //获取用户输入的验证码
            String codeInput = code.getText();

            //创建一个User对象
            User userInfo = new User(usernameInput, passwordInput);
            System.out.println("用户输入的用户名为" + usernameInput);
            System.out.println("用户输入的密码为" + passwordInput);

            if(codeInput.length() == 0){
                showJDialog("验证码不能为空");
            }else if(usernameInput.length() == 0 || passwordInput.length() == 0){
                System.out.println("用户名或者密码为空");
                showJDialog("用户名或者密码为空");
            }else if(!codeInput.equalsIgnoreCase(rightCode.getText())){
                showJDialog("验证码输入错误");
            }else if(contains(userInfo)){
                System.out.println("都正确");
                //关闭登录界面
                this.setVisible(false);
                new GameJFrame();
            }else{
                System.out.println("用户名活密码错误");
                showJDialog("用户名或密码错误");
            }


        } else if (e.getSource() == register) {
            System.out.println("点击了注册");
        }else if (e.getSource() == rightCode){
            System.out.println("更换验证码");
            //获取一个新的验证码
            String code = CodeUtil.getCode();
            rightCode.setText(code);
        }
    }

    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        jDialog.setSize(200,150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);

        //创建JLabel对象管理文字并添加到弹框中
        JLabel warning  = new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);

    }

    //按下不松
    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getSource() == login){
            login.setIcon(new ImageIcon("image\\login\\登录按下.png"));
        }else if (e.getSource() == register){
            register.setIcon((new ImageIcon("image\\login\\注册按下.png")));
        }
    }
    //松开按钮
    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getSource() == login){
            login.setIcon(new ImageIcon("image\\login\\登录按钮.png"));
        }else if (e.getSource() == register){
            register.setIcon((new ImageIcon("image\\login\\注册按钮.png")));
        }
    }

    //鼠标划入
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    //鼠标划出
    @Override
    public void mouseExited(MouseEvent e) {

    }

    //判断用户在集合中是否存在
    public boolean contains(User userInput){
        for (int i = 0; i < allUsers.size(); i++) {
            User rightUser = allUsers.get(i);
            if(userInput.getUsername().equals(rightUser.getUsername()) && userInput.getPassword().equals(rightUser.getPassword())){
                return true;
            }
        }
        //循环结束后之后还没有找到就表示不存在
        return false;
    }
}
