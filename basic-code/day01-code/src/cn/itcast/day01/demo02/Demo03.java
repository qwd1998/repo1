package cn.itcast.day01.demo02;
/*
方法有参数：小括号里有内容
例如：两个数字相加必须知道两个数
无参数：小括号当留空
例如：打印固定10次Hello
*/
public class Demo03 {
    public static void main(String[] args) {
        chengfa(10,20);
        int num = chengfa(11,10);
        System.out.println("乘积："+num);
        System.out.println("=========");
        dayin();
    }

    public static int chengfa(int a,int b) {
        int result = a * b;
        System.out.println("结果为："+result);
        return result;

    }
    public static void dayin(){
        for(int i = 0;i <= 10;i++){
            System.out.println("Hello"+i);
        }

    }
}
