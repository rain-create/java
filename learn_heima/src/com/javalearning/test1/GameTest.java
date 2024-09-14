package com.javalearning.test1;

public class GameTest {
    public static void main(String[] args) {
        Role role1 = new Role("henny", 100, '男');
        Role role2 = new Role("sun", 100,'女');
        System.out.println(role1.toString());
        System.out.println(role2.toString());
        while (true) {
            role1.attack(role2);
            if (role2.getBlood() == 0) {
                System.out.println(role1.getName() + "K.O." + role2.getName());
                break;
            }
            role2.attack(role1);
            if (role1.getBlood() == 0) {
                System.out.println(role2.getName() + "K.O." + role1.getName());
                break;
            }

        }
    }
}
