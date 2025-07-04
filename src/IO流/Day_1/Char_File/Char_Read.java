package IO流.Day_1.Char_File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Char_Read {
    public static void main(String[] args) {
        FileReader reader=null;
        StringBuffer sb=null;
        try{
            reader=new FileReader("D:\\Java_study\\Day_1\\Text_1.txt");
            sb=new StringBuffer();
            char[] chars=new char[1024];
            int data=reader.read(chars);
            while(data!=-1){
                sb.append(chars,0,data);
                data=reader.read(chars);
            }
        }catch(FileNotFoundException ex){
            System.err.println("文件不存在");
            throw new RuntimeException(ex);
        }catch(IOException ex){
            System.err.println("未知异常");
            ex.printStackTrace();
        }finally{
            try{
                reader.close();
            }catch(IOException ex){
                System.err.println("文件不存在");
                ex.printStackTrace();
            }
        }
        System.out.println(sb.toString());
    }
}
