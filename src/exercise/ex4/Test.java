package exercise.ex4;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入：1（矩形）,2(正方形)");
        int num=input.nextInt();
        Shape shape=null;       //初始化shape值     !!!需在main里初始化
        switch(num){
            case 1:
                System.out.println("请您输入矩形的长度和宽度：");
                int g= input.nextInt();
                int w= input.nextInt();
                shape=new Rectangle(g,w);
                break;
            case 2:
                System.out.println("请输入正方形的边长：");
                int b= input.nextInt();
                shape=new Square(b);
                break;
        }
        System.out.println(shape.getArea());
    }
}
