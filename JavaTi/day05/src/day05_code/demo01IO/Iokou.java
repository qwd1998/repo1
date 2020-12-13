package day05_code.demo01IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
java.io.OutputStream 是一个抽象类，需要使用子类
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

java.io.FileOutputStream  文件输出流是用于将数据写入 File 或 FileDescriptor 的输出流。
 FileOutputStream(String name)
          创建一个向具有指定名称的文件中写入数据的输出文件流。

FileOutputStream(File file)
          创建一个向指定 File 对象表示的文件中写入数据的文件输出流。


写入数据的原理：
字节输出流的使用步骤：
1.创建一个FileOutputStream对象，构造方法中传递数据的目的地
2.调用FileOutputStream对象中的write方法写入文件中
3.释放资源（流使用会占用一定的内存，使用完毕把内存清空）
 */
public class Iokou {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\照片\\新建文件夹\\新建文件夹\\新建文本文档.txt");
        fos.write(65);//一次写一个字节
        //fos.close();*/
        byte[] a = {65,66,67};//一次写多个字节
        fos.write(a);
       // fos.close();

        byte [] b = {48,49,50,51,52,53,54,55};//从第二个开始，写5个
        fos.write(b,2,5);
       // fos.close();
        byte[] bytes = "你好吗".getBytes();
        System.out.println(Arrays.toString(bytes));
        byte [] c = {-28, -67, -96, -27, -91, -67, -27, -112, -105};
        fos.write(c);
        fos.close();
    }
}
