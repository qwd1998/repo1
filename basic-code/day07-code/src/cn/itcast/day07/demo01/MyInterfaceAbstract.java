package cn.itcast.day07.demo01;
/*任何java的接口都可以定义抽样方法
 格式：
 public abstract 返回值类型 方法名（参数列表）；

注意：
1.接口中的抽样方法，修饰符必须是：public abstract
2.这两个关键字修饰符，可以选着性省略

*/
public interface MyInterfaceAbstract {
    //抽样方法
    public abstract void methodAbs1();
     abstract void methodAbs2();
     public  void methodAbs3();
     public  default void methodAbs4(){
         System.out.println("默认方法可以了");
     }
}
