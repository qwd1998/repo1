package day06_code.demo05Consumer;

import java.util.function.Consumer;

/*
Consumer接口的默认方法andThen
作用：需要两个consumer接口，可以把两个Consumer接口组合在一起，在对数据进行消费
 例如：
 Consumer<String> con1
 Consumer<String> con2
 String s = "hello";
 con1.accept(s);
 con2.accept(s);
连接两个Consum接口，再进行消费
 con1.andThen(con22).accept
 */
public class Demo02ConsumerAndThen {
    public static void main(String[] args) {
        metho("dd",(String name1)->{
            System.out.println(name1.toLowerCase());
        },(String name2)->{
            System.out.println(name2.toUpperCase());
        });
    }
    public static void metho(String s, Consumer<String> con1,Consumer<String> con2){
        /*con1.accept(s);
        con2.accept(s);*/

        //使用andThen方法
        con1.andThen(con2).accept(s);
        //con1连接con2，先执行con1消费数据，再执行con2消费数据
        int a=12;

        a*=2+3;
        System.out.println(a);
    }
}
