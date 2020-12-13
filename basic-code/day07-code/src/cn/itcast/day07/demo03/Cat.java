package cn.itcast.day07.demo03;
/*向上转型一定是安全的 父类名称 对象名 =  new 子类名称
* 向下转型不一定安全
* 向下转型 子类名称 对象名 = （子类名称）父类对象*/
public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void sleep(){
        System.out.println("哈哈哈");
    }
}
