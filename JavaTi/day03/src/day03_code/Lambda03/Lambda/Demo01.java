package day03_code.Lambda03.Lambda;

public class Demo01 {
    public static void main(String[] args) {
        invo(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        invo(10,20,(int a,int b )->{
            return a+b;
        });
    }
    //定义一个方法
    public static void invo(int a, int b ,Calculator c){
        int sum = a + b;
        System.out.println(sum);
    }
}
