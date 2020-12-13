package cn.itcast.day07.demo02;

public class U_out {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.meI();

    }
}
