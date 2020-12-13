package day05_code.demo01IO;

import java.io.FileOutputStream;
import java.io.IOException;

/*
FileOutputStream(String name, boolean append)
          创建一个向具有指定 name 的文件中写入数据的输出文件流。
 FileOutputStream(File file, boolean append)
          创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 boolean append 追加开关
  true：追加写不会覆盖
  false：创建一个新的

 */
public class FileOut {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =  new FileOutputStream("a.txt",true);
        for (int i = 0; i < 5; i++) {
            fos.write("我日哦".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();

    }
}
