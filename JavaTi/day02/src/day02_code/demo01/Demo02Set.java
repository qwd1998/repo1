package day02_code.demo01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
java.util.Set 接口 extends Collection接口
set接口：1.不允许存储重复的元素
        2.没有索引值，不能用普通for
java.util.HashSet 接口 implements Set接口
HashSet:1.不允许存储重复的元素
        2.没有索引值，不能用普通for
        3.是一个无序的集合，存储元素和取出元素的顺序可能不一样
        4.底层是一个哈希表结构（查询速度非常快）
 */
public class Demo02Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        /*Iterator<Integer> it = set.iterator();//迭代器方法
        *//*while(it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }*/
        for (Integer integer : set) {  //增强for
            System.out.println(integer);
        }
    }

}
