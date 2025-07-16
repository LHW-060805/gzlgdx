package IO流.Day_1.Object_File.ObjectFileExercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//反序列化
public class Object_Read {
    public static ObjectInputStream obj = null;

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("D:\\Java_study\\Day_1\\Text1.txt")) {
            obj=new ObjectInputStream(fis);
            String s = obj.readUTF();
            System.out.println(s);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }
}


//import java.io.*;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//public class Object_Read {
//    public static void main(String[] args) {
//        // 使用Path类构建路径，避免转义问题
//        Path filePath = Paths.get("D:", "Java_study", "Day_1", "Text1.txt");
//        File file = filePath.toFile();
//
//        // 检查文件是否存在
//        if (!file.exists()) {
//            System.err.println("错误：文件不存在 - " + filePath);
//            return;
//        }
//
//        // 检查文件是否可读
//        if (!file.canRead()) {
//            System.err.println("错误：文件不可读 - " + filePath);
//            return;
//        }
//
//        // 使用try-with-resources自动关闭所有资源
//        try (FileInputStream fis = new FileInputStream(file);
//             ObjectInputStream ois = new ObjectInputStream(fis)) {
//
//            // 读取UTF字符串
//            String s = ois.readUTF();
//            System.out.println("读取内容：" + s);
//
//        } catch (FileNotFoundException e) {
//            // 虽然已经检查过文件存在，但仍可能由于权限变化等原因抛出此异常
//            System.err.println("文件未找到：" + e.getMessage());
//        } catch (StreamCorruptedException e) {
//            System.err.println("文件格式错误：可能不是使用ObjectOutputStream写入的文件");
//            System.err.println("详细信息：" + e.getMessage());
//        } catch (IOException e) {
//            System.err.println("IO异常：" + e.getMessage());
//        } catch (Exception e) {
//            // 捕获其他意外异常
//            System.err.println("意外错误：" + e.getMessage());
//        }
//    }
//}
