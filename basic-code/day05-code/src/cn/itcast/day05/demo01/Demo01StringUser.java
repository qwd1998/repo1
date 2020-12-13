package cn.itcast.day05.demo01;

/*  == 是地址的比较，如果要比较内容需要两个方法:
1.public boolean equals(object obj)参数可以是任何一个对象，内柔应用是true
如果要比较一个常量和变量，常量写在前面
        System.out.println("abc".equals(str4));
2.public boolean equalsIgnoreCase(String str);忽略大小写
*/
public class Demo01StringUser {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABC";

        char [] chararray = {'A','B','C'};
        String str3 = new String(chararray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));//对称性，与上方一样
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));

        byte [] bytearray={'a','b','c'};
        String str4 = new String(bytearray);
        System.out.println(str4.equals(str3));

        System.out.println("abc".equals(str4));
        System.out.println(     );
        System.out.println(str3.equalsIgnoreCase(str4));


    }
}
