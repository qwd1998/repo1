package cn.itcast.day04.demo05;
/*自定义4个学生，添加进集合。并且遍历输出
 */
import java.util.ArrayList;

public class U_student {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("什么1",108);
        Student two = new Student("什么2",118);
        Student three = new Student("什么3",128);
        Student four = new Student("什么4",138);
        System.out.println(one.getName()+one.getAge());
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName()+"--------"+s.getAge());
        }

    }
}
