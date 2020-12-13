package day01_code.demo03Calendar;

import java.sql.SQLOutput;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

/*
Calendar 类是一个抽象类，不能直接使用
Calendar 的 getInstance 方法返回一个 Calendar 对象，其日历字段已由当前日期和时间初始化：

     Calendar rightNow = Calendar.getInstance();

* */
public class Demo01 {
    public static void main(String[] args) {
        /*Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow);
*/
        demo01();
        demo02();
    }
    private static void demo01(){
        //使用getInstance获取Calendar
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DATE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
    private static void demo02(){
        // publc void set(int field,int value)
        //给日期设置为定值的方法
        Calendar c = Calendar.getInstance();
       // c.set(Calendar.YEAR,2099);
       // c.set(Calendar.YEAR,2, Calendar.MONTH,20,Calendar.DATE,33);
        c.add(Calendar.DATE,1);//增加年或者减少：-负值
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int day = c.get(Calendar.DATE);

        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

        Date time = c.getTime();
        System.out.println(time);//日历转换为日期
    }
}
