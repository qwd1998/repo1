package day06_code.demo02.FunctionHanshu;
/*
函数式接口：有且只有一个抽象方法的接口，称为函数式接口
当然接口中也可以包含其他的方法（默认，静态，私有方法）

@FunctionalInterface注解
作用：就可以检测接口是否是一个函数式接口
    是，编译成功
    否，编译失败

函数式接口的使用：一般可以作为方法的参数和返回值类型
 */
@FunctionalInterface
public interface FunctionIterface {
    void meth();

}
