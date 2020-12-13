package cn.itcast.day07.demo01;
/* 注意：1.不能通过接口实现类的对象来调用接口中的静态方法
        2.通过接口名称，直接调用静态方法
* */
public class Dem03InterfaceStatic {
    public static void main(String[] args) {
        //创建实现类对象
        U_static st = new U_static();

        //错误方法
       // st.methoStatic();

        //正确方法
        Static.methoStatic();
        PrivateBstatic.methoStatic2();
        st.methoDefault1();
    }
}
