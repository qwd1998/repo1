package day02_code.demo01;
/*
格式： 修饰符 返回值类型 方法名（数据类型...变量名 ）
 */
public class Kebiancanshu {
    public static void main(String[] args) {
        int add = add(10, 20, 30, 40, 50);
        System.out.println(add);
    }
    /*
    可变参数的注意事项：
        1.一个方法的参数列表，只能有一个可变参数
        2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
        public static void meth(String a,double b,int...a){}
     */
    private static int add(int...arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
