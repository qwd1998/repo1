package cn.itcast.day07.demo01;

/* 接口就是多个类的公共规范
* 接口是一种引用数据类型，最重要的内容就是抽样方法
* 接口的格式：
* public interface 接口名称{
*       接口内容
* }
*
 如果是java7，接口可以包含：1常量  2.抽样方法
 * 如果是java8，接口可以包含：默认方法  静态方法
 * 如果是java9， 私有方法
 *
 * 接口使用步骤：
 * 1.接口不能直接使用，必须有个“实现类”，“实现”接口
 * 格式：
 * public class 实现类名称 implements 接口名称{
 * }
 *
 * 2.接口的实现必须覆盖重写，
 * ：实现 去掉abstract 加上方法体大括号
 * 3.创建实现类的对象
 *
 * 注意：如果实现类没有覆盖重写接口中的所有的抽样方法，那么这个实现类必须是抽样的
 * * */
public class Demo01Interface {
    public static void main(String[] args) {
        U_jiekou impl =new U_jiekou();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
    }
}
