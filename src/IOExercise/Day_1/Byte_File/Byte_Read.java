package IOExercise.Day_1.Byte_File;

import java.io.FileInputStream;
import java.io.IOException;
//字节流读取文件的read方法要byte
public class Byte_Read {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("D:\\Java_study\\Day_1\\Text_1.txt")) {
            byte[] bytes=new byte[1028];
            while(fis.available()!=0){
                int read = fis.read(bytes);
                String words=new String(bytes,0,read);
                System.out.println(words);
            }
        }catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
