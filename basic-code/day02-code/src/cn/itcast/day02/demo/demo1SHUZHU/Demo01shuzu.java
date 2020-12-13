package cn.itcast.day02.demo.demo1SHUZHU;
//数组表示方法和比较10数字大小并且按照从小到大输出

public class Demo01shuzu {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5};  //数组的定义方法 标准格式
        for (int i = 0; i < 3; i++) {
            System.out.println(array1[i]);


        }
        System.out.println("=====");
        int[] array12 = new int[5];
        array12[4] = 11;//数组的定义方法 标准格式
        System.out.println(array12);  //内存地址
        System.out.println(array12[4]);
        System.out.println("=====");

        String[] array2 = new String[]{"1,2,3,4", "1,2,3", "1,2,4"};  //数组的定义方法
        for (int i = 0; i < 3; i++) {
            System.out.println(array2[i]);


        }
        System.out.println("=====");
        String[] array3 = {"1,4", "1,3", "1,2,4"};  //数组的定义方法  省略格式
        for (int i = 0; i < 3; i++) {
            System.out.println(array3[i]);


        }
        System.out.println("=====");

        int[] num = {12, 13, 14, 1, 5, 6, 7, 8, 9, 10,};
        int i;
        int j;
        for (i = 0; i < num.length; i++) {
            for (j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    int k;
                    k = num[j];
                    num[j] = num[i];
                    num[i] = k;
                }
            }
            System.out.println("排序为：" + num[i]);  //第一种排序方法

        }
        System.out.println("==========");
        for (i = 0; i < num.length; i++)
            System.out.println("排序为：" + num[i]); //第二种排序方法

        System.out.println("==========");
        //int a =num.length;
        System.out.println("数组的长度" + num.length);
        int max = num[0];
        for (i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }

        }
        System.out.println("==========");
        System.out.println("最大值：" + max); //第一种最大值方法

        int k;
        for (i = 1; i < num.length; i++) {
            if (num[i - 1] > num[i]) {
                k = num[i - 1];
                num[i - 1] = num[i];
                num[i] = k;
            }

        }
        System.out.println("==========");
        System.out.println("最大值：" + num[i - 1]); //第二种最大值方法
        /*for (int min1 = 0, max1 = num.length - 1; min1 < max1; min1++, max1--) {
            int temp = num[min1];
            num[min1] = num[max1];
            num[max1] = temp;
        }
        for (int i1 = 0; i1 < num.length; i1++)
        System.out.println(num[i1]);*/  //数组倒着打印输出，不能与上方排序一起执行，会错误
    }
}

