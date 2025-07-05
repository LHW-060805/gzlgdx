package String_exercise.StringWay;

import java.util.Scanner;

public class Way {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入：");
        String words=input.next();
        char[] chars = words.toCharArray();
        for (char item:chars) {
            System.out.println(item);
        }
    }
}
