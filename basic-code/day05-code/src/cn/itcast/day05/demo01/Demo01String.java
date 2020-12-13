package cn.itcast.day05.demo01;

/* String 3+1 的格式：
    String str = new String();
    String str = new String(char [] array);
    String str = new String(byte [] array);

    直接格式 String str = "HelloWorld";

    字符串的比较
    基本类型==是数字的比较
    引用类型== 是地址的比较
*/
public class Demo01String {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("第一个" + str1);

        /*char [] a = {'a','b'};
        String str54 = new String(a);*/

        char[] charArray = {'a', 'b', 'c'};
        String str2 = new String(charArray);
        System.out.println("第2个" + str2);

        byte [] bytearray = {97,98,99};
        String str3 = new String(bytearray);
        System.out.println("第3个" + str3);

        String str4 = "ABC";//直接“”在常量池中的
        String str5 = "ABC";
        char [] chararray = {'A','B','C'};
        String str6 = new String(chararray);

        System.out.println(str4==str5);
        System.out.println(str5==str6);
        System.out.println(str6==str4);
    }
}
