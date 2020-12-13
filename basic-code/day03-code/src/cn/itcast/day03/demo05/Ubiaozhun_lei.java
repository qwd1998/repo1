package cn.itcast.day03.demo05;

public class Ubiaozhun_lei {
    public static void main(String[] args) {


        biaozhun_lei stu = new biaozhun_lei();
        //System.out.println(stu.getAge()+stu.getName());
        stu.setAge(18);
        stu.setName("是说的");
        System.out.println("年龄:"+stu.getAge()+" ,姓名:"+stu.getName());
        System.out.println("========");

        biaozhun_lei stu1 = new biaozhun_lei("我说的", 22);
        System.out.println("年龄:"+stu1.getAge()+" ,姓名:"+stu1.getName());
        System.out.println("========");

        stu1.setAge(28);
        System.out.println("年龄:"+stu1.getAge()+" ,姓名:"+stu1.getName());

    }
}