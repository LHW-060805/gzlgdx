package IO流.Day_2;

import java.io.FileNotFoundException;
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
        //序列化一个文件
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            fos=new FileOutputStream("D:\\Java_study\\Day_1\\Book.bin");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(list);
            System.out.println("序列化成功");
        } catch (FileNotFoundException e) {
            System.out.println("文件未存在");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
