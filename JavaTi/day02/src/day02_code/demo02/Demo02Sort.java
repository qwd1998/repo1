package day02_code.demo02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*
sort(list<T> list)使用前提：
被排序的集合里边存储的元素，必须实现Comparable,重写接口中的方法compareTo定义排序规则
 */

public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,388,256,9,77);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"a","b","e","c");
        Collections.sort(list1);
        System.out.println(list1);

        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("张三",18));
        list2.add(new Student("张六",17));
        list2.add(new Student("张五",13));
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
    }
}
