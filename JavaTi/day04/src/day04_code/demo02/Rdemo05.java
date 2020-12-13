package day04_code.demo02;

import java.io.File;
import java.io.FileFilter;

public class Rdemo05 implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()){
            return true;
        }else{
            return pathname.getName().endsWith(".txt");
        }
    }
}
