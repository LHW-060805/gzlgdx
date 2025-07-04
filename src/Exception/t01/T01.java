package Exception.t01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        System.out.println("请输入周几：");
        Scanner input=new Scanner(System.in);
        try {
            int num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("周一");
                    break;
                case 2:
                    System.out.println("周二");
                    break;
                case 3:
                    System.out.println("周三");
                    break;
                case 4:
                    System.out.println("周四");
                    break;
                case 5:
                    System.out.println("周五");
                    break;
                case 6:
                    System.out.println("周六");
                    break;
                case 7:
                    System.out.println("周天");
                    break;
                default:
                    System.out.println("无匹配数据");
            }
        }catch(InputMismatchException ex){
            System.err.println("输入不合法！");
            ex.printStackTrace();
        }catch(Exception ex){
            System.err.println("未知异常");
        }finally{
            System.out.println("程序结束");
        }
    }
}
