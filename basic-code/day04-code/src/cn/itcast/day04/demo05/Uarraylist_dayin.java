package cn.itcast.day04.demo05;

import java.util.ArrayList;

/* 定义用打印指定格式的方法，ArrayList作为参数，格式为{a@b@c}*/
public class Uarraylist_dayin {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ww");
        list.add("aa");
        list.add("qq");
        list.add("ee");
        printArraylist(list);
        ArrayList<Student> list12 = new ArrayList<>();
        Student one = new Student("asd ", 18);
        list12.add(one);

    }

    public static void printArraylist(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "@");
            if (i == list.size() - 1) {
                System.out.println(list.get(i) + "}");
            }
        }

    }


}
