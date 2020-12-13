package cn.itcast.day07.demo05;
/*如果接口的实现类（或者父类的子类）只需要使用唯一一次
那么这种情况直接省略该类的定义，而改为使用 匿名内部类

匿名内部类的格式
接口名称 对象名 =  new 接口名称（）{
    //覆盖重写所有抽象方法
    };
 * 对格式进行解析 {  }这是匿名内部类的内容

 注意：
 1.匿名内部类在创建对象时，只能使用唯一一次
 2.
 *
 *
 */

public class DemoMain {
    public static void main(String[] args) {
        /*MyInter obj = new U_my();
        obj.meth();*/

        //匿名内部类
        MyInter obj = new MyInter() {
            @Override
            public void meth() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        obj.meth();




    }
}
