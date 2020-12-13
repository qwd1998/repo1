package day07_code.demo03FFyingyong;

public class Demo01RerObject {
    public static void main(String[] args) {
        //类存在，静态成员方法也存在
        int meth = meth(-10, (n) -> {

            return Math.abs(n);
        });
        System.out.println(meth);
        //使用方法引用优化Lambda表达式
        int meth1 = meth(-10, Math::abs);
        System.out.println(meth1);
    }



    public static int meth(int s, Calcable calcable) {
        //定义一个静态方法，通过类名称直接引用静态成员方法
        //计算传递绝对值的方法
        return calcable.calsAsb(s);
    }
}
