package day04_code.demo02;

import java.io.File;

/*
练习：递归打印多级目录
需求：
遍历D:\照片下的所有文件和文件夹
    D:\照片\14513506_1350626471826.jpg
    D:\照片\25030152_1381381780_ospp.jpg
    D:\照片\5791d82d4de35.jpg
    D:\照片\5791d834ccc92.jpg
    D:\照片\b7fd5266d01609248db821b1d60735fae7cd34fe.jpg
    D:\照片\1878505560,2417124597&fm=214&gp=0.jpg
    D:\照片\新建文件夹\新建文件夹\新建文本文档 (2).txt
    D:\照片\新建文件夹\新建文件夹\新建文本文档.txt
 */
public class Recurison02 {
    public static void main(String[] args) {
        sum1(new File("D:\\照片"));
    }

    private static File sum1(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                sum1(file1);
            } else {
                System.out.println(file1);
            }

        }

        return file;
    }
}
