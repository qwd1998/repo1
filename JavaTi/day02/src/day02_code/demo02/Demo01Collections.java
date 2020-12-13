package day02_code.demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo01Collections {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        //添加多个元素Collections.addAll(coll,"""""")
        Collections.addAll(coll,"sd","wd","qqq");
        System.out.println(coll);


        //打乱集合元素Collections.shuffle(coll);
        Collections.shuffle((List<?>) coll);
        System.out.println(coll);
    }
}
