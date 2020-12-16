package cn.itcast.day02.demo.demo1SHUZHU;
//数组倒着打印输出   数组作为方法的参数  数组作为返回值类型


public class Demo02shuzu {
    public static void main(String[] args) {
        int[] num = {12, 13, 14, 1, 5, 6, 7, 8, 9, 10,};
        for (int min1 = 0, max1 = num.length - 1; min1 < max1; min1++, max1--) {
            int temp = num[min1];
            num[min1] = num[max1];
            num[max1] = temp;
        }
        for (int i1 = 0; i1 < num.length; i1++)
            System.out.println(num[i1]);  //数组倒着打印输出

        shuzu(num);
        int[] result = shuzu1(11, 12, 13);
        System.out.println("平均值：" + result[1]);
        System.out.println("和：" + result[0]);


    }

    public static void shuzu(int[] num) {
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }//方法调用数组

    public static int[] shuzu1(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int num1[] = {sum, avg};
        return num1;
    }



}


