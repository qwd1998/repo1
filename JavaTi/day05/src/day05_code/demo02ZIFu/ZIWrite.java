package day05_code.demo02ZIFu;

import java.io.FileWriter;
import java.io.IOException;

/*
写入字符流的抽象类。子类必须实现的方法仅有 write(char[], int, int)、flush() 和 close()。
protected  FilterWriter(Writer out)
          创建一个新的 filtered writer。

 void write(char[] cbuf, int off, int len)
          将字符写入数组的某一部分。
 void write(int c)
          写入单个字符。
 void write(String str, int off, int len)
          写入一部分字符串。

 */
public class ZIWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("a.txt",true);
        //fw.flush();
        String st1 = "axxxcdaxc";
        char [] a = {'a','b','c','d','e','f',};
        for (int i = 0; i < 5; i++) {
            fw.write(a,0,5);
            fw.write(st1,0,2);
            fw.write("德玛");
            fw.write("\r\t");
        }

        fw.close();//关闭之后不能flush

    }
}
