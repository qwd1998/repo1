package day06_code.demo06Predicate;

import java.util.function.Predicate;

/*
需求：a.  and     &&    1.判断字符串的长度是否大于5
                       2.判断字符串中是否包含a
     b.   or     ||  满足以上1个就行
     c.   negate  !    字符串大于5位true，取反为false
  */
public class Demo02Predicate {
    public static void main(String[] args) {
        String st1 = "ebcdef";
        boolean b1 = meth1(st1, (s) -> {
            return s.length()>5;
        }, (s) -> {

            return s.contains("a");
        });
        boolean b2 = meth2(st1, (s) -> {
            return s.length()>5;
        }, (s) -> {

            return s.contains("a");
        });
        boolean b3 = meth3(st1, (s) -> {
            return s.length()>5;
        });
        System.out.println("b1="+b1);
        System.out.println("b2="+b2);
        System.out.println("b3="+b3);
    }

    public static boolean meth1(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.test(s)&&pre2.test(s);
        //return pre1.and(pre2).test(s);  与上方相同
    }
    public static boolean meth2(String s, Predicate<String> pre1, Predicate<String> pre2) {
        //return pre1.test(s)||pre2.test(s);
        return pre1.or(pre2).test(s);
    }
    public static boolean meth3(String s, Predicate<String> pre1) {
        //return ！pre1.test(s)
        return pre1.negate().test(s);
    }
}
