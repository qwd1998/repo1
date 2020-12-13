package cn.itcast.day04.demo03;

import java.util.Random;

/*题目：根据int变量n的值，来获取随机数字，范围为[1,n]

思路：1.定义一个int变量n，随意赋值
    2.要使用Random
    3.如果是10 范围为0到9，想要1到10，整体加一
 */
public class Demo02Random {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();
        int num = r.nextInt(n);//范围为[0,5)
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n)+1;  //范围为[1,6)
            System.out.println("取得值为："+result);
        }

    }
}
