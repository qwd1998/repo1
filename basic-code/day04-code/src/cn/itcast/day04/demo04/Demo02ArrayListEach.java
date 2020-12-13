package cn.itcast.day04.demo04;

import java.util.ArrayList;

public class Demo02ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add("qqq");
        list1.add("www");
        list1.add("eee");
        list1.add("rrr");
        list1.add("ttt");
        list2.add(10);
        list2.add(11);
        list2.add(12);
        list2.add(13);
        for(int i =0 ;i<list1.size();i++){
           // String s = list1.get(i);
            System.out.println("输出的值为："+list1.get(i));

        }
        System.out.println(list1);
        for(int i =0 ;i<list2.size();i++){
            int num = list2.get(i);
            System.out.println("输出的值为："+num);

        }
        System.out.println(list2);
    }
}
