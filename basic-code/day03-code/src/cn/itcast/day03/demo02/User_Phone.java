package cn.itcast.day03.demo02;

public class User_Phone {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.brand = "华为";
        ph.color = "red";
        ph.price = 2999.00;
        System.out.println(ph.brand);
        System.out.println(ph.color);
        System.out.println(ph.price);

        ph.call("张三");
        ph.duanxin();
    }
}
