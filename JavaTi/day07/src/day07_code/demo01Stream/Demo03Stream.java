package day07_code.demo01Stream;
/*
JDK1.8之后，出现了Stream流，关注是做什么，而不是怎么做
java.util.stream.Stream<T> 是java8新加入的常用的流接口（不是函数式接口）
1.所用的Collection集合都可以通过Stream的默认方法获取流
    default Stream<E> stream();
2.Stream接口的静态方法of可以获取数组对应的流
   static <T> Stream<T> of(T...values)
   参数为可变参数，那么我们就可以传递一个数组
 */
import java.util.*;
import java.util.stream.Stream;

public class Demo03Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set= new HashSet<>();

        Stream<String> stream = list.stream();
        Stream<String> stream1 = set.stream();

        Map<String,String> map = new HashMap<>();
        Set<String> keySet = map.keySet();
        Stream<String> stream2 = keySet.stream();

        Collection<String> values = map.values();
        Stream<String> stream3 = values.stream();

        //获取键值对
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entrySet.stream();

        //把数组转换成Stream流
        Stream<Integer> stream5 = Stream.of(1,2,3,4,5);

        Integer [] a = {1,2,5,8,6};
        Stream<Integer> stream6 = Stream.of(a);
    }
}
