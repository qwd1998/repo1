package cn.itcast.day03.demo03;

// 就近原则 先使用的方法里面的局部变量，
//需要访问类里面的成员变量，需要使用格式this.成员变量名
//通过谁调用的方法，谁就是this   per02就是this

public class Person02this {
    String name;
    int age;
public void sayHello(String name){
    System.out.println("你好"+name+" ， 我是"+this.name);
    System.out.println(this);
}
}
