package day04_code.demo01File;

import java.io.File;
import java.io.IOException;

/*
 boolean createNewFile()
          当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
 boolean delete()
          删除此抽象路径名表示的文件或目录。
 boolean mkdir()  单级文件夹
          创建此抽象路径名指定的目录。
 boolean mkdirs()  多级文件夹
          创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。



 */
public class Demo05Flie {
    public static void main(String[] args) throws IOException {
        show01();
        /*show02();
        show03();*///直接删除，不走回收站，不能删除带内容的文件夹
        
    }

    private static void show03() {
        File file = new File("C:\\Windows\\ES4\\b.txt");
        boolean path = false;
        path = file.delete();
        System.out.println(path);

        File file1 = new File("c.txt");
        boolean path1 = file1.delete();
        System.out.println(path1);
    }

    private static void show02() {
        File file = new File("C:\\Windows\\ES4\\新建文件夹2");
        boolean path = false;
        path = file.mkdir();
        System.out.println(path);

        File file1 = new File("ES41");
        boolean path1 = file1.mkdir();
        System.out.println(path1);
    }

    private static void show01() throws IOException {
        File file = new File("C:\\Windows\\ES4\\b.txt");
        boolean path = false;
        path = file.createNewFile();
        System.out.println(path);

        File file1 = new File("ES4");
        boolean path1 = file1.createNewFile();
        System.out.println(path1);
    }
}
