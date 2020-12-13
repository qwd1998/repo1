package cn.itcast.day05.demo02;
/*
分割字符串的方法：
public String[] split(String regx);按照参数规则，分为若干份
如果以.为分割需要写”//.“
 */
public class DemoStringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,vvv,zzz";
        String  [] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        String str2 = "XXX.YYY.ZZZ";
        String [] array2 = str2.split(".");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        String [] array3 = str2.split("//.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
