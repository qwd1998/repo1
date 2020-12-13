package day04_code.demo01File;

import java.io.File;

/*
 String getAbsolutePath()
          返回此抽象路径名的绝对路径名字符串。
 String getPath()
          将此抽象路径名转换为一个路径名字符串。
 String getName()
          返回由此抽象路径名表示的文件或目录的名称。
 long length()
          返回由此抽象路径名表示的文件的长度 
 */
public class Demo03File {
    public static void main(String[] args) {
        //show01();
        //show02();
        //show03();
        show04();


    }

    private static void show04() {
        File file = new File("F:\\qycache\\temp_cache\\a.txt");
        long path = file.length();
        System.out.println(path);

        File file1 = new File("F:\\qycache\\temp_cache");
        long path1 = file1.length();
        System.out.println(path1);
    }

    private static void show03() {
        File file = new File("F:\\qycache\\temp_cache\\a.txt");
        String path = file.getName();
        System.out.println(path);

        File file1 = new File("F:\\qycache\\temp_cache");
        String path1 = file1.getName();
        System.out.println(path1);
    }

    private static void show02() {
        File file = new File("F:\\qycache\\temp_cache\\a.txt");
        String path = file.getPath();
        System.out.println(path);

        File file1 = new File("a.txt");
        String path1 = file1.getPath();
        System.out.println(path1);
    }

    private static void show01() {
        File file = new File("F:\\qycache\\temp_cache");
        String path = file.getAbsolutePath();
        System.out.println(path);

        File file1 = new File("temp_cache");
        String path1 = file1.getAbsolutePath();
        System.out.println(path1);
    }
}
