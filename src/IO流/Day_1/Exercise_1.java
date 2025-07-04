package IO流.Day_1;

import java.io.File;

public class Exercise_1 {
    public static void main(String[] args) {
        File file=new File("D:\\Java_study\\Day_1\\Text.txt");
        if (file.exists()) {
            if(file.isFile()){
                System.out.println("相对路径："+file.getPath());
                System.out.println("绝对路径："+file.getAbsolutePath());
                System.out.println("文件名字："+file.getName());
                System.out.println("文件大小："+file.length()+"字节");
            }else if(file.isDirectory()){
                System.out.println("为目录");
            }
        }else{
            System.out.println("文件不存在");
        }
    }
}
