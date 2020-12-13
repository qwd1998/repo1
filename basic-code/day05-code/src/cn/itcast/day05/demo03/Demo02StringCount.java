package cn.itcast.day05.demo03;

import java.util.Scanner;

/*题目：键盘输入一个字符串，并且统计各种字符出现的种类
种类有：大写字母，小写字母，数字，其他


思路：
1.键盘输入Scanner
2.String str =sc.next();获取输入的字符串
3.
3.需要一个一个字符去检查，所以需要tocharArray
*
*
* */
public class Demo02StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串");
        String input = sc.next();//获取键盘输入的字符串

        int countU = 0;
        int countl = 0;
        int countnum = 0;
        int countother = 0;
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ('A' <= ch && ch<='Z') {
                countU++;
            }
            else if ('a' <= ch && ch<='z') {
                countl++;
            }
            else if ('0' <= ch && ch<='9') {
                countnum++;
            }
            else{
                countother++;
            }
        }
        System.out.println("大写字母有："+countU+"个");
        System.out.println("小写字母有："+countl+"个");
        System.out.println("数字有："+countnum+"个");
        System.out.println("其他有："+countother+"个");
    }
}
