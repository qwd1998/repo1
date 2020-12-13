package day06_code.demo04Supplier;

import java.util.function.Supplier;
/*
Supplier<泛型> 为生产型接口，泛型是什么类型，接口中的get方法就会生产什么类型的数据
get()方法；
 */
public class Demo01Supplier {
    public static void main(String[] args) {
        //因为Supplier是函数式接口，可以使用Lambda表达式
       String s = getString(()->{
            return "胡歌";
        });
        System.out.println(s);

    }
    public static String getString(Supplier<String> sup){

        return sup.get();
    }
}
