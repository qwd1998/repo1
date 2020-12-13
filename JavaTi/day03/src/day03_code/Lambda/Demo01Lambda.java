package day03_code.Lambda;
/*
Lambda标准格式：
1.一些参数
2.一个箭头
3.一段代码

格式：  （参数列表）->{一些重写方法的代码}
 */
public class Demo01Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方法创建新线程
        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
            }
            }.start();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
        }).start();
//Lambda省略模式
        new Thread(()-> System.out.println(Thread.currentThread().getName()+"创建了一个新的线程")).start();

        new Cook(){
            @Override
            public void makecook() {
                System.out.println("吃饭了");
            }
        }.makecook();

        invokecook(new Cook() {
            @Override
            public void makecook() {
                System.out.println("吃饭了");

            }
        });

//Lambda方法
        invokecook(()->{
            System.out.println("吃饭了");
        });
        //Lambda方法 省略模式
        invokecook(()->
            System.out.println("吃饭了")
        );


}
    public static void invokecook(Cook cook){
        cook.makecook();
    }

}
