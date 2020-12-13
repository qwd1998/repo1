package cn.itcast.day03.demo03;

// 就近原则 先使用的方法里面的局部变量，
//需要访问类里面的成员变量，需要使用格式this.成员变量名
public class User_Person02this {
    public static void main(String[] args) {
        Person02this per02 = new Person02this();
        per02.name = "王健林";
        per02.sayHello("王思聪");
        System.out.println(per02+"    per02");
    }
}
