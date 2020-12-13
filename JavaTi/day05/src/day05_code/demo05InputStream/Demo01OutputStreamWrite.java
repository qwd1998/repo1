package day05_code.demo05InputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
继承者 java.io.InputStreamReader
InputStreamWrite 是字符流通向字节流的桥梁

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
OutputStreamWriter(OutputStream out)
          创建使用默认字符编码的 OutputStreamWriter。
OutputStreamWriter(OutputStream out, String charsetName)
          创建使用指定字符集的 OutputStreamWriter。
OutputStream out  字节输出流，字节转换到文件中
 String charsetName 指定编码名称

 使用步骤：1.创建一个OutputStreamWriter(OutputStream out, String charsetName)对象
         2.使用write方法
         3.使用flush
         4.释放资源

 */
public class Demo01OutputStreamWrite {
    public static void main(String[] args) throws IOException {
        demo01();
        demo02();
    }

    private static void demo02() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("c.txt"),"gbk");
        osw.write("你好个jb");
        osw.flush();
        osw.close();
    }

    private static void demo01() throws IOException {
       OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("b.txt"),"utf-8");
       osw.write("你好个jb");
       osw.flush();
       osw.close();
    }
}
