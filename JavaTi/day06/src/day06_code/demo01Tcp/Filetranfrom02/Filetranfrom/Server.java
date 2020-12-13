package day06_code.demo01Tcp.Filetranfrom02.Filetranfrom;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(888);
        while (true) {
            Socket socket = server.accept();
            new Thread() {
                @Override
                public void run() {
                    try {
                        String s = System.currentTimeMillis() + new Random().nextInt(999) + ".jpg";
                        InputStream is = socket.getInputStream();
                        File file = new File("F:\\桌面");
                        if (!file.exists()) {
                            file.mkdir();
                        }
                        FileOutputStream fos = new FileOutputStream(file + "\\" + s);
                        OutputStream os = socket.getOutputStream();
                        int len = 0;
                        byte a[] = new byte[1024];
                        while ((len = is.read(a)) != -1) {
                            // System.out.println(new String(a,0,len));
                            fos.write(a, 0, len);

                        }
                        os.write("上传成功".getBytes());
                        fos.close();
                        // server.close();
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }

}