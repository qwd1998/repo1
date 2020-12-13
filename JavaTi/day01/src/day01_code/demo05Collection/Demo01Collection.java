package day01_code.demo05Collection;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collection;

/*
java.util.Collection是所有单列集合的最顶层的接口，里面定义了
所有单列集合的共性方法，然后单列集合都可以使用里面的方法

共性方法：
       public boolean add(E e );
           把给定的对象添加到当前集合
       void clear()
          移除此 collection 中的所有元素（可选操作）。
       boolean contains(Object o)
          如果此 collection 包含指定的元素，则返回 true。
       boolean isEmpty()
          如果此 collection 不包含元素，则返回 true。
       boolean remove(Object o)
          从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。
       int size()
          返回此 collection 中的元素数
       Object[] toArray()
          返回包含此 collection 中所有元素的数组。
* */
public class Demo01Collection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);

        boolean b1 = coll.add("傻吊");
        coll.add("傻1吊");
        coll.add("傻2吊");
        System.out.println("b1="+b1);
        System.out.println(coll);
        System.out.println();

        coll.remove("傻吊");
        System.out.println(coll);
        System.out.println();


        boolean b2 = coll.contains("傻吊");
        System.out.println("b2="+b2);
        System.out.println(coll);
        System.out.println();


        boolean b3 = coll.isEmpty();
        System.out.println("b3="+b3);
        System.out.println();


        int size = coll.size();
        System.out.println(size);
        System.out.println();

        Object[] objects = coll.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

    }
}
