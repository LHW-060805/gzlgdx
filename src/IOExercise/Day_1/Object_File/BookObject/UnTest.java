package IOExercise.Day_1.Object_File.BookObject;

import java.io.*;
import java.util.Collections;
import java.util.List;

import Study.setTest.ex1.Book;

public class UnTest {
    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream("D:\\Java_study\\Day_1\\Book.bin");
            ObjectInputStream obj=new ObjectInputStream(fis)){
            List<Book> words = Collections.singletonList((Book) obj.readObject());
            for (Object items:words) {
                System.out.println(items);
            }
        }catch (FileNotFoundException e) {
            System.err.println("错误：找不到指定的文件 - " + e.getMessage());
        } catch (StreamCorruptedException e) {
            System.err.println("错误：文件格式损坏，不是有效的对象序列化文件 - " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("错误：找不到Book类 - " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO错误：" + e.getMessage());
        } catch (ClassCastException e) {
            System.err.println("错误：文件中包含的不是Book对象 - " + e.getMessage());
        }
    }
}
