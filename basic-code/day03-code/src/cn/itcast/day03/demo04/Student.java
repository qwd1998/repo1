package cn.itcast.day03.demo04;

/*构造方法就是专门来创建对象的方法，当我们通过new
来创建对象时，就是调用构造方法
格式  public  类名称（）{
    方法体
}
注意：1构造方法的名称必须和所在类名称完全一样，
2.构造方法不需要void和static
3.构造方法不能return一个具体返回值
4.如果没有编写构造方法，那么编译器会赠送一个，如果编写了，就不送
5.构造方法也可以用重载
 */
public class Student {


    private String name;
    private int age;

    public Student() {
        System.out.println("无惨构造方法执行了");
    }
    public Student(String name, int age) {
        System.out.println("全参构造方法执行了");
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;

    }
}
