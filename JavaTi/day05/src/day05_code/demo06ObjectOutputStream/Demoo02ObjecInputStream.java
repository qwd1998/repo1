package day05_code.demo06ObjectOutputStream;

import java.io.*;

/*
java.io.ObjectInputStream
ObjectInputStream:把文件中保存的对象以流的方式读出
protected  ObjectInputStream()
          为完全重新实现 ObjectInputStream 的子类提供一种方法，让它不必分配仅由 ObjectOutputStream 的实现使用的私有数据。
  ObjectInputStream(InputStream out)
          创建写入指定 InputStream 的 ObjectIntputStream。
 Object readObject()
          从 ObjectInputStream 读取对象。

使用步骤：1.创建ObjectInputStream的对象，构造方法中写入字节输入流对象
        2.使用readObject，从文件中读取对象
        3.释放资源
        4.打印输出
 */
public class Demoo02ObjecInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.txt"));
        int len = 0;
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);//反序列化


    }
}
