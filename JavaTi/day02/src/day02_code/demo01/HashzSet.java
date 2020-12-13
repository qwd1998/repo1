package day02_code.demo01;


import java.util.HashSet;

/*
Set集合不允许存储重复元素的原理
HashSet存储自定义类型元素，必须重写hashcode和equals方法
 */
public class HashzSet {
    public static void main(String[] args) {
        HashSet<Sutdent> set = new HashSet<>();
        Sutdent s1 = new Sutdent("德玛",18);
        Sutdent s2 = new Sutdent("德玛",18);
        Sutdent s3 = new Sutdent("德玛",18);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }
}
