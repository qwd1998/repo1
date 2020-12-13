package cn.itcast.day06.demo01;

public class Zi extends Fu {
    int num = 10;
    public void zii(){
        int num = 11;
        System.out.println(num); //本类的num11
        System.out.println(this.num);  //子类的num10
        System.out.println(super.num);  //父类的num1
    }

    @Override
    public void fang() {
        System.out.println("子类方法执行");
    }
}
