package cn.itcast.day03.demo03;

// private 不能直接访问，要间接访问 其他类型要set/get  boolean需要set/is
//private 可以阻止不合理的量输出
public class Person {
    private String name;
    private int age;
    private boolean male;

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        if (num < 100 && num > 0) {
            age = num;
        } else {
            System.out.println("数据错误");
        }

    }

    public int getAge() {
        return age;
    }

    public void setMale(boolean a) {
        male = a;
    }

    public boolean isMale() {
        return male;
    }
}
