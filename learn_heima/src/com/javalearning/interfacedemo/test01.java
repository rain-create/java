package com.javalearning.interfacedemo;

public class test01 {
    public static void main(String[] args) {
        BasketballSporter bs = new BasketballSporter();
        BaskteballCoach bc = new BaskteballCoach();
        PingPangSporter ps = new PingPangSporter();
        PingPangCoach pc = new PingPangCoach();

        bs.study();
        bc.teach();
        ps.study();
        pc.speakEnglish();
    }
}
