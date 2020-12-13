package day05_code.demo04Bufferedwenjian.demo04Buffered;

import java.io.*;

/*
BufferedInputStream(InputStream in) extends  java.io.OutputStream
          创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
BufferedInputStream(InputStream in, int size)
          创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用

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

使用步骤：1.创建FileOutputStream对象，
        2.创建BufferdeOutpuStream对象，传入1的对象
        3.使用BufferdeOutpuStream对象的write方法
        4.BufferdeOutpuStream对象的flush方法
*/
public class Demo01Buffered {
    public static void main(String[] args) throws IOException {
     //show01();
     show02();
    }

    private static void show02() throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int len = 0;
        byte a [] =new byte[1024];
        while((len=bis.read(a))!=-1){
            System.out.println(new String(a,0,len));
        }
        bis.close();
    }

    private static void show01() throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("写入数据".getBytes());
        bos.flush();
    }
}
