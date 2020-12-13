package day06_code.demo06Predicate;

import java.util.function.Predicate;

/*
Predicate<T> 接口
作用：对某种数据类型的数据进行判断，结果返回一个boolean值

Predicate<T> 包含了一个抽象方法
Boolean test（T t）
 */
public class Demo01Predicate {
    public static void main(String[] args) {
        boolean b = meth("内1111蒙", (s) -> {
            //对字符串的长度判断是否大于5
            return s.length() > 5;
        });
        System.out.println(b);
    }
    public static boolean meth(String s, Predicate<String> pre){
        return pre.test(s);
    }
}
