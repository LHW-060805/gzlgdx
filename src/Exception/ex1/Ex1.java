package Exception.ex1;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x1=input.nextInt();
        int x2=input.nextInt();
        try{
            double result=x1/x2;
            System.out.println(result);
        }catch(Exception exception){
            System.err.println("除数不能为0");
            exception.printStackTrace();//详细错误所在！
            System.out.println(exception.getMessage());
        }finally{
            System.out.println("程序结束");
        }
    }
}
