package day03_code.TreadWaitAndNotify02;

public class Demo {
    public static void main(String[] args) {
        Baozi bz = new Baozi();
        new BaoziPU(bz){}.start();
        new ChiHuo(bz){}.start();

    }
}
