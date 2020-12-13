package cn.itcast.day05.demo02;
/*
String与转换有关的常用方法
public char [] toCharArray(); 将当前字符串拆分为字符数组的返回值
public byte [] getBytes();获得当前字符串底层的字节数组

public String replace(CharSequence oldString,CharSequence newString);

 */
public class Demo02StringConvert {
    public static void main(String[] args) {
        //转换成字符数组
        String str1 = "HelloWorld";
        char[] chars = str1.toCharArray();

        System.out.println(str1.charAt(4));
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        System.out.println(   );

        //转换成字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //字符串的内容替换
        String str2 ="How are you";
      String str3 =  str2.replace("o","8");
        System.out.println(str3);
    }
}
