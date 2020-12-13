package day06_code.demo05Consumer;

import java.util.function.Consumer;

public class Demo03ConsumerTest {
    public static void main(String[] args) {
        String [] arr = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};
        //调用Lamb表达式
        zz(arr,(a)->{
            String name = a.split(",")[0];
            System.out.println("姓名："+name);
        },(b)->{
            String sb = b.split(",")[1];
            System.out.println("性别："+sb);
        });
    }
    public static void zz(String [] arr, Consumer<String> con1,Consumer<String> con2){
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }
}
