package Study.ex1.Enum.Sex;

import java.util.Scanner;

public class t02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String sex=input.next();
        Gender gender=Gender.valueOf(sex);
        System.out.println(gender);
    }
}
