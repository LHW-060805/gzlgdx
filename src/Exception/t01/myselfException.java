package Exception.t01;

import java.util.Scanner;

public class myselfException {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入名字:");
        String name= input.next();
        System.out.println("请输入年龄:");
        try{
            int age= input.nextInt();
            if (age<0) {
                throw new AgeException("年龄不合法！");
            }
            System.out.println(name);
            System.out.println(age);
        } catch (AgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
