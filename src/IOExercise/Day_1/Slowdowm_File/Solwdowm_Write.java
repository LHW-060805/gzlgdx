package IOExercise.Day_1.Slowdowm_File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

//缓冲流写入数据
public class Solwdowm_Write {
    public static void main(String[] args) {
        BufferedWriter br=null;
        Writer writer=null;
        Scanner input=new Scanner(System.in);
        try {
            writer = new FileWriter("D:\\Java_study\\Day_1\\Text_1");//打开路径
            br=new BufferedWriter(writer);
            String string=input.next();
            br.write(string);
            System.out.println("写入完成");
        }catch(IOException ex){
            ex.printStackTrace();
        }finally{
            try {
                br.close();
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
