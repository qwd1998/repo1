package cn.itcast.day04.demo01;

import java.util.Scanner;

/*
题目：键盘输入3个int数字，然后求出最大值

思路：1.  3个数字 需要3次nextInt（）；
2.无法同时判断三个数字最大值，所以分两个数字，
先判断前两个，再比较最后一个
 */
public class Demo03Scannermax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字");
        int c = sc.nextInt();
        //首先得到前两个书最大值
       /* int temp,max;
        if(a > b){
            temp = a;
        }else{
            temp =b;
        }
        if(temp >c){
            max = temp;
        }else{
            max = c;
        }  第一种方法*/
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大值为：" + max);
    }
}
