package cn.itcast.day01.demo02;

public class Demo02define {
    public static void main(String[] args) {
        sum(10, 20); //单独调用
        System.out.println("=======");

        System.out.println(sum(10, 20)); //打印调用 30
        System.out.println("=======");

        int num = sum(15, 25); //赋值调用
        num += 100;
        System.out.println("变量的值：" + num);//140
    }

    public static int sum(int a, int b) {
       // System.out.println("方法执行！");
        int result = a + b;
        return result;
    }
}
