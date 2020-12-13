package day03_code.TreadWaitAndNotify;
/*
等待唤醒案例：线程之间的通信
 1.创建一个顾客线程（消费者）：告知老板要的包子的种类和数量
    调用wait方法，放弃cpu执行，进入无线等待模式
 2.创建一个老板线程：花5秒钟做包子，调用notify方法，唤醒顾客吃包子

 注意：1.顾客和老板线程必须使用同步代码块包裹，保证等待和唤醒只能有一个在执行
      2.同步使用的锁对象必须保证唯一
      3.只有锁对象才能调用外套和notify方法
 */
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        //创建一个锁对象
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("告诉老板需要的包子");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后
                    System.out.println("包子已经做好了，开吃");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("老板5秒钟做好包子，告诉顾客");
                    obj.notify();
                }
            }
        }.start();
    }
}
