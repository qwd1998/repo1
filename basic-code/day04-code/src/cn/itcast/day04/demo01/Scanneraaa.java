package cn.itcast.day04.demo01;

import java.util.Scanner;

public class Scanneraaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数");
        int a = sc.nextInt();
        System.out.println("输入第二个数");
        int b = sc.nextInt();
        System.out.println("输入第三个数");
        int c = sc.nextInt();
        int max = a;
        if(max<b){
            max = b;
        }
        if (max < c ){
            max = c;
        }
        System.out.println("最大值为"+max);
    }
}
