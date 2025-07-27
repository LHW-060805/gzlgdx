package homeword.ExceptionHomework;

import java.util.Scanner;

public class Test {
    public static int inputAge(Scanner input){
        while(true){
            System.out.println("年龄：");
            int age=input.nextInt();
            if (age > 120 || age < 0) {
                System.err.println("不合法");
                continue;
            }
            return age;
        }
    }
    public static String inputNumber(Scanner input){
        while(true){
            System.out.println("电话号码：");
            String number=input.next();
            if(number.length()!=11){
                System.err.println("不合法");
                continue;
            }
            return number;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try{
            System.out.println("请输入姓名：");
            String name=input.next();
            int age=inputAge(input);
            String number=inputNumber(input);
            Student student=new Student(name,age,number);
            System.out.println("创建成功");
            System.out.println(student);
        }catch(IllegalArgumentException ex){
            System.err.println("学生创建对象失败");
            ex.printStackTrace();
        }finally{
            System.out.println("结束");
        }
    }
}
