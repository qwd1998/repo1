package cn.itcast.day04.demo02;

import java.util.Scanner;

/*
创建对象的标准
类名称 对象名 = new 类名称（）；
匿名对象就是只有右边的对象，没有左边的名字和运算符
格式： new 类名称（）；
匿名对象只能使用一次，下次再用还要创建
 */
public class Demo02Anonymous {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("数字为："+ num);*/
       /* int num = new Scanner(System.in).nextInt();
        System.out.println("输出值为："+num); 匿名输出Scanner*/

       Param(new Scanner(System.in));//使用匿名对象进行传递参数
        /*Scanner sc = new Scanner(System.in);
        Param(sc);        一般写法传递参数*/

        Scanner sc = Param1();
        int num =sc.nextInt();
        System.out.println("返回值为："+num );
    }
    public static void Param(Scanner sc){
        int i = sc.nextInt();
        System.out.println("输入的是："+i);
    }
    public static Scanner Param1(){
        return new Scanner(System.in);  //使用匿名对象进行返回值
        /*Scanner sc = new Scanner(System.in);
        return sc;   一般形式进行返回值*/

    }
}

