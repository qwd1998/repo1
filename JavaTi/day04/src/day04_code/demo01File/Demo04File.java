package day04_code.demo01File;

import java.io.File;
import java.io.IOException;

/*
boolean exists()
          测试此抽象路径名表示的文件或目录是否存在。
 boolean isDirectory()
          测试此抽象路径名表示的文件是否是一个目录。
 boolean isFile()
          测试此抽象路径名表示的文件是否是一个标准文件。

 */
public class Demo04File {
    public static void main(String[] args) throws IOException {
       // show01();
        show02();
    }

    private static void show02() throws IOException {
        File file = new File("C:\\Windows\\ES4\\c.txt");
        boolean newFile = file.createNewFile();
        if (file.exists()){
        boolean path = file.isDirectory();
        boolean file2 = file.isFile();
        System.out.println(path);
        System.out.println(file2);
        }
        File file1 = new File("c.txt");
        if (file1.exists()){
        boolean path1 = file1.isDirectory();
        System.out.println(path1);}
    }

    private static void show01() {
        File file = new File("C:\\Windows\\ES4\\a.txt");
        boolean path = file.exists();
        System.out.println(path);

        File file1 = new File("a.txt");
        boolean path1 = file1.exists();
        System.out.println(path1);
    }
}
