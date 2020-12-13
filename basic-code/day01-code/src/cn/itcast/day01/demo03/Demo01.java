package cn.itcast.day01.demo03;
/*
题目：定义一个方法，比较两个数字的大小
题目：定义一个方法，判断两个数字是否相同
*/
public class Demo01 {
    public static void main(String[] args) {
        shuzi(10,12);
       // System.out.println(shuzi(10,12));
        System.out.println("=======");
        System.out.println(suzhi1(10,20));  //是否相同
    }

    public static int shuzi(int a,int b) {
        int sz;
        if(a > b){
            sz=a;
        }else {
            sz=b;
        }
        System.out.println("最大值为："+sz);//比较大小
        return sz;
    }

    public static boolean suzhi1(int a,int b) {
      /*  boolean suzhi1;
        if(a == b){
            suzhi1 = true;
        }else {
            suzhi1 = false;
        }   第一种方法 相同或不同*/
        return a == b;  //第二种方法 相同或不同
    }
}
