package cn.itcast.day07.demo01;
/* 从JAVA 8开始，接口允许定义默认方法
   格式：
   public default 返回值类型 方法名称（参数列表）{
        方法体
   }
*/
public interface Default {
    //抽样方法
    public abstract void methodAbs();
    //public abstract void methodAbs2();

    //新添加的方法改为默认方法
    public default void methoDefault(){
        System.out.println("这是一个默认方法");
    }
}
