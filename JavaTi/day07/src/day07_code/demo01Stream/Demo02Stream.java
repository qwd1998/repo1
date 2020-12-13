package day07_code.demo01Stream;
/*
JDK1.8之后，出现了Stream流，关注是做什么，而不是怎么做
 */
import java.util.ArrayList;
import java.util.List;

public class Demo02Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("德玛西亚");
        list.add("张西亚");
        list.add("小逗比");
        list.add("张德凯的妹妹");
        list.add("张德凯");
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name-> System.out.println(name));

    }
}
