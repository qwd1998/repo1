package cn.itcast.day07.demo04;

public class Computer {
    public void powerOn(){
        System.out.println("电脑开机");
    }
    public void powerOff(){
        System.out.println("电脑关机");
    }
    //使用USB设备的方法，参数为接口
    public void useDevice(Usb u){
        u.open();
        if (u instanceof Shixian_s){//先判断，再转型
            Shixian_s u1 = (Shixian_s)u;
            u1.dian();
        }else if(u instanceof Shixian_j){
            Shixian_j u2 = (Shixian_j)u;
            u2.shuru();
        }
        u.close();
    }
}
