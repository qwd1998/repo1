package cn.itcast.day04.StudentMang;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        while (true) {
            System.out.println("-------欢迎来到学生管理系统-------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    System.out.println("添加学生");
                    add(list);
                    break;
                case "2":

                    if (list.size() == 0) {
                        System.out.println("数据错误，请添加学生");
                        break;
                    } else {
                        System.out.println("删除学生");
                        del(list);
                        break;
                    }
                case "3":
                    if (list.size() == 0) {
                        System.out.println("无信息，请添加信息在查看");
                        //return;//为了不让程序往下执行
                        break;
                    } else {
                        System.out.println("修改学生");
                        exchange(list);
                        break;
                    }
                case "4":
                    if (list.size() == 0) {
                        System.out.println("无信息，请添加信息在查看");
                        //return;//为了不让程序往下执行
                        break;
                    } else {
                        System.out.println("查看所有学生");
                        findall(list);
                        break;
                    }
                case "5":
                    System.out.println("谢谢使用");
                    //break;
                    System.exit(0);//JVM退出
            }
        }
    }

    public static void add(ArrayList<Student> list) {
        //键盘录入学生信息
        Scanner sc = new Scanner(System.in);
        String name; //为了name和id在while外被访问到，定义在外部
        String id;
        while (true) {  //为了然程序能回到这里，使用循环
            System.out.println("请输入学生姓名：");
            name = sc.nextLine();
            System.out.println("请输入学生学号：");
            id = sc.nextLine();
            boolean flag = fff(list, id);
            if (flag) {
                System.out.println("你输入的学号已经被使用，请重新输入");
            }else
                break;

        }
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生家乡：");
        String home = sc.nextLine();
        //创建学生对象
        Student s = new Student(name, id, age, home);
        list.add(s);
    }

    public static void del(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入删除学生的学号：");
        String id = sc.nextLine();
        int num = -1;
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getId().equals(id)) {//判断输入删除的学号在所有学号中存在与否
                list.remove(i);
                num = i;
                break;
            }

            if (num == -1) {
                System.out.println("输入的学号错误，请重新输入");
            } else

                System.out.println("删除成功");
        }
    }

    public static void exchange(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入修改学生的学号：");
        String id = sc.nextLine();
        int num = -1;
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getId().equals(id)) {//判断输入删除的学号在所有学号中存在与否
                num = i;
                list.remove(i);//删除要修改的学号
                add(list);//添加一个新的
                break;
            }
            if (num == -1) {
                System.out.println("输入的学号错误，请重新输入");
            } else
                System.out.println("修改成功");

        }

    }

    public static void findall(ArrayList<Student> list) {//查看所有的学生信息
        System.out.println("姓名\t\t学号\t\t年龄\t\t家乡");
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + "\t\t" + s.getId() + "\t\t" + s.getAge() + "岁\t" + s.getHome());
        }
    }

    public static boolean fff(ArrayList<Student> list, String id) {
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getId().equals(id)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}

