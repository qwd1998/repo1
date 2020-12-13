package cn.itcast.day07.demo01;
/*1.接口的默认方法可以从实现类对象中直接调用
2.接口的默认方法也可以被接口实现类覆盖重写
*/
public class Demo02InterfaceDefault {
    public static void main(String[] args) {
        U_defaultA a = new U_defaultA();
          a.methodAbs();

        //调用新加的方法，如果实现类没有。向接口找
        a.methoDefault();

       U_defaultB b = new U_defaultB();
       b.methodAbs();

        //实现类B覆盖重写了接口的默认方法
       b.methoDefault();
    }
}
