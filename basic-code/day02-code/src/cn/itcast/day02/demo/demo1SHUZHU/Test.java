package cn.itcast.day02.demo.demo1SHUZHU;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        CreditApply c1 = new CreditApply("1001","张三","抵押",100000.5);
        CreditApply c2 = new CreditApply("1002","李四","质押",50000D);
        CreditApply c3 = new CreditApply("1003","王五","质押",30000D);
        CreditApply c4 = new CreditApply("1004","赵六","抵押",60000.51);

        BufferedWriter bw = new BufferedWriter(new FileWriter("credit.txt",true));

            bw.write("("+c1.getSerialno()+","+c1.getName()+","+c1.getVouchType()+","+c1.getSum()+")");
            bw.write("("+c2.getSerialno()+","+c2.getName()+","+c2.getVouchType()+","+c2.getSum()+")");
            bw.write("("+c3.getSerialno()+","+c3.getName()+","+c3.getVouchType()+","+c3.getSum()+")");
            bw.write("("+c4.getSerialno()+","+c4.getName()+","+c4.getVouchType()+","+c4.getSum()+")");
            bw.newLine();

        bw.close();
    }
}
