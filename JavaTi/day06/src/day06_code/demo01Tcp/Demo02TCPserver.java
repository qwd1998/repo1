package day06_code.demo01Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
java.net.ServerSocket此类实现服务器套接字
ServerSocket(int port)
          创建绑定到特定端口的服务器套接字。

 Socket accept()
          侦听并接受到此套接字的连接。
 服务器的实线步骤：
 1.创建服务器ServerSocket对象和指定的端口号
 2.使用ServerSocket对象中的accept方法获取到请求的客户端对象Socket
 3.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream
 4.使用InputStream对象中的read方法，读取客户端发送来的数据
 5.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream
 6.使用OutputStream对象中的write方法，给客户端回写数据
 7.释放资源

 */
public class Demo02TCPserver {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        int len = 0;
        byte a [] = new byte[1024];
        while((len=is.read(a))!=-1){
            System.out.println(new String(a,0,len));
            OutputStream os = socket.getOutputStream();
            os.write("收到谢谢".getBytes());
        }
        socket.close();
        server.close();

    }
}
