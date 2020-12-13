package day04_code.demo02;
/*
练习：使用递归计算1--n之间的和  递归效率低下
求 n!  为n的阶乘
 */
public class Recurison {
    public static void main(String[] args) {
        int i = sum1(5);
        System.out.println(i);
    }
    private static int sum1(int n){
        /*int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;*/

        if(n == 1){
            return 1;
        }
        return n*sum1(n-1);  //n+sum(n-1)
    }
}
