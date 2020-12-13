package day01_code.demo01;
/*
public boolean equals(Object obj) {
        return (this == obj);
    }
*public boolean equals(Object obj)指示其他某个对象是否与此对象“相等”。
 *Object类的equals方法，默认比较两个对象的地址值，需要重写比较两个对象的属性

  */
public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("656",44);
        Person p2 = new Person("656",44);
        System.out.println(p1);//重写了toString
        System.out.println(p2);
        boolean equals = p1.equals(p2);
        System.out.println(equals);
       /* p1=p2; //p2的地址赋给p1
        boolean equals1 = p1.equals(p2);
        System.out.println(equals1);*/
       /* public boolean equals(Object obj) {
            this----p1
            obj----p2
        return (this == obj);
    }
        }
    }*/
    }
}
