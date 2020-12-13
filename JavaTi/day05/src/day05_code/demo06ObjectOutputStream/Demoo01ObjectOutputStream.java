package day05_code.demo06ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
java.io.ObjectOutputStream
ObjectOutputStream:把对象以流的方式写入到文件中
protected  ObjectOutputStream()
          为完全重新实现 ObjectOutputStream 的子类提供一种方法，让它不必分配仅由 ObjectOutputStream 的实现使用的私有数据。
  ObjectOutputStream(OutputStream out)
          创建写入指定 OutputStream 的 ObjectOutputStream。
 void writeObject(Object obj)
          将指定的对象写入 ObjectOutputStream

使用步骤：1.创建ObjectOutputStream的对象，构造方法中写入字节输出流对象
        2.使用writeObject，把对象写入到文件中
        3.释放资源
 */
public class Demoo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.txt"));
        oos.writeObject(new Student("德玛",18));
        oos.close();//序列化
    }
}
