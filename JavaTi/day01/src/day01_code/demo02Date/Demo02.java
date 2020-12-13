package day01_code.demo02Date;

import java.util.Date;

public class Demo02 {
    public static void main(String[] args) {
        demo01();
        demo02();
    }
    private static void demo01(){
        Date date = new Date();
        System.out.println(System.currentTimeMillis());
        System.out.println(date.getTime());//与上方System.currentTimeMillis()等效
        System.out.println(date);
    }
    private static void demo02(){
        Date date = new Date(1599739891521L);//把ms转换为现在的日期
        System.out.println(date);
    }
}
