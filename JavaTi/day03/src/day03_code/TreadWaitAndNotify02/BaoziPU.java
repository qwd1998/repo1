package day03_code.TreadWaitAndNotify02;

/*
注意：1.包子和包子铺线程关系为  通信（互斥）
     2.
 */
public class BaoziPU extends Thread {
    private Baozi bz;

    public BaoziPU(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (bz) {
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {
                    bz.pi = "肉皮";
                    bz.xian = "猪肉馅";
                }
                if (count % 2 == 1) {
                    bz.pi = "面皮";
                    bz.xian = "狗肉馅";
                }
                count++;
                System.out.println("包子铺正在生产" + bz.pi + " " + bz.xian+"的包子");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    bz.flag = true;
                    bz.notify();
                    System.out.println("包子铺已经生产好了" + bz.pi + " " + bz.xian+"的包子");
                }
            }
        }
    }

