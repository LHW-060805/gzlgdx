package IO流.Day_1.Byte_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//字节流读取文件的read方法要byte
public class Byte_Read {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("D:\\Java_study\\Day_1\\Text_1.txt")) {
            try {
                byte[] bytes = new byte[1024];//缓冲区
                while ((fis.available()) != 0) {
                    int data = fis.read(bytes);
                    String string = new String(bytes, 0, data);
                    System.out.println(string);
                }
            } catch (FileNotFoundException e) {
                System.err.println("文件不存在");
                throw new RuntimeException(e);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
