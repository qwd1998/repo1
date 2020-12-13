package day05_code.demo04Bufferedwenjian.demo04Buffered;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class Paixu {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\照片\\新建文本文档.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\新建文本文档.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            String[] split = line.split("\\.");
            map.put(split[0], split[1]);
        }
        Set<String> set = map.keySet();
        for (String s : set) {
            String s1 = map.get(s);
            line = s + "." + s1;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
