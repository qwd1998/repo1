package cn.itcast.day04.demo03;

import java.util.Random;

/*Random类随机生成数字
1.导包
2.创建 Random r = new Random（）； 小括号留空
3.使用
获取一个随机的int（正负int都可以）
int num = r.nextInt();
int num = r.nextInt(5);表示范围为[0,5)
 */
public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数字为："+num);
        System.out.println("==========");
        for (int i = 0; i < 10; i++) {
            int a = r.nextInt(10);
            System.out.println("范围是："+a);
        }
    }

}
