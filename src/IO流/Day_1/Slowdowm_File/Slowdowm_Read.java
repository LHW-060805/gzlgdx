package IO流.Day_1.Slowdowm_File;

import java.io.*;

//缓冲流的读写
public class Slowdowm_Read {
    public static void main(String[] args) {
        FileReader reader=null;
        BufferedReader br=null;
        try {
            reader=new FileReader("D:\\Java_study\\Day_1\\Text_1.txt");
            br=new BufferedReader(reader);
            String words=br.readLine();
            while(words!=null){
                words=br.readLine();
                System.out.println(words);
            }
        } catch (FileNotFoundException e) {
            System.err.println("文件不存在");
            throw new RuntimeException(e);
        }catch(IOException ex){
            ex.printStackTrace();
        } finally{
            try {
                br.close();;
                reader.close();
            } catch (IOException e) {
                System.out.println("文件不存咋");
                throw new RuntimeException(e);
            }
        }
    }
}
/*
br=new BufferedReader(reader);
            String words=br.readLine();
            while(words!=null){
                words= br.readLine();
                System.out.println(words);
            }
 */