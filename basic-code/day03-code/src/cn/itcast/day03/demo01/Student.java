package cn.itcast.day03.demo01;
/*
定义一个类，模拟学生的事物
属性（是什么） 成员变量：身高体重，姓名年龄
行为（能做什么） 成员方法：吃饭睡觉打游戏
成员变量：  姓名：String
成员方法：    public void eat();
            public void sleep)();
            public void game();
注意：
1,成员变量是在定义类中的方法外
2，成员方法没有static

*/

public class Student {
    String name;
    int age;

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void gamne() {
        System.out.println("打游戏");
    }
}
