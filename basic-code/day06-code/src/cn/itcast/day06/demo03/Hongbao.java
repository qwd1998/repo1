package cn.itcast.day06.demo03;

import java.util.ArrayList;

public class Hongbao {
    public static void main(String[] args) {
        Manager ma = new Manager("群主",100);
        Member one =new Member("A",0);
        Member two =new Member("B",0);
        Member three =new Member("C",0);

        ma.show();
        one.show();
        two.show();
        three.show();
        System.out.println(   );
        ArrayList<Integer> redlist =ma.send(20,3);
        one.receive(redlist);
        two.receive(redlist);
        three.receive(redlist);
        ma.show();
        one.show();
        two.show();
        three.show();
    }
}
