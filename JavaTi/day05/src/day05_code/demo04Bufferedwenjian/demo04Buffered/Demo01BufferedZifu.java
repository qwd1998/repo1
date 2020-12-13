package day05_code.demo04Bufferedwenjian.demo04Buffered;

import java.io.*;

/*
搬运文件。先读，再写
HashMap会自动给k排序
*/
public class Demo01BufferedZifu {
    public static void main(String[] args) throws IOException {
     //show01();
     show02();
     show03();
    }

    private static void show03() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("b.txt"));
        String len ;
        char a [] = new char[1024];
        while((len=br.readLine())!=null){
            //System.out.println(new String(a,0,len));
            System.out.println(len);
        }
        br.close();
    }

    private static void show02() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("b.txt",true));
        for (int i = 0; i < 5; i++) {
            bw.write("德玛西亚");
            bw.newLine();
        }
        bw.close();
    }

    private static void show01() throws IOException {
        long l = System.currentTimeMillis();
        FileInputStream fr = new FileInputStream("D:\\照片\\桌面.jpg");
        BufferedInputStream br = new BufferedInputStream(fr);
        FileOutputStream fw = new FileOutputStream("E:\\桌面.jpg");
        BufferedOutputStream bw = new BufferedOutputStream(fw);
        int len = 0;
        byte a [] =new byte [1024];
        while((len=br.read(a))!=-1){
            bw.write(a,0,len);
        }
        bw.close();
        br.close();
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);

    }
}
