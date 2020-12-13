package day03_code.demo01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Demo02yichang {
    public static void main(String[] args) throws IOException {
        // readFile("c://a.txt");//发生错误后，后续程序不能执行
        try {//出错时，后续代码可以执行
            readFile("c://a.tx");
        } catch (FileNotFoundException e) {
            System.out.println("传递的文件后缀不对");
            // System.out.println(e.getMessage());//传递的文件不是c://a.txt
            //  System.out.println(e.toString());//java.io.FileNotFoundException: 传递的文件不是c://a.txt
            //  e.printStackTrace();
        } finally {
            System.out.println("总是执行");//无论程序是否异常，最后都要进行资源释放（IO）
        }
        System.out.println("后续代码");
    }

    private static void readFile(String filename) throws IOException {
        if (!filename.equals("c://a.txt")) {
            //编译异常，使用throws，必须处理,交给JVM处理
            throw new FileNotFoundException("传递的文件不是c://a.txt");
        }
        System.out.println("路径没有问题，读取文件");
        if (!filename.endsWith(".txt")) {
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("打开正确文件");

    }

}
