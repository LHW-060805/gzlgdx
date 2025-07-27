package IOExercise.Day_1.Slowdowm_File;

import java.io.*;

//缓冲流的读写
public class Slowdowm_Read {
    public static void main(String[] args) {
        try(FileReader fileReader=new FileReader("D:\\Java_study\\Day_1\\Text_1.txt");
            BufferedReader bufferedReader=new BufferedReader(fileReader)){
            String words ;
            while((words=bufferedReader.readLine())!=null) {
                System.out.println(words);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
