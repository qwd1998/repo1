package day01_code.DOUdizhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demodou {
    public static void main(String[] args) {
        //1.准备牌
        ArrayList<String> poker = new ArrayList<>();

        //定义两个数组，一个存花色，一个存数字
        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] number = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        poker.add("大王");
        poker.add("小王");
        for (String num : number) {
            for (String color : colors) {
                //System.out.println(color+num);
                //吧组装好的牌放进poker集合中
                poker.add(color + num);
            }
        }
        //2.洗牌  使用Collection中的方法shuffle
        Collections.shuffle(poker);


        //3. 发牌  定义4个集合 代表玩家和底牌

        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> di = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String s = poker.get(i);
            if (i >= 51) {
                di.add(s);
            } else if (i % 3 == 0) {
                p1.add(s);
            } else if (i % 3 == 1) {
                p2.add(s);
            } else if (i % 3 == 2) {
                p3.add(s);
            }
        }
        System.out.println("盖伦"+p1);
        System.out.println();
        System.out.println("皇子"+p2);
        System.out.println();
        System.out.println("赵信"+p3);
        System.out.println();
        System.out.println(di);
        System.out.println();


    }
}
