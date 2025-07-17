package WebExercise.ex1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPTest2 {
    public static void main(String[] args) {
        Socket socket = null;
        ServerSocket serverSocket=null;
        InputStream inputStream=null;
        int pop = 8989;
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
    }
}
