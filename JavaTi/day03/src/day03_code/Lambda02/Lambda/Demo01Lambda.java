package day03_code.Lambda02.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Lambda标准格式：
1.一些参数
2.一个箭头
3.一段代码

格式：  （参数列表）->{一些重写方法的代码}
 */
public class Demo01Lambda {
    public static void main(String[] args) {
        ArrayList<Student> coll = new ArrayList<>();
         coll.add(new Student("古力娜扎",18));
         coll.add(new Student("古力娜扎",19));
         coll.add(new Student("古力娜扎",20));
        /*Collections.sort(coll, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/

        Collections.sort(coll,(Student o1, Student o2)->{
            return o1.getAge()-o2.getAge();
        });

        //Lambda的省略模式  删去大括号，return，分号  必须是一起删除
        Collections.sort(coll,(o1,  o2)-> o1.getAge()-o2.getAge()
        );
        for (Student student : coll) {
            System.out.println(student);
        }

    }
}