package day02_code.demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
Comparator 和 Comparable的区别

 Comparable：自己（this）和别人（参数）比较，自己要实现comparable接口，重写比较规则compareTo方法
 Comparator：相当于找一个第三方的裁判，比较两个
 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Student> coll = new ArrayList<>();
        coll.add(new Student("张三",18));
        coll.add(new Student("W王三",17));
        coll.add(new Student("周三",15));
        coll.add(new Student("A艾三",17));
        coll.add(new Student("Z张二",17));
        coll.add(new Student("X小三",17));
        Collections.sort(coll, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge()-o2.getAge();
                if(result==0){
                    int i = o1.getName().charAt(0) - o2.getName().charAt(0);//按照姓名字母排序
                }

                return result;
            }
        });
        System.out.println(coll);
    }
}
