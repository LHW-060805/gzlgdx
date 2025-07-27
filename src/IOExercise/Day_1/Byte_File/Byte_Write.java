package IOExercise.Day_1.Byte_File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte_Write {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            fos = new FileOutputStream("D:\\Java_study\\Day_1\\Text_1");//无这个文件也可以新建
            //写入操作
            String words="出自《全球高考》";//需将字符串转成字节数组
            byte[] bytes=words.getBytes();//字符串方法,转换为字节
            fos.write(bytes);//需传入byte类型数据
            System.out.println("写入成功");
        }catch(FileNotFoundException ex){
            System.err.println("文件不存在");
            throw new RuntimeException(ex);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                fos.close();
            }catch(IOException e1){
                e1.printStackTrace();
            }
        }
    }
}
