package day04_code.demo02;

import java.io.File;
import java.io.FileFilter;

public class aazxc {
    public static void main(String[] args) {

        sum(new File("D:\\照片"));
      //  sum(new File("D:\\照片"));

    }
    private static void sum(File file){
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory()||pathname.getName().endsWith(".txt");
            }
        });

        for (File file1 : files) {
            if (file1.isDirectory()){
                sum(file1);
            }
            else{
                System.out.println(file1);
            }
        }
    }
}
