package day05_code.demo03Prop;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class DemoProp {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("皇子","158");
        prop.setProperty("皇子1","168");
        prop.setProperty("皇子2","178");

       FileWriter fw = new FileWriter("a.txt");
       /* Set<String> strings = prop.stringPropertyNames();
        for (String s : strings) {
            Object o = prop.get(s);
            System.out.println(s+o);和map类一样，是双列集合
        }*/
        prop.store(fw,"save");
        fw.close();

        FileReader fr = new FileReader("a.txt");
        prop.load(fr);
        Set<String> set = prop.stringPropertyNames();
        for (String s : set) {
            Object o = prop.get(s);
            System.out.println(s+o);
        }

        fr.close();
    }
}
