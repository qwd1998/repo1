package day05_code.demo01IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件的复制，一读一写

 */
public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\照片\\桌面.jpg");
        FileOutputStream fos = new FileOutputStream("E:\\桌面.jpg");
        int len = 0;
        byte [] a = new byte[1024];
        while((len = fis.read(a))!=-1){
            /*System.out.println(len);*/
            fos.write(a,0,len);
        }
        //先关写的，再关读的
        fos.close();
        fis.close();
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);


    }
}
