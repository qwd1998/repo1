package cn.itcast.day07.demo03;

public class Demo01 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        Cat cat = (Cat) a;
        cat.sleep();
        Animal d = new Dog();
        d.eat();
        Dog dog = (Dog)d;
        ((Dog) d).sleep();
    }
}
