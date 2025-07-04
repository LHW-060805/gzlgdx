package IO流.Day_1.Byte_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise {
    public static void main(String[] args) {
        FileInputStream fis=null;
        byte[] bytes=new byte[1024];
        FileOutputStream fos=null;
        try{
            fis=new FileInputStream("D:\\Java_study\\Day_1\\Text_2.txt");
            while((fis.available())!=0){
                int words=fis.read(bytes);
                String string=new String(bytes,0,words);
                System.out.println("文件读取成功");
            }
        }catch(FileNotFoundException ex){
            System.err.println("文件不存在");
            throw new RuntimeException(ex);
        }catch(IOException ex){
            ex.printStackTrace();
        }
        finally {
            try{
                fis.close();
            }catch(IOException ex){
                System.out.println("文件不存在");
                ex.printStackTrace();
            }
        }
        try{
            fos=new FileOutputStream("D:\\Java_study\\Day_1\\Text_1.txt");
            fos.write(bytes);
            System.out.println("复制成功");
        }catch(FileNotFoundException ex){
            System.out.println("文件不存在");
            throw new RuntimeException();
        }catch(IOException ex){
            ex.printStackTrace();
        }finally{
            try{
                fos.close();
            }catch(IOException ex){
                System.out.println("文件不存在");
                ex.printStackTrace();
            }
        }
    }
}
