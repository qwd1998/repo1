package cn.itcast.day04.demo01;
import java.util.Scanner;
/*Scanner类的功能：可以实现键盘输入数据到程序中
引用类型的一般使用步骤：
1.导包
import 包路径.类名称；
如果在同一个包里，可以省略
只有java.lang包下的内容不需要导包，其他需要

2.创建
类名称 对象名 = new 类名称（）；

3.使用
 对象名.成员方法名（）
 获取键盘输入的int值 int num = sc.nextInt();
 获取键盘输入的字符串值 String str = sc.next();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //System.in 从键盘进行输入
        Scanner sc = new Scanner(System.in);

        //获取键盘输入的int数字
        int num = sc.nextInt();
        System.out.println("输入的数据为："+num);

        //获取键盘输入的字符串
        String str = sc.next();
        System.out.println("键盘输入的字符串为："+str);

    }
}
