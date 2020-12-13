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
public class Demo02StringCount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String str = sc.next();
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        char [] a =str.toCharArray();
        for (int i = 0; i<str.length();i++){
            if(a[i] <'Z' && a[i] >'A'){
                num1++;
            }
            else if(a[i] <'z' && a[i] >'a'){
                num2++;
            }
            else if(a[i] <'9' && a[i] >'0'){
                num3++;
            }
            else{
                num4++;
            }

        }
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
}
