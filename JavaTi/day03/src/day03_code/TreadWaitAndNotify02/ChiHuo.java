package day03_code.TreadWaitAndNotify02;

public class ChiHuo extends Thread {
    private Baozi bz;

    public ChiHuo(Baozi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.flag == true) {
                    System.out.println("吃货正在吃" + bz.pi + " " + bz.xian + "包子");
                    bz.flag = false;
                    bz.notify();
                    System.out.println("吃货已经把" + bz.pi + " " + bz.xian + "包子吃完了");
                    System.out.println("-------------------------------");
                } else {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
