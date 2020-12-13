package day06_code.demo01Tcp.Filetranfrom;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        File file = new File("F:\\桌面");
        if (!file.exists()){
            file.mkdir();
        }
        FileOutputStream fos = new FileOutputStream(file+"\\桌面.jpg");
        OutputStream os = socket.getOutputStream();
        int len = 0 ;
        byte a [] = new byte[1024];
        while((len = is.read(a))!=-1){
           // System.out.println(new String(a,0,len));
            fos.write(a,0,len);

        }
        os.write("上传成功".getBytes());
        fos.close();
        server.close();
        socket.close();
    }
}
