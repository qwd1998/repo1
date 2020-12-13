package cn.itcast.day04.demo03;

public class U_Person {
    public static void main(String[] args) {
        Person [] array =new Person  [3];
        Person.room = "教室011";
        Person one = new Person("无敌",18);
        Person two = new Person("无2敌",199);
        array[0] = one;
        System.out.println(array);
        System.out.println();
        System.out.println(array[0]);
        System.out.println(array[0].getAge()+array[0].getName()+Person.room);
        System.out.println(two.getAge()+two.getName()+Person.room);

    }
}
