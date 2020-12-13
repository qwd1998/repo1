package cn.itcast.day07.demo05;

public class Phone {
   public void op(){
        System.out.println("打开手机玩抖音");
    }

   public void U_d(USB usb){
        usb.open();
        usb.speak();
        if(usb instanceof shijp){
            shijp usb1 = (shijp)usb;
            usb1.aaa();
        }
       if(usb instanceof shisb){
           shisb usb2 = (shisb)usb;
           usb2.sss();
       }

        usb.close();
    }
    public  void cl(){
        System.out.println("关闭手机保命要紧");
    }
}
