package day02_code.demo03Map;

import java.util.*;

/*
java.util.Map<k,v>集合
Map集合的特点：
    1.Map集合是一个双列集合，一个元素包含两个值（一个key，一个valve）
    2.Map集合中的元素，key和value的数据类型可以相同，也可以不同
    3.Map集合中的元素，key不允许重复，value是可以重复的
    4.Map集合中的元素，key和value是一一对应的

java.util.HashMap<k,v>集合 implement Map<k,v>接口
1.HashMap集合底层是哈希表，查询的速度非常快
2.HashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一样

java.util.LinkedHashMap集合 extends HashMap集合
1.底层是一个哈希表（数组+链表/红核数）+链表，多了一条链表（保证迭代的顺序）
2.是一个有序的集合，存储元素和取出元素的顺序一样


 V put(K key, V value)
          将指定的值与此映射中的指定键关联（可选操作）。
  V get(Object key)
          返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
 V remove(Object key)
          如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
 boolean containsKey(Object key)
          如果此映射包含指定键的映射关系，则返回 true。
 Set<Map.Entry<K,V>> entrySet()   取出多个Entry对象，放入set集合中   遍历Set集合   用Entry对象中的方法getkey和getvalue
          返回此映射中包含的映射关系的 Set 视图
 Set<K> keySet()   把所有的K取出来，放入Set集合中
          返回此映射中包含的键的 Set 视图
 */
public class Demo01Map {
    public static void main(String[] args) {
       /*show01();
        show02();
        show03();
        show04();*/
        show05();
        show06();
    }
    private static void show01(){
        //创建Map集合，多态
        Map<String,String> map = new HashMap<>();
        String v1 = map.put("李晨","范冰冰");//k存在则修改V，k不存在则为null
        System.out.println("v1"+v1);//v1null
        String v2 = map.put("李晨","范冰冰2");
        System.out.println("v1"+v2);//v1范冰冰
        map.put("冷锋","龙小云");
        map.put("杨过","小龙女");
        map.put("尹志平","小龙女");
        System.out.println(map);//{杨过=小龙女, 尹志平=小龙女, 李晨=范冰冰2, 冷锋=龙小云}
    }
    private static void show02(){
        //创建Map集合，多态
        Map<String,Integer> map = new HashMap<>();
        map.put("冷锋",20);
        map.put("杨过",22);
        map.put("尹志平",26);
        System.out.println(map);//{杨过=22, 尹志平=26, 冷锋=20}
        map.remove("杨过");
        System.out.println(map);
    }
    private static void show03(){
        //创建Map集合，多态
        Map<String,Integer> map = new HashMap<>();
        map.put("冷锋",20);
        map.put("杨过",22);
        map.put("尹志平",26);
        Integer integer = map.get("杨过");
        System.out.println(integer);
    }
    private static void show04(){
        //创建Map集合，多态
        Map<String,Integer> map = new HashMap<>();
        map.put("冷锋",20);
        map.put("杨过",22);
        map.put("尹志平",26);
        boolean b = map.containsKey("冷锋");//判断集合是否包含key
        System.out.println(b);
    }

    private static void show05(){//Map集合的遍历方式，通过键找值
        //创建Map集合，多态
        Map<String,Integer> map = new HashMap<>();
        map.put("冷锋",20);
        map.put("杨过",22);
        map.put("尹志平",26);
        Set<String> strings = map.keySet();
        /*for (String s : strings) {
            Integer integer = map.get(s);
            System.out.println(s+integer);
        }*/
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            Integer integer = map.get(next);
            System.out.println(next+integer);
        }

    }
    private static void show06(){//Map集合的遍历方式，使用Entry
        //创建Map集合，多态
        Map<String,Integer> map = new HashMap<>();
        map.put("冷锋",20);
        map.put("杨过",22);
        map.put("尹志平",26);

        //map.put("尹志平",27);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> s : entries) {
            String key = s.getKey();
            Integer value = s.getValue();
            System.out.println(key+" "+value);
        }

    }
}
