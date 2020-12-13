package day07_code.demo07FFyingyong;

/*
类的构造器引用
 */
public class Demo {
    public static void main(String[] args) {
        /*
            已知创建的就是int [] 数组
            数组的长度也是已知的
            int [] 引用new，根据参数传递的长度来创建数组
         */
       int  [] arr=  meth(5,int[]::new);
        System.out.println(arr.length);

    }


    public static int[] meth(int num, IntBuilder ib) {
        ib.builderArray(num);
        return new int[num];
    }
}
