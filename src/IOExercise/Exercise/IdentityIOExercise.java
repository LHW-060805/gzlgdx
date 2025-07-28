package IOExercise.Exercise;
import java.io.*;
import java.io.File;
import java.util.Scanner;

/*
（1）文件初始化：判断文件user.txt是否存在，不存在则创建新文件并提示 “新创建了一个文件”，存在则提示 “文件已经存在”。
（2）注册功能：通过控制台接收用户输入的账户名和密码，使用FileWriter以追加模式将信息写入文件，格式为 “账户名，密码”（每行一条记录）。
（3）登录验证：通过控制台接收登录信息，使用BufferedReader逐行读取文件数据，验证输入的账户名和密码是否与文件中某一行完全匹配，
匹配成功提示 “登录成功”，否则提示 “账号密码错误”。
 */
public class IdentityIOExercise {
    public static final String string = "D:\\Java_study\\Day_1\\Text_1.txt";
    public static Scanner input = new Scanner(System.in);
    public static void register() {
        try(FileWriter writer=new FileWriter(string);
            BufferedWriter bufferedWriter=new BufferedWriter(writer)){
            System.out.println("注册账户名：");
            String words1 = input.next();
            System.out.println("注册密码:");
            String words2 = input.next();
            bufferedWriter.write(words1+","+words2);
            System.out.println("写入成功");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void identity() {
        try (FileReader reader=new FileReader(string);
            BufferedReader bufferedReader=new BufferedReader(reader)){
            String words = bufferedReader.readLine();
            while ((words) != null) {
                System.out.println(words);
                words = bufferedReader.readLine();
            }
            System.out.println("读取成功");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void loginSystem() {
        Scanner input = new Scanner(System.in);
        System.out.print("登录账户名：");
        String loginUsername = input.nextLine();
        System.out.print("登录密码：");
        String loginPassword = input.nextLine();

        try (FileReader reader=new FileReader(string);
             BufferedReader bufferedReader=new BufferedReader(reader)){
            String line = bufferedReader.readLine();
            boolean loginSuccess = false;
            while ((line) != null) {
                String[] parts = line.split("，");
                //确保拆分后恰好有用户名和密码两部分
                if (parts.length == 2 &&
                        parts[0].equals(loginUsername) &&
                        parts[1].equals(loginPassword)) {
                    loginSuccess = true;
                    break;
                }
                line = bufferedReader.readLine();
            }

            if (loginSuccess) {
                System.out.println("登录成功");
            } else {
                System.out.println("账号密码错误");
            }
        } catch (IOException ex) {
            System.out.println("登录验证失败: " + ex.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Java_study\\Day_1\\Text_1.txt");
        if (file.exists()) {
            System.out.println("文件存在");
        } else {
            System.out.println("新建了一个文件");
        }
        register();
        identity();
        loginSystem();
    }
}

