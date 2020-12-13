package day02_code.demo02;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

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
//重写排序的规则
    @Override
    public int compareTo(Student o) {
        //return 0;
        //自定义比较的规则(this的年龄和参数的年龄)
        return this.getAge()-o.getAge();//年龄升序排序
    }
}
