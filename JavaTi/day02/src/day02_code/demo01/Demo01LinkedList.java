package day02_code.demo01;

import java.util.LinkedList;

/*
java.util.LinkedList<E> impements List 接口
特点：
1.底层是一个链表解构，查询慢，增删快
2.里面包含了大量操作收尾元素的方法
3.不能使用多态方法

 void addFirst(E e) == push
          将指定元素插入此列表的开头。
 void addLast(E e)
          将指定元素添加到此列表的结尾。
 E getFirst()
          返回此列表的第一个元素。
 E getLast()
          返回此列表的最后一个元素。
 E removeFirst() == pop
          移除并返回此列表的第一个元素。
 E removeLast()
          移除并返回此列表的最后一个元素。


 */
public class Demo01LinkedList {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }
    private static void demo01(){
        LinkedList<String> link = new LinkedList<>();
        link.add("ww");
        link.add("qq");
        link.add("aa");
        System.out.println(link);

        link.addFirst("333");
        System.out.println(link);

        link.addLast("222");
        System.out.println(link);
    }
    private static void demo02(){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("ww");
        linked.add("qq");
        linked.add("aa");
        String first = linked.getFirst();
        String last = linked.getLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(linked);
    }
    private static void demo03(){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("ww");
        linked.add("qq");
        linked.add("aa");
        String first = linked.removeFirst();
        String last = linked.removeLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(linked);
    }
}
