package day02_code.demo03Map;

import java.util.HashMap;

/*
java.util.Hashtable<K,v>
Hashtable:底层是一个哈希表，是一个线程安全的集合，速度慢   不能存储null
HashMap：底层是一个哈希表，是一个多线程不安全的集合，速度快  可以存储null
 */
public class Demo02Hashtable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("我的",null);
        map.put(null,"aa");
        map.put("他的","aa");
        System.out.println(map);
    }
}
