package day02_code.demo01;

import java.util.HashSet;

/*
java.util.LinkedHashSet集合 extends HashSet集合
LinkedHashSet集合特点：
底层是一个哈希表（数组+链表/红核数）+链表，多了一条链表，是一个有序的集合
 */
public class LinkedHashSet<S> {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("是的4");
        hashSet.add("是的3");
        hashSet.add("是的2");
        hashSet.add("是的1");
        System.out.println(hashSet);

        java.util.LinkedHashSet<String> hashSet1 = new java.util.LinkedHashSet<String>();
        hashSet1.add("是的4");
        hashSet1.add("是的3");
        hashSet1.add("是的2");
        hashSet1.add("是的1");
        System.out.println(hashSet1); 

    }
}
