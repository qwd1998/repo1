package cn.itcast.day04.demo02;

/*
创建对象的标准
类名称 对象名 = new 类名称（）；
匿名对象就是只有右边的对象，没有左边的名字和运算符
格式： new 类名称（）；
匿名对象只能使用一次，下次再用还要创建
 */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person per = new Person();
        per.name="高圆圆";
        per.showName();
        System.out.println("=======");

        new Person().name= "赵括";//匿名对象
        new Person().showName();
    }
}

