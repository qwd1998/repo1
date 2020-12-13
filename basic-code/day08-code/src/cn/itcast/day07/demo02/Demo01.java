package cn.itcast.day07.demo02;

/*
一个类内部包含另一个类
例如：身体和心脏   汽车和发动机

内部类的分类：
1.成员内部类
2.局部内部类（包含匿名内部类）

1.成员内部类的格式:
修饰符 class 外部类名称{
    修饰符 class 内部类名称{

    }
}
注意：内用外，随意访问。外用内，需要内部类对象

如何使用成员内部类，两种方法
1.间接方式：在外部类的方法中，使用内部类
2.直接方式：  格式
外部类名称.内部类名称  对象名 = new 外部类名称（）.new 内部类名称
 */
public class Demo01 {  //外部类

    public class Nei {  //内部类
        public void metha() {
            System.out.println("内部类方法");
            System.out.println("我叫"+name); //内部类访问外部类
        }
    }

    public void meth() {
        System.out.println("外部类的方法");
        Nei nei = new Nei();  //间接方法
        nei.metha();

    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
