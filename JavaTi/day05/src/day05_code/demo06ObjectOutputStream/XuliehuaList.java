package day05_code.demo06ObjectOutputStream;

import java.io.*;
import java.util.ArrayList;

/*
练习：序列化集合，
当我们想在文件中保存多个对象的时候，
可以把多个对象存储到一个集合中
对集合进行序列化和返序列化

分析，1.定义一个存储Student对象的集合，Arraylist集合
2.往Arraylist集合添加Student对象
3.使用序列化ObjectOutStream
4.使用反序列化ObjectInStream
5.
 */
public class XuliehuaList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("盖伦",18));
        list.add(new Student("嘉文",19));
        list.add(new Student("赵信",28));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"));
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
        Object o = ois.readObject();
        /*System.out.println(o);*/
        ArrayList<Student> list2 = (ArrayList<Student>)o;//向下转型
        for (Student student : list2) {
            System.out.println(student);
        }
        oos.close();
        ois.close();

    }
}
