package day07_code.demo01Stream.Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;


public class Demo02StreamP {
    public static void main(String[] args) {
        //第一只队伍
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "德玛西亚", "召开时", "低调点", "淡定点", "什么玩意", "有毛用");
        Stream<String> limit = list1.stream().filter(name -> name.length() == 3).limit(3);

        ArrayList<String> list4 = new ArrayList<>();
        Collections.addAll(list4, "德玛西亚", "张得开", "张什么", "淡定点", "张德玛", "有毛用", "张德龙");
        Stream<String> skip = list4.stream().filter(name -> name.startsWith("张")).skip(2);

        Stream.concat(limit,skip).map(name->new Person(name)).forEach(p-> System.out.println(p));
    }
}
