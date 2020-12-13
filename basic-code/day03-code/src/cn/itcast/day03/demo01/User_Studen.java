package cn.itcast.day03.demo01;
/*
一个类不能直接使用，需要创建一个对象才可以
1.导包：也是指出需要使用的类，在什么位置
   import 包名称，类名称
   import cn.itcast.day03.Student
   在同一个包可以省略不写
2.创建
 类名称 对象名 = new 类名称（）；
    Student stu = new Student();

3.使用，分两种情况
使用成员变量：对象名.成员变量名
使用成员方法： 对象名.成员方法名称（参数）
用谁用对象名.谁
*/
import cn.itcast.day03.demo01.Student;

public class User_Studen {
    public static void main(String[] args) {


        //1，导包
       // import cn.itcast.day03.demo01.Student;
        //2创建
        Student stu = new Student();
        //3使用
        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("=======");
        stu.name = "赵四";
        stu.age = 18;
        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("=======");  //使用成员变量

        //4.
        stu.eat();
    }
}


