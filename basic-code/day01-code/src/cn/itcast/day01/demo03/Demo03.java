package cn.itcast.day01.demo03;

/*
题目：定义一个方法，打印指定次数的HelloWorld
*/
public class Demo03 {
    public static void main(String[] args) {

        dayin(5);
    }

    public static void dayin(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("Hellow,World" + i);
        }
    }
}
