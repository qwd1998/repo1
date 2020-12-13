package day05_code.demo06ObjectOutputStream;

import java.io.Serializable;

/*
序列化和反序列化时候，会抛出NotSerializableException没有序列化异常
这个类要实现Serializable接口，启动序列化
static：静态关键字，静态优先于对象进入到内存中
        写static修饰的成员变量不能被序列化，序列化的是对象
transient关键字：瞬态关键字，不能被序列化

 */
public class Student implements Serializable {
    private String name;
    private int age;


    private static final long serialVersionUID = 15L;//手动添加序列号，保证反序列化不变

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
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

