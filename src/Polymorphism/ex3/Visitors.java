package Polymorphism.ex3;
import java.util.Scanner;
public class Visitors {
    public static void main(String[] args) {
        Manager manager=new Manager();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入品种：");
        String a=input.next();
        System.out.println("请输入尺寸：");
        int b=input.nextInt();
        Cake cake =manager.getCake(a);
        cake.setCade(b);
    }
}
