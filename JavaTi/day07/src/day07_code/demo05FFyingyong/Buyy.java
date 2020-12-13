package day07_code.demo05FFyingyong;

public class Buyy {
    public void che(){
        System.out.println("买了一辆兰博基尼");
    }
    public void eee(Buy buy){
        buy.house();
    }
    public void show(){
        eee(this::che);
    }

    public static void main(String[] args) {
        new Buyy().show();
    }
}
