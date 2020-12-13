package day05_code.demo05InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
继承者 java.io.InputStreamReader
InputStreamReader 是字节流通向字符流的桥梁


void close()
          关闭此输出流并释放与此流有关的所有系统资源。
 void flush()
          刷新此输出流并强制写出所有缓冲的输出字节。
 void write(byte[] b)
          将 b.length 个字节从指定的 byte 数组写入此输出流。
 void write(byte[] b, int off, int len)
          将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
abstract  void write(int b)
          将指定的字节写入此输出流。

构造方法：
InputStreamWriter(InputStream out)
          创建使用默认字符编码的 OutputStreamWriter。
InputStreamWriter(InputStream out, String charsetName)
          创建使用指定字符集的 OutputStreamWriter。
InputStream out  字节输入流，读取文件中的字节
 String charsetName 指定编码名称  必须和文件的编码表相同，不然会发生乱码

 使用步骤：1.创建一个InputStreamWriter(InputStream out, String charsetName)对象
         2.使用read方法
         3.使用flush
         4.释放资源
 */
public class Demo02InputStreamReader {
    public static void main(String[] args) throws IOException {
        demo01();
    }

    private static void demo01() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("c.txt"),"gbk");
        int len=0;
        while((len=isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();
    }
}
