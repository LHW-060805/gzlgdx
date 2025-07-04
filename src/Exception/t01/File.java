package Exception.t01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class File {
    public static void main(String[] args) {
        java.io.File file=new java.io.File("E://text.txt");
        try {
            FileInputStream fis=new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
