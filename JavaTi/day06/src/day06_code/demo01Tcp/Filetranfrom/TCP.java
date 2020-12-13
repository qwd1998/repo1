package day06_code.demo01Tcp.Filetranfrom;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
客户端使用本地字节输入流读取本地文件
呵护的使用网络字节输出流把读取到的文件上传到服务器
服务器使用网络字节输入流读取客户端上传的文件
服务器使用本地字节输出流，把读取到的文件写在服务器的硬盘上
服务器使用网络字节输出流，给客户端回写一个“上传成功”
客户端使用网络字节输入流，读取服务器回写的数据
释放资源
 */
public class TCP {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",888);
        FileInputStream fis = new FileInputStream("D:\\照片\\桌面.jpg");
        OutputStream os = socket.getOutputStream();
        int len = 0 ;
        byte a [] = new byte[1024];
        while((len = fis.read(a))!=-1){
            os.write(a,0,len);
        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        while((len =is.read(a))!=-1){
            System.out.println(new String(a,0,len));
        }
        fis.close();
        socket.close();
    }
}
