package cn.itcast.day04.StudentMang;

public class Student {
    private String name;
    private String id;
    private String age;
    private String home;

    public Student() {
    }

    public Student(String name, String id, String age, String home) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
