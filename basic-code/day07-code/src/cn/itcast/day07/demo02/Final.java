package cn.itcast.day07.demo02;
/*
* 1.接口也可以定义“成员变量”，但是必须使用
* public static final，从效果上看就是常量
* 2.格式：
*public static final
*
* 注意：
* 1.接口中的常量必须赋值，不能不赋值
* */
public interface Final {
    //一旦赋值，不可以修改
    public static final int NUM = 10;
}
