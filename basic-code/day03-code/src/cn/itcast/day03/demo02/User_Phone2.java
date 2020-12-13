package cn.itcast.day03.demo02;

public class User_Phone2 {
    public static void main(String[] args) {
        Phone ph = new Phone();
        System.out.println(ph.brand);
        System.out.println(ph.color);
        System.out.println(ph.price);
        System.out.println("==========");
        ph.brand = "华为";
        ph.color = "red";
        ph.price = 2999.00;
        System.out.println(ph.brand);
        System.out.println(ph.color);
        System.out.println(ph.price);

        ph.call("张三");
        ph.duanxin();
        System.out.println("==========");

      //  Phone ph2 = new Phone();
        Phone ph2 = ph;
        System.out.println(ph2.brand);
        System.out.println(ph2.color);
        System.out.println(ph2.price);
        System.out.println("==========");
        ph2.brand = "小米";
        ph2.color = "blue";
        ph2.price = 2999.00;
        System.out.println(ph2.brand);
        System.out.println(ph2.color);
        System.out.println(ph2.price);

        ph2.call("赵凯");
        ph2.duanxin();
       char [] str ={1,2,3,4,5,6,7,8} ;
        System.out.println((int)str[0]);
    }
}
