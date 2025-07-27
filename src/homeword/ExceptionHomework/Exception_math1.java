package homeword.ExceptionHomework;

import java.util.Scanner;

/*
通过键盘输入两个数字，对这两个数字进行相除，
并且确保除数为0时程序不会报错（用两种方式实现，分别是捕获处理try-catch、抛出处理throw、throws）
 */
public class Exception_math1 {
    public static void exception(int x1,int x2) throws ArithmeticException{
        if(x2==0){
            throw new ArithmeticException("除数不可为零");
        }else{
            int result=x1/x2;
            System.out.println("结果为："+result);
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try{
            System.out.println("请输入：");
            int x1=input.nextInt();
            System.out.println("请输入：");
            int x2=input.nextInt();
            exception(x1,x2);
        }catch(ArithmeticException ex){
            ex.printStackTrace();
        }finally{
            System.out.println("程序结束");
        }
    }
}
