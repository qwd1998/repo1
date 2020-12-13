package day03_code.TreadWaitAndNotify;
/*
进入到TimeWaiting（计时等待 ）有两种方式
1.使用sleep（）方法，在毫秒值结束后，进入Runnable/Blocked状态
2.使用wait（）方法，如果在毫秒值之后，还没有被notify唤醒，会自动进入Runnable/Blocked状态
 */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        //创建一个锁对象
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("2告诉老板需要的包子");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后
                    System.out.println("包子已经做好了，2开吃");
                }
            }
        }.start(); new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("1告诉老板需要的包子");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后
                    System.out.println("包子已经做好了，1开吃");
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
                    obj.notifyAll();
                }
            }
        }.start();
    }
}
