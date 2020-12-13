package cn.itcast.day05.demo02;
/*字符串的截取方法
* public String substring(int index);从参数位置到结尾截取一个新的字符串
* public String substring(int begin,int index) 区间为[begin,index)
*
* */
public class Demo01Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        int i = str1.lastIndexOf('o');
        System.out.println(i);
        System.out.println(str2);
        String str3 = str1.substring(0,4);
        System.out.println(str3);
    }
}
