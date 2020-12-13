package cn.itcast.day01.demo03;
/*
求出1到100所有的和
*/
public class Demo02 {
    public static void main(String[] args) {
        System.out.println("结果为："+sum());
        System.out.println("======");
        int num = sum();
        System.out.println("和为："+num);
    }

    public static int sum() {
        int sum1 = 0;
        for (int i = 0; i < 101; i++) {
            sum1 += i;
        }
        return sum1;
    }
}
