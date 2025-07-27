package IOExercise.Exercise;

import java.io.File;
import java.io.IOException;

public class Exercise_2 {
    public static void main(String[] args) {
        File file=new File("D:\\Java_study\\Day_1\\Text_1");
        if (!file.exists()) {
            try {
                file.createNewFile();
            }catch(IOException ex){
                ex.printStackTrace();
            }
            System.out.println("创建成功");
        }else{
            System.out.println("文件已存在");
        }
    }
}
