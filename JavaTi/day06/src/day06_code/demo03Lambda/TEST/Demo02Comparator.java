package day06_code.demo03Lambda.TEST;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Comparator {
    public static void main(String[] args) {
        String a [] = {"AAA","CC","QQQDAS"};
        Arrays.sort(a,com());
        System.out.println(Arrays.toString(a));
    }
    public static Comparator<String> com(){
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照字符串的降序排列
                return o2.length()-o1.length();
            }
        };*/

        //使用Lambda表达式
        /*return (String o1, String o2)->{

            return o2.length()-o1.length();
        };*/

        //继续优化Lambda表达式

        return (o1,o2)->o2.length()-o1.length();
    }
}
