package day_code.test;

import day_code.demo01Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    /*
    初始化方法，用于资源申请，所有测试方法在执行之前都要执行该方法

     */
    @Before
    public void init(){
        System.out.println("init ...");
    }

    /*
    释放资源方法：
    在所有测试方法执行后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("close...");
    }




    /*
    测试add方法
     */
    @Test
    public void testAdd(){
       // System.out.println("我被执行了");
        Calculator calcuator = new Calculator();
        int add = calcuator.add(10,20);
        //System.out.println(add);
        //断言 我断言这个结果是多少
        Assert.assertEquals(30,add);

    }
    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int sub = calculator.sub(10,20);
        Assert.assertEquals(-10,sub);
    }
}
