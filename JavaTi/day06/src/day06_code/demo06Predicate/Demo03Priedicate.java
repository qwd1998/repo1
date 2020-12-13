package day06_code.demo06Predicate;
/*
 String [] arr = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};
 同时满足两个条件：1.必须为女生
                2.姓名为4个字
 并且加入到ArrayList集合中
 */

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo03Priedicate {
    public static void main(String[] args) {
        String [] arr = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};
        ArrayList<String> list = meth(arr,(s)->{
            return s.split(",")[0].length()==4;
        },(s)->{
            String s1 = s.split(",")[1];
            boolean b = s1.equals("女");
            return b;
        });
        /*for (String s : list) {
            System.out.println(s);
        }*/
    }
    public static ArrayList<String> meth(String [] arr, Predicate<String> pre1, Predicate<String> pre2){
      ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean test = pre1.and(pre2).test(s);
            if(test){
                list.add(s);
            }
        }
        for (String s1 : list) {
            System.out.println(s1);
        }
        return list;
    }

}
