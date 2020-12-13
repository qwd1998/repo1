package cn.itcast.day07.demo07;

import java.util.ArrayList;
import java.util.List;

public class Demo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> insult = ss(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(insult.get(i));
        }

    }
    public static List<String>  ss(List<String> list){
        list.add("AAA");
        list.add("AAB");
        list.add("ABA");
        list.add("BAA");
        return list;
    }
}
