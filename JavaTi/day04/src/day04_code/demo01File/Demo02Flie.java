package day04_code.demo01File;

import java.io.File;

/*
路径：
     绝对路径：是一个完整的路径
        以盘符（c：D：）开始的路径，
     相对路径：一个简化的路径
注意：
1.路径是不区分大小写的
2.路径中的文件分隔符\是转义字符，\\是一个普通的反斜杠


File(String pathname)
          通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例
 File(String parent, String child)
          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
          构造方法摘要
File(File parent, String child)
          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。


 */
public class Demo02Flie {
    public static void main(String[] args) {
        show01();
        show02("c:\\","a.txt");
        show03();
    }

    private static void show03() {
        File p1 = new File("wd");
        File p = new File(p1,"wdad");
        System.out.println(p);
    }

    private static void show02(String parent, String child) {
        File file1 = new File(parent,child);
        System.out.println(file1);
    }

    private static void show01() {
        File file =new File("F:\\qycache\\temp_cache");
        System.out.println(file);//重写了toString方法
        File file2 =new File("F:\\qycache\\temp_cache\\a.txt");
        System.out.println(file2);//重写了toString方法
    }
}
