package cn.itcast.day04.demo01;
import java.util.Scanner;

/*题目，键盘输入两个int，并求和
1.键盘输入要用Scanner
2.需要两个数字，所以要调用两次nextInt（）；
3，得到两个数字，需要加在一起
4.将结果打印输出

 */
public class Demo02Scannersum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("再输入第二个数字");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("结果为："+sum);

    }

}
