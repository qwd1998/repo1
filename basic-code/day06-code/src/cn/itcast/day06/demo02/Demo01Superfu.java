package cn.itcast.day06.demo02;
/*super可以进行重载构造方法，super先调用父类的构造，再调用子类的构造
super（）；写在子类中，并且是第一个，一个构造只能调用一次super
* */
public class Demo01Superfu {
    public Demo01Superfu(){
        System.out.println("无参构造方法");
    }
    public Demo01Superfu(int num){
        System.out.println("有参构造方法");
    }
}
