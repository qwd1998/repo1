package cn.itcast.day03.demo05;
/*一个标准的类需要下方4个要求
1.所有的成员变量需要使用private
2.为每一个成员变量添加set/get
3.编写一个无参数的构造方法
4.编写一个全参数的构造方法
 */
public class biaozhun_lei {
    private String name;
    private int age;

    public biaozhun_lei() {
        System.out.println("里面什么都没有");
    }

    public biaozhun_lei(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
