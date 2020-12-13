package cn.itcast.day01.demo02;

public class Demo02 {
    public static void main(String[] args) {
        /*for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                System.out.print("*");
            }System.out.println();
        }*/

        De();
        System.out.println("----------------------------------------------——");
        System.out.println("|手机商品列表                                    |");
        System.out.println("------------------------------------------------");
        System.out.println("|商品编号            |商品名称           |单价（元）|");
        System.out.println("------------------------------------------------");
        System.out.println("|1309203928         |荣耀10青春版       |1299.00 |");
        System.out.println("------------------------------------------------");
        System.out.println("|1309203928         |荣耀9青春版        |1289.00 |");
        System.out.println("------------------------------------------------");
        System.out.println("|1309203928         |荣耀8青春版        |1279.00 |");
        System.out.println("------------------------------------------------");
        System.out.println("|1309203928         |荣耀7青春版        |1269.00 |");
        System.out.println("------------------------------------------------");
        System.out.println("|1309203928         |荣耀6青春版        |1259.00 |");
        System.out.println("------------------------------------------------");
    }


    public static void De() {
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                System.out.print("*");
            }System.out.println();
        }
    }
}