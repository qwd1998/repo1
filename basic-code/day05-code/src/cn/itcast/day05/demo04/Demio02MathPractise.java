package cn.itcast.day05.demo04;
/*  题目计算：-10.8到5.9之间，绝对值大于6或者小于2.1的整数的个数
* 分析：1. 确定了范围用for
* 2.起点位置-10.8应该为向上取整为-10；
* 强制类型转换为int 舍弃所有小数位
* 3.拿到绝对值Math.abs
* */
public class Demio02MathPractise {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int num = 0;
        for (int i =(int) min; i <(int) max; i++) {
            int abs = Math.abs(i);
            if(abs >6 || abs< 2.1){
                num++;
            }
        }
        System.out.println(num);
    }
}
