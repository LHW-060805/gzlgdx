package homeword.ExceptionHomework;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
通过键盘输入两个数字，对这两个数字进行相除，
并且确保除数为0时程序不会报错（用两种方式实现，分别是捕获处理try-catch、抛出处理throw、throws）
 */
public class Exception_math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("请输入数字");
            int x1 = input.nextInt();
            System.out.println("请输入被除数");
            int x2 = input.nextInt();
            double result = x1 / x2;
            System.out.println(result);

        } catch (InputMismatchException ex) {
            System.err.println("error，除数不可为零");
            ex.printStackTrace();
        } finally {
            System.out.println("程序结束");
        }
    }

}

