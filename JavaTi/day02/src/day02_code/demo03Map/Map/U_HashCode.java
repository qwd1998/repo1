package day02_code.demo03Map.Map;

import java.util.*;

public class U_HashCode {
    public static void main(String[] args) {
        show01();
        //show02();
       // show03();
    }

    private static void show03() {
        LinkedHashMap<Student,String> map = new LinkedHashMap<>();
        map.put(new Student("秦皇",45),"咸阳");
        map.put(new Student("唐宗",47),"长安");
        map.put(new Student("宋祖",45),"洛阳");
        Set<Student> students = map.keySet();
        for (Student s : students) {
            String s1 = map.get(s);
            System.out.println(s+"--->"+s1);
        }
    }

    private static void show02() {
    /*
    key：Student类型  需要重写hashcode和equals方法
    value：String类型
     */
        HashMap<Student,String> map = new HashMap<>();
        map.put(new Student("秦始皇",45),"咸阳");
        map.put(new Student("唐太宗",47),"长安");
        map.put(new Student("赵匡胤",45),"洛阳");
        Set<Student> set = map.keySet();
        for (Student student : set) {
            String s = map.get(student);
            System.out.println(student+"  "+s);
        }

    }

    private static void show01() {
        /*
        HashMap存储自定义类型键值：
        key：String类型  重写了hashcode和equals方法
        value：Student类型  可以重复
         */
        HashMap<String, Student> map = new HashMap<>();
        map.put("北京", new Student("守护王族", 21));
        map.put("上海", new Student("王二代", 29));
        map.put("东京", new Student("菊花信", 39));
        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            Student student = map.get(next);
            System.out.println(next + "  " + student);
        }
        Collection<Student> values = map.values();
        System.out.println(values);
    }
}
