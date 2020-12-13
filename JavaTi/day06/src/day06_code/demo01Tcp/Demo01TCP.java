package day06_code.demo01Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
TCP通信：面向连接的通信，客户端和服务器端必须经过三次握手，建立逻辑连接，才能通信
通信的步骤：
服务器端先启动，服务器端不会主动连接客户端，必须使用客户端请求服务器端
客户端和服务器端就建立一个逻辑连接，而这个连接包含了一个对象，
这个对象就是IO对象，客户端和我放弃端就可以使用IO对象进行通信，
通信的数据不仅仅是字符，使用IO对象是字节流对象

Socket(String host, int port)
          创建一个流套接字并将其连接到指定主机上的指定端口号
String host 服务器的主机名称//IP地址
 int port  服务器的端口号
InputStream getInputStream()
          返回此套接字的输入流。
 OutputStream getOutputStream()
          返回此套接字的输出流。
  void close()
          关闭此套接字。

实现步骤：
1.创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口号
2.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream
3.使用OutputStream对象中的write方法，给服务器发送数据
4.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream
5.使用InputStream对象中的read方法，读取服务器回写的数据
6.释放资源

注意：1.客户端和服务器进行交互，必须使用Socket提供的网络流，不能使用自己创建的流对象
2.3次握手建立通路，如果服务器没有启动，则报出异常
 */
public class Demo01TCP {
    public static void main(String[] args) throws IOException {
        Socket s1 = new Socket("127.0.0.1",8888);
        OutputStream os = s1.getOutputStream();
        os.write("你好服务器".getBytes());

        InputStream is = s1.getInputStream();
        int len = 0;
        byte a [] = new byte[1024];
        while((len=is.read(a))!=-1){
            System.out.println(new String(a,0,len));
        }
        s1.close();

    }
}
