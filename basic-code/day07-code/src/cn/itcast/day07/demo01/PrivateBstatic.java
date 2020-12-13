package cn.itcast.day07.demo01;

public interface PrivateBstatic {
    public static void methoStatoc1(){
        System.out.println("静态方法A");
        com();
    }
    public static void methoStatic2(){
        System.out.println("静态方法B");
        com();
    }
    private static void com(){  //带上static的私有代码可以改变多个静态方法之间重复代码的问题
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
