package day07_code.demo01Stream.Practise;

import java.util.ArrayList;
import java.util.Collections;


public class Demo01StreamP {
    public static void main(String[] args) {
        //第一只队伍
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();//筛选3个字的集合
        ArrayList<String> list3 = new ArrayList<>();//存储list2前三个人
        Collections.addAll(list1, "德玛西亚", "召开时", "低调点", "淡定点", "什么玩意", "有毛用");
        for (String s : list1) {
            if (s.length() == 3) {
                list2.add(s);
            }
        }
        for (int i = 0; i < 3; i++) {
            list3.add(list2.get(i));
        }
        ArrayList<String> list4 = new ArrayList<>();
        ArrayList<String> list5 = new ArrayList<>();//筛选张姓的集合
        ArrayList<String> list6 = new ArrayList<>();//不要前两个
        Collections.addAll(list4, "德玛西亚", "张得开", "张什么", "淡定点", "张德玛", "有毛用","张德龙");
        for (String s : list4) {
            if(s.startsWith("张")){
                list5.add(s);
            }
        }
        for (int i = 2; i < list5.size(); i++) {
            list6.add(list5.get(i));
        }
        ArrayList<String> all = new ArrayList<>();
        all.addAll(list3);
        all.addAll(list6);

        ArrayList<Person> per = new ArrayList<>();
        for (String name : all) {
            per.add(new Person(name));
        }
        for (Person person : per) {
            System.out.println(person);
        }

    }
}
