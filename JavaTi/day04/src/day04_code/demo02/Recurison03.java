package day04_code.demo02;

import java.io.File;

/*
练习：递归打印多级目录
需求：
遍历D:\照片下的txt文件
D:\照片\新建文件夹\新建文件夹\新建文本文档 (2).txt
D:\照片\新建文件夹\新建文件夹\新建文本文档.txt

 */
public class Recurison03 {
    public static void main(String[] args) {
        sum1(new File("D:\\照片"));
    }

    private static File sum1(File file) {
            /*System.out.println(file);*/
        File[] files = file.listFiles();
        System.out.println(file);
        for (File file1 : files) {
            if (file1.isDirectory()) {
                sum1(file1);
            } else {
                String name = file1.getName();
                boolean b = name.endsWith(".txt");
                if (b){
                System.out.println(file1);}
            }

        }

        return file;
    }
}
