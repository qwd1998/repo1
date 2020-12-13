package day05_code.demo01IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
java.io.InputStream此抽象类是表示字节输入流的所有类的超类。
abstract  int read()
          从输入流中读取数据的下一个字节。
 int read(byte[] b)
          从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
 void close()
          关闭此输入流并释放与该流关联的所有系统资源。
继承者 java.io.FilterInputStream
FileInputStream(File file)
          通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
FileInputStream(String name)
          通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。


 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        /*int len = 0;
        while((len=fis.read())!=-1){//一次读取一个字节
            System.out.println((char) len);
        }
        fis.close();*/
        byte [] a =new byte[1024];
        int len = 0;
        while((len=fis.read(a))!=-1){
            System.out.println(Arrays.toString(a));
            System.out.println(new String(a,0,len));
        }

        fis.close();

    }
}
