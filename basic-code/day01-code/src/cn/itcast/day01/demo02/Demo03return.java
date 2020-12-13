package cn.itcast.day01.demo02;
/*
定义一个方法，求出两个数字之和  算出结果要告诉调用者
定义一个方法，打印两个数字之和  算出结果直接显示(结果是)
*/
public class Demo03return {
    public static void main(String[] args) {
        int num = sum(10,20);
        System.out.println("返回值："+num);
        sum1(100,200);
    }

    public static int sum(int a ,int b ) {
        int sum = a + b;
        System.out.println("结果为："+sum);
        return sum;
    }

    public static void sum1(int a,int b) {
        System.out.println("=======");
        int sum1 = a + b;
        System.out.println("结果是："+sum1);
    }
}
