package day05_code.demo02ZIFu;

import java.io.FileReader;
import java.io.IOException;

/*
java.io.Reader
用于读取字符流的抽象类。子类必须实现的方法只有 read(char[], int, int) 和 close()
 int read()
          读取单个字符。
 int read(char[] cbuf)
          将字符读入数组。
abstract  int read(char[] cbuf, int off, int len)
          将字符读入数组的某一部分。
 java.io.FileReader 用来读取字符文件的便捷类
 FileReader(File file)
          在给定从中读取数据的 File 的情况下创建一个新 FileReader。
FileReader(String fileName)
          在给定从中读取数据的文件名的情况下创建一个新 FileReader。


 */
public class ZiFuIO {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt");
        int len = 0;
        char a [] = new char[1024];
        while((len=fr.read(a))!=-1){
            System.out.println(new String(a,0,len));
        }
        fr.close();
    }
}
