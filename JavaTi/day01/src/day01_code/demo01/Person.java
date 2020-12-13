package day01_code.demo01;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //比较地址是否相同，如果相同，直接返回true
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //向下转型
        Person person = (Person) o;
        //比较年龄是否相同
        if (age != person.age) return false;
        //比较姓名是否相同
        return name != null ? name.equals(person.name) : person.name == null;
    }


}
