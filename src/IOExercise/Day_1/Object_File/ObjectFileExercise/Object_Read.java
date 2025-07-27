package IOExercise.Day_1.Object_File.ObjectFileExercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//反序列化
public class Object_Read {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("D:\\Java_study\\Day_1\\Text1.txt");
            ObjectInputStream obj=new ObjectInputStream(fis)) {
            String s = obj.readUTF();
            System.out.println(s);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}