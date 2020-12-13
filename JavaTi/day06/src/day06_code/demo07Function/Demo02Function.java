package day06_code.demo07Function;

import java.util.function.Function;

/*
Function<T R> 中的 apply() 根据类型T转换成类型R
需求：把String类型的“123”，转换为Integer类型，把转换后的结果加10
    把增加的Integer类型转换为String
 */
public class Demo02Function {
    public static void main(String[] args) {
        String s = "1245";
        change(s,(String s1)->{
            return Integer.parseInt(s1)+10;//String转换为Integer
        },(Integer i)->{

            return i+"";//把Integer转换为string
        });
    }
    public  static void change(String s,Function<String,Integer> fun1,Function<Integer,String> fun2){
        String apply = fun1.andThen(fun2).apply(s);//fun1先调用apply方法，把 fun2后调用apply方法，把Integer转换为string
        System.out.println(apply);
    }
}
