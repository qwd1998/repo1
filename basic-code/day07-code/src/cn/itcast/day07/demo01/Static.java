package cn.itcast.day07.demo01;
/* 格式：
    public static 返回值类型 方法名称（参数列表）{
        方法体
    }
提示： 就是把abstract或者default换成static
*/
public interface Static extends PrivateBstatic,PrivateA{
    public static void methoStatic(){
        System.out.println("这是一个静态方法");
    }
}
