package day04_code.demo01File;

import java.io.File;

/*
 String[] list(FilenameFilter filter)
          返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 File[] listFiles()
          返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
注意：1.list方法和listfile方法遍历的是构造方法中给出的目录
     2.如果构造方法中给出的目录的路径不存在，会抛出空指针异常
     3.如果构造方法中给出的路径不是一个目录，也会抛出空指针异常

 */
public class Demo06File {
    public static void main(String[] args) {
        show01();
        //show02();
    }



    private static void show02() {
        File f1 = new File("C:\\Windows");
        File[] list = f1.listFiles();
        for (File s : list) {
            System.out.println(s);
        }

    }


    private static void show01() {
        File f1 = new File("C:\\Windows");
        String[] list = f1.list();
        System.out.println(f1);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
