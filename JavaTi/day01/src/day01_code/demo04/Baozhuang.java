package day01_code.demo04;
/*装箱：把基本类型的数据，包装到包装类中
构造方法：Integer(int value)
          构造一个新分配的 Integer 对象，它表示指定的 int 值。
        Integer(String s)
          构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
静态方法：static Integer valueOf(int i)
          返回一个表示指定的 int 值的 Integer 实例。
        static Integer valueOf(String s)
          返回保存指定的 String 的值的 Integer 对象。
拆箱：从包装类中取出基本类型

* */
public class Baozhuang {
    public static void main(String[] args) {
        Integer i1 =  Integer.valueOf(5);
        System.out.println(i1);

        //拆箱
        int i2 = i1.intValue();
        System.out.println(i2);
    }
}
