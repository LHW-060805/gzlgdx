package WebExercise.ex1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPTest {
    public static Scanner input=null;
    public static void main(String[] args){
        //创建Socket
        Socket socket = null;
        OutputStream outputStream = null;
        ServerSocket serverSocket=null;
        InputStream inputStream=null;
        int pop = 8989;
        try {
            InetAddress inetAddress = InetAddress.getByName("192.168.10.5");
            socket = new Socket(inetAddress, pop);

            //发送数据
            outputStream = socket.getOutputStream();
            String next = "nihao";
            outputStream.write(next.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                //关闭Socket
                socket.close();
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        //创建ServerSocket
        try{
            serverSocket=new ServerSocket(pop);
            Socket accept = serverSocket.accept();//堵塞式方法,等着接收
            System.out.println("服务端已开启");
            inputStream = accept.getInputStream();
            byte[] bytes=new byte[1024];
            int read = inputStream.read(bytes);
            while(read!=-1){
                String words=new String(bytes,0,read);
                System.out.println(words);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                //关闭Socket，ServerSocket
                serverSocket.close();
                inputStream.close();
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //accept()，接收Socket的请求

        //接受数据

    }
}
