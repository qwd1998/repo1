package cn.itcast.day07.demo01;
/*问题描述：
我们需要抽取一个共有方法，用来解决两个代码重复代码的问题
让这个共有方法私有化，不让实现类使用公有方法

解决：
1.普通私有方法，解决多个默认方法之间的重复代码
格式： private 返回值类型 方法名称（参数列表）{
    方法体
}
2.静态私有方法，解决多个静态方法之间的重复代码
格式： private static 返回值类型 方法名称（参数列表）{
    方法体
}

*/
public interface PrivateA {
    public default void methoDefault1(){
        System.out.println("默认方法A");
        com();
    }
    public default void methoDefault2(){
        System.out.println("默认方法B");
        com();
    }
    private void com(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
