package day01_code.demo04;

public class Zdzhuang {
    public static void main(String[] args) {
        Integer in = 1;//自动装箱
        in = in + 2 ;//自动拆箱
        System.out.println(in);

        String s1= "55";
        int anInt = Integer.parseInt(s1);//String---->int
        System.out.println(anInt);
        int i = 47;
        String s = String.valueOf(i);//int---->String
        System.out.println(s);
    }
}
