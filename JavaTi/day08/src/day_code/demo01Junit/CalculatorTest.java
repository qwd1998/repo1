package day_code.demo01Junit;

public class CalculatorTest {
    public static void main(String[] args) {
        int add = new Calculator().add(10, 20);
        System.out.println(add);
        int sub = new Calculator().sub(10, 20);
        System.out.println(sub);
    }
}
