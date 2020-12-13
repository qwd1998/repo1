package day06_code.demo07Function;

import java.util.function.Function;

/*
Function<T R> 中的 apply() 根据类型T转换成类型R
 */
public class Demo01Function {
    public static void main(String[] args) {
        String s = "12455";
        change(s,(s1)->{
            int anInt = Integer.parseInt(s1);//把字符串转换为Integer
            return anInt;
        });
    }
    public  static void change(String s,Function<String,Integer> fun){
        Integer apply = fun.apply(s);
        System.out.println(apply);
    }
}
