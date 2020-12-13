package cn.itcast.day04.demo06;

import java.util.ArrayList;
import java.util.Scanner;

public class U_student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个学生信息");
        String s1 = sc.next();
        int s2 = sc.nextInt();
        System.out.println("第二个学生信息");
        String s3 = sc.next();
        int s4 = sc.nextInt();
        System.out.println("第三个学生信息");
        String s5 = sc.next();
        int s6 = sc.nextInt();
        System.out.println("教室信息");
        String s7 = sc.next();
        Student st1 = new Student(s1, s2);
        Student st2 = new Student(s3, s4);
        Student st3 = new Student(s5, s6);
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        st1.setRoom(s7);
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getAge()   + s.getName()    +   s.getRoom());
        }
    }
}
