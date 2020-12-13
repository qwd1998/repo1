package day07_code.demo01Stream;

import java.util.ArrayList;
import java.util.List;

public class Demo01Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("德玛西亚");
        list.add("张西亚");
        list.add("小逗比");
        list.add("张德凯的妹妹");
        list.add("张德凯");
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (String s : list) {
            if(s.length()==3){
                list1.add(s);
            }
        }
        for (String s : list1) {
            if (s.startsWith("张")){
                list2.add(s);
            }
        }

        for (String s : list2) {
            System.out.println(s);
        }


    }
}
