package day01_code.demo07Fanxing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    泛型是指未知的数类型，当不知道使用什么类型的数据时，使用泛型
    E  e：Element 元素
    T  t：Type    类型
    创建对象，不使用泛型
        好处：集合不使用泛型，默认类型就是object
        弊端：不安全，引发异常
    创建对象，使用泛型
        好处：避免类型转换的麻烦，把运行期异常，提升到编译期
        弊端：泛型是什么类型，只能存储什么类型
        泛型的通配符为 ？  只能在参数传递时使用
   */
public class Demo01 {
      public static void main(String[] args) {

          show01(); //使用泛型
          //show02();//不使用泛型

      }
      private static void show01(){
          Collection<String> coll= new ArrayList<>();
          coll.add("wsc");
          coll.add("12300");
          coll.add("我的");

          Iterator<String> s = coll.iterator();
          while(s.hasNext()){
              String next = s.next();
              System.out.println(next.length());
              System.out.println(next);
          }
      }
    private static void show02(){
        Collection coll= new ArrayList();
        coll.add("wwqqqc");
        coll.add("123");
        coll.add("我dddd的");

        Iterator s = coll.iterator();
        while(s.hasNext()){
            Object next = s.next();
            String obj =(String)next;
            System.out.println(obj.length());
            System.out.println(next);
        }
    }
}
