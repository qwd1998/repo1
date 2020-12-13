package day07_code.demo06FFyingyong;

import day07_code.demo07FFyingyong.IntBuilder;

/*
类的构造器引用
 */
public class Demo {
    public static void main(String[] args) {
        meth(Perso::new);
    }
    public static void meth(PersonBuilder pb){
        Perso perso = pb.bulider("我的");
        System.out.println(perso);
    }

}
