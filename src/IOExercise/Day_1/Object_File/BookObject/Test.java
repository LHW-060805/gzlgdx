package IOExercise.Day_1.Object_File.BookObject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import Study.setTest.ex1.Book;
//序列化文件
public class Test {
    public static void main(String[] args) {
        List<Book> list=new ArrayList<>();
        Book b1=new Book("欲言难止",45,"大大");
        Book b2=new Book("一屋暗灯",78,"大大");
        list.add(b1);
        list.add(b2);
        for (Object items:list) {
            System.out.println(items);
        }

        //序列化一个文件
        //将 Java 对象转换为字节序列（字节流）的过程，目的是便于对象的存储（如写入文件）或网络传输
        try(FileOutputStream fos=new FileOutputStream("D:\\Java_study\\Day_1\\Book.bin");
            ObjectOutputStream obj=new ObjectOutputStream(fos)){
            obj.writeObject(list);
            obj.flush();
            System.out.println("序列化成功");
        }catch(IOException ex){
            throw new RuntimeException("异常");
        }
    }
}
