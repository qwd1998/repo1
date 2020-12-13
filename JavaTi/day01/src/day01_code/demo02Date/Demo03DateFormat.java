package day01_code.demo02Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*java.text.DateFormat是日期/时间格式化子类的抽象类，
格式化（也就是日期 -> 文本）、解析（文本-> 日期）
SimpleDateFormat(String pattern)
y  年  Year  1996; 96
M  年中的月份  Month  July; Jul; 07
w  年中的周数  Number  27
W  月份中的周数  Number  2
D  年中的天数  Number  189
d  月份中的天数  Number  10
H  一天中的小时数（0-23）  Number  0
m  小时中的分钟数  Number  30
s  分钟中的秒数  Number  55

* */
public class Demo03DateFormat {
    public static void main(String[] args) throws ParseException {
        //把Fri Sep 11 08:30:45 CST 2020变为2020年09月11日08时35分13秒
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        Date date = new Date();
        String s = format.format(date);
        System.out.println(s);
        //把2020年09月11日08时35分13秒变为Fri Sep 11 08:30:45 CST 2020
        format.parse("2020年09月11日08时30分45秒");
        System.out.println( format.parse("2020年09月11日08时30分45秒"));
        demo01();
    }
    public static void demo01() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的生日日期");
        String i = sc.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = new Date();
        Date date1 = simpleDateFormat.parse(i);
        long time = date1.getTime();
        long time1 = date.getTime();
        long t = time1-time;
        System.out.println(t/1000/24/60/60);

    }
}
