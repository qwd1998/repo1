package day06_code.demo02.FunctionHanshu;

public class Demo {
    public static void main(String[] args) {
        show01(new FunctionIterface() {
            @Override
            public void meth() {
                System.out.println("使用匿名内部类重写了方法");
            }
        });
        show01(()->{
            System.out.println("使用Lambda方法重写了方法");
        });
        show01(new Funtionalimpl());
    }

    private static void show01(FunctionIterface fun) {
        fun.meth();

    }
}
