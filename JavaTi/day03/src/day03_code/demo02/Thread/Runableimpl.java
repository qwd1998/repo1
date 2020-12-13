package day03_code.demo02.Thread;

public class Runableimpl implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--"+i);
        }
    }
}
