package cn.itcast.day07.demo02;

public class U_demo01 {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.meth();
        System.out.println();
        Demo01.Nei z = new Demo01().new Nei();//直接调用
        z.metha();
    }
}
