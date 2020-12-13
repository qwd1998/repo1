package day02_code.demo01;
/*
哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址值），
是一个逻辑地址，是模拟出来的，不是实际的地址
可以用Objiect方法获取哈希值:
 public native int hashCode();

 */
public class Demo03HashCode {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        int i1 = p1.hashCode();
        int i2 = p2.hashCode();
        System.out.println(i1);
        System.out.println(i2);

        //String 重写了hashcode
        String str1 = "abc";
        String str2 = "abc";
        int code = str1.hashCode();
        int code1 = str2.hashCode();
        System.out.println(code);
        System.out.println(code1);

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());

    }
}
