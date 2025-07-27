package IOExercise.Day_1.Object_File.ObjectFileExercise;

import java.io.*;
import java.util.Scanner;

//序列化过程
public class Object_Write {
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        String words= input.next();
        try( FileOutputStream fos = new FileOutputStream("D:\\Java_study\\Day_1\\Text1.txt");
            ObjectOutputStream objFile=new ObjectOutputStream(fos)){
                objFile.writeUTF(words);
                objFile.flush();
                System.out.println("写入成功");
        }catch(IOException ex){
            throw new RuntimeException(ex);
        }
    }
}
