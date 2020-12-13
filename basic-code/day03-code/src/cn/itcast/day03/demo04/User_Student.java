package cn.itcast.day03.demo04;

public class User_Student {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu1 = new Student("sss", 18);

        System.out.println(stu1.getAge() + stu1.getName());
        //改变参数
        stu1.setAge(11108);
        System.out.println(stu1.getAge() + stu1.getName());

    }
}
