package cn.itcast.day07.demo03;
/*如何才能知道一个父类引用的对象，本来是什么子类
*
* 格式：
* 对象名 instanceof 类名称
*
*
* */
public class Demo02 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        Animal d = new Dog();
        d.eat();
        //看看a本来是不是dog
        /*if(a instanceof Dog){
            Dog dog = (Dog)a;
            dog.sleep();
        }
        //看看a本来是不是cat
        if (a instanceof Cat){
            Cat cat = (Cat)a;
            cat.sleep();
        }
        if(d instanceof Dog){
            Dog dog = (Dog)d;
            dog.sleep();
        }
        if(d instanceof Cat){
            Dog dog = (Dog)d;
            dog.sleep();
        }*/
        give(d);

    }
    public static void give(Animal a){
//看看a本来是不是dog
        if(a instanceof Dog){
            Dog dog = (Dog)a;
            dog.sleep();

        }
        //看看a本来是不是cat
        if (a instanceof Cat){
            Cat cat = (Cat)a;
            cat.sleep();
        }

    }

}
