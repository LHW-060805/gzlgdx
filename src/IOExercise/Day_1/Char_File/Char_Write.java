package IOExercise.Day_1.Char_File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Char_Write {
    public static void main(String[] args) {
        FileWriter writer=null;
        Scanner input=new Scanner(System.in);
        try {
            writer=new FileWriter("D:\\Java_study\\Day_1\\Text_1");
            String string=input.next();
            writer.write(string);
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally{
            try {
                writer.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
