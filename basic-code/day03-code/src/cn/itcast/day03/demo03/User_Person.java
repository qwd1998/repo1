package cn.itcast.day03.demo03;

public class User_Person {
    public static void main(String[] args) {
        Person per = new Person();
        per.setAge(110);
        per.setName("凯凯");
        per.setMale(true);
        System.out.println("年龄"+per.getAge()+"  姓名"+per.getName()+"  性别男"+per.isMale());
    }
}
