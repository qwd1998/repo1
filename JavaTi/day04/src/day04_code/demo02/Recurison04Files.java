package day04_code.demo02;

import java.io.File;
import java.io.FileFilter;

/*
练习：递归打印多级目录
需求：
遍历D:\照片下的txt文件
D:\照片\新建文件夹\新建文件夹\新建文本文档 (2).txt
D:\照片\新建文件夹\新建文件夹\新建文本文档.txt


 File[] listFiles(FileFilter filter)  FileFilter 用于抽象路径名的过滤器。
          返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
        抽象方法：boolean accept(File pathname)
                    测试指定抽象路径名是否应该包含在某个路径名列表中。

 File[] listFiles(FilenameFilter filter)   FilenameFilter实现此接口的类实例可用于过滤器文件名
          返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
            抽样方法：boolean accept(File dir, String name)
                      测试指定文件是否应该包含在某一文件列表中。
 注意：两个过滤器没有实现类的，需要我自己写实现类，并且重写accept方法

 */
public class Recurison04Files {
    public static void main(String[] args) {
        sum1(new File("D:\\照片"));
    }

    private static void sum1(File file) {
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
            if(pathname.isDirectory()){
                return true;
            }
                return pathname.getName().endsWith(".txt");
            }
        });
        /*File[] files = file.listFiles(new Rdemo05());*/
        //Lambda方法
        /*File[] files = file.listFiles((File pathname)->
                 pathname.isDirectory()||pathname.getName().endsWith(".txt")
        );*/
            /*System.out.println(file);*/
        //System.out.println(file);
        for (File file1 : files) {
            if (file1.isDirectory()) {
                sum1(file1);
            } else {
                /*String name = file1.getName();
                boolean b = name.endsWith(".txt");
                if (b){*/
                System.out.println(file1);
            }
           // }

        }
    }
}
