package cn.itcast.day03.demo02;
/*成员变量
成员方法
*/
public class Phone {
    String brand;
    double price;
    String color;
    public void call(String who){
        System.out.println("给"+ who+"打电话");
    }
    public  void duanxin(){
        System.out.println("短信内容");
    }
}
