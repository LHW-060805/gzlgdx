package IOExercise.Day_1.Char_File;

import java.io.FileReader;
import java.io.IOException;

public class Char_Read {
    public static void main(String[] args) {
        StringBuilder stringBuilder;
        try (FileReader fileReader=new FileReader("D:\\Java_study\\Day_1\\Text_1.txt")) {
            stringBuilder=new StringBuilder();
            char[] chars=new char[1024];
            int items = fileReader.read(chars);
            while(items!=-1){
                stringBuilder.append(chars,0,items);
                items=fileReader.read();
            }
            System.out.println(stringBuilder);
        }catch(IOException exception){
            String message = exception.getMessage();
            System.out.println(message);
        }
    }
}
