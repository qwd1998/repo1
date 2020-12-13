package cn.itcast.day04.demo03;

import java.util.Random;
import java.util.Scanner;

/*题目：用代码模拟猜数字游戏
思路：
1.建立一个不在变化的随机数Random
2.需要键盘输入Scanner
3.得到两个数字，判断一下
如果太大提示太大了，并且重试
如果太小提示太小了，并且重试
猜中了，游戏结束
4.重试就是再来一次，循环无限while（true）
若有限次数 则运行一次i+1.
*/
public class Demo03Random_game2 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
       // System.out.println(num);
        int i = 0;
        while (true) {
            i++;
            System.out.println("请输入一个数字");
            int num1 = sc.nextInt();
            if (num1 > num) {
                System.out.println("太大了，请重试");
                System.out.println();

            } else if (num1 < num) {
                System.out.println("太小了，请重试");
                System.out.println();

            }else{
                System.out.println("恭喜你猜对了"+"一共猜了"+i+"次");
                break;
            }
            if(i == 7){
                System.out.println("次数用完");
                break;
            }
        }
        System.out.println("Game over");
    }
}