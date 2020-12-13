package day06_code.demo07Function;

import java.util.function.Function;

/*
Function<T R> 中的 apply() 根据类型T转换成类型R
需求：1.将字符串截取数字年龄部分，得到字符串
     2.将上一步的字符串转换成int类型
     3.将上一步得到int数字加100
 */
public class Demo03Function {
    public static void main(String[] args) {
        String s = "赵丽颖，20";
        String split = s.split("，")[1];
        //System.out.println(split);
        change1(split,(s1)->{

            return Integer.parseInt(s1)+100;
        });
        /*change(s,(s2)->{
            return s2.split("，")[1];
        },(s3)->{
            return Integer.parseInt(s3)+100;
        },(s4)->{

            return s4;
        });*/

    }
    public  static void change(String s,Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3){
        Integer apply = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(apply);
    }
    public  static void change1(String s,Function<String,Integer> fun1){
        Integer apply = fun1.apply(s);
        System.out.println(apply);
    }
}
