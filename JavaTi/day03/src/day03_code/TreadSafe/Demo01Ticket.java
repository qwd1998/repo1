package day03_code.TreadSafe;

public class Demo01Ticket {
    public static void main(String[] args) {
        Runnable r1 = new Runnableimpl();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);
        t1.start();
        t3.start();
        t2.start();
    }
}
