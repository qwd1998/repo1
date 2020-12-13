package day01_code.demo01;
/*类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。所有对象（包括数组）都实现这个类的方法。*/
public class Demo01toString {
    public static void main(String[] args) {
        Person p = new Person("张三",18);
        System.out.println(p);
        //System.out.println(p.getAge()+p.getName());
        //看一个类是否重写了toString方法，直接打印对象名即可
        //如果没有重写toString那么打印的就是地址值
    }
}
