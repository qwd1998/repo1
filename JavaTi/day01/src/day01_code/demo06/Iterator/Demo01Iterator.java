package day01_code.demo06.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*java.util 接口 Iterator<E> 对 collection 进行迭代的迭代器
boolean hasNext()
          如果仍有元素可以迭代，则返回 true。
E next()
          返回迭代的下一个元素。

    Iterator是一个接口，无法直接使用，需要实现类对象
     Iterator<E> iterator()
          返回在此 collection 的元素上进行迭代的迭代器。
    迭代器的使用步骤：
            1.使用集合中农的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
            2.使用Iterator接口中的方法hasNext判断还有木有下一个元素
            3.使用Iterator接口中的方法Next取出集合中的下一个元素

       迭代器从集合取出元素的一个重复的过程，使用使用循环
       while（i.hasNext（））{
            String e = i.next();
            System.out.println(e);
       }

*  */
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("德玛");
        coll.add("皇子");
        coll.add("赵信");
        coll.add("拉克丝");
        /*Iterator<E>也有泛型，迭代器的泛型跟着集合走

         */
        Iterator<String> i = coll.iterator();

        while(i.hasNext()){
            String e = i.next();
            System.out.println(e);
        }

    }
}
