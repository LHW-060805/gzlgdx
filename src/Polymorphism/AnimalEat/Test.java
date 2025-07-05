package Polymorphism.AnimalEat;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请选择要投喂的动物（猫猫，狗狗，猴子）:");
        String num= input.next();
        Master master=new Master();
        switch (num) {
            case "猫猫":
                System.out.println("请输入猫猫名字：");
                String nameCat= input.next();
                Cat cat=new Cat(nameCat,100);
                System.out.println("请输入要投喂的能量:");
                int number1= input.nextInt();
                master.feed(cat,number1);
                break;
            case "狗狗":
                System.out.println("请输入狗狗名字：");
                String nameDog= input.next();
                Dog dog=new Dog(nameDog,100);
                System.out.println("请输入要投喂的能量:");
                int number2= input.nextInt();
                master.feed(dog,number2);
                break;
            case "猴子":
                System.out.println("请输入猴子名字：");
                String nameMonkey= input.next();
                Monkey monkey=new Monkey(nameMonkey,100);
                System.out.println("请输入要投喂的能量:");
                int number3= input.nextInt();
                master.feed(monkey,number3);
                break;
            default :
                System.out.println("没有该动物");
        }
    }
}
