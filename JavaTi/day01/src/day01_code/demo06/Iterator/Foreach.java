package day01_code.demo06.Iterator;

import java.util.ArrayList;
import java.util.Collection;

/*
增强for循环
for(数据类型 对象名 ： 集合或者数组的名称)

  */
public class Foreach {
    public static void main(String[] args) {
        Collection<String> coll= new ArrayList<>();
        coll.add("wsc");
        coll.add("12300");
        coll.add("我的");

        for (String s : coll){
            System.out.println(s);
        }
    }
}
