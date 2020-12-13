package cn.itcast.day06.demo04;
/*抽象类就是在class前面加上abstract
抽象方法就是加上abstract关键字，去掉大括号，直接分号结束

1.不能直接创建new抽象类对象
2.必须用一个子类来继承抽象父类
3.子类必须覆盖重写抽象父类当中的所有的抽象方法
覆盖重写：子类去掉抽象方法的abstract关键字，然后补上方法体和大括号

*/
public abstract class Anmial {
    public abstract void eat();
    public abstract void sleep();
}
