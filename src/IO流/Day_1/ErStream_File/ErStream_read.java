package IO流.Day_1.ErStream_File;

import java.io.*;

//二进制流读取文件
public class ErStream_read {
    public static void main(String[] args) {
        DataOutputStream dos=null;
        DataInputStream dis=null;
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream("D:\\Java_study\\Day_1\\许则.jpg");//源文件路径
            fos=new FileOutputStream("D:\\Java_study\\Day_1\\陆赫杨的小窝.jpg");//目标图片路径
            dis=new DataInputStream(fis);
            dos=new DataOutputStream(fos);
            int data;
            while((data=dis.read())!=-1){
                dos.write(data);
            }
            System.out.println("复制成功");
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            throw new RuntimeException(e);
        }catch(IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                fis.close();
                fos.close();
                dis.close();
                dos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
