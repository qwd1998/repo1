package cn.itcast.day05.demo01;
/*String获取相关的方法：
publi int length();获取字符串的长度
public String concat(String str) 将当前字符串和参数字符串拼接成一个为返回值的新字符串
public char charAt(int index) 获取索引位置的某一个字符串
public int indexOf(String str)查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1
 */
public class Demo03StringGet {
    public static void main(String[] args) {
        int length = "asdasdadadsad".length();
        System.out.println("字符串的长度"+length);
        String str1 = "qwer";
        String str2 = "sss";
        String str3 = str1.concat(str2);
        System.out.println(str3);

        //获取指定字符串的单个字符串
        char ch = str1.charAt(2);
        System.out.println("在1号索引位置的字符为："+ch);

        //查找参数字符串在本字符串当中出现第一次索引位置
        String str4 = "HelloWorld";
        int a=str4.indexOf("ll");//在str4中查找ll第一次出现的位置，如果没有是-1
        System.out.println("第一次索引值为"+a);
        int b=str4.indexOf("a");
        System.out.println("第一次索引值为"+b);

    }
}
