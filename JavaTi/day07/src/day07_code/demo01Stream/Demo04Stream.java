package day07_code.demo01Stream;

import java.util.*;
import java.util.stream.Stream;

/*
1.Stream.forEach，用来遍历流中的数据，这是一个终结方法，遍历之后，不能使用Stream的其他方法
2.Stream.filter为过滤方法
  Stream为管道流，只能被使用一次，第一个流使用之后，数据传到第二个流中，
第一个流不存在数据
3.映射Stream.map
4.Stream.count(); 是一个终结方法，返回值是一个long类型的，使用使用后，不能调用其他方法
 count是统计stream流中的元素个数
5.Stream.limit();是一个延迟方法，截取流的元素，返回是一个新的流
6.Stream.skip();跳过前几个元素
7.Stream.concat();连接两个流
 */
public class Demo04Stream {
    public static void main(String[] args) {
        demo01();
         demo02();//filter
         demo03(); //map
        demo04();//count
         demo05();//limit
        demo06();//skip
        demo07();//conact

    }

    private static void demo07() {
        Stream<String> stream = Stream.of("张三", "王五", "赵四", "勾起");
        Stream<String> stream1 = Stream.of("张三丰", "张卫健", "赵敏", "周主任");
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach((s)->{
            System.out.println(s);
        });
    }

    private static void demo06() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> skip = stream.skip(4);
        skip.forEach(i -> System.out.println(i));
    }

    private static void demo05() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> limit = stream.limit(4);//截取前4个元素
        limit.forEach(i -> System.out.println(i));
    }

    private static void demo04() {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        long count = stream.count();
        System.out.println(count);
    }

    private static void demo03() {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "56");
        Stream<Object> stream1 = stream.map(s-> Integer.parseInt(s));
        stream1.forEach(i -> System.out.println(i));
    }

    private static void demo02() {
        Stream<String> stream = Stream.of("张三丰", "张卫健", "赵敏", "周主任");
        Stream<String> stream1 = stream.filter((name) -> { //filter为过滤方法
            return name.startsWith("张");
        });
        stream1.forEach(name -> System.out.println(name));
    }

    private static void demo01() { //获取一个stream流
        Stream<String> stream = Stream.of("张三", "王五", "赵四", "勾起");
        // stream.forEach(name-> System.out.println(name));
        //上方为Lambda表达式的简化形式
        stream.forEach((name) -> {
            System.out.println(name);
        });
    }

}
