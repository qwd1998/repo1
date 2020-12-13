package day06_code.demo05Consumer;

import java.util.function.Consumer;

/*
Consumer<T> 接口与Supplier接口相反，他是消费数据，数据的类型由泛型决定
accept();
 */
public class Demo01Consumer {
    public static void main(String[] args) {
        //Lambda表达式
        meth("我的",(String name)->{
            System.out.println(name);
                }
        );

        //匿名内部类的方式
        meth("zz", new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
    public static void meth(String name, Consumer<String> con){
        con.accept(name);
    }
}
