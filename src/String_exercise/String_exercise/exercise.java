package String_exercise.String_exercise;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入字符串：");
        String words=input.next();
        int bigNum=0,smallNum=0,digitNum=0,num=0;
        for(char item:words.toCharArray()){         //看成字符数组，toCharArray是方法
            if(item>='A'&&item<='Z'){
                bigNum++;
            } else if (item>='a'&&item<='z') {
                smallNum+=1;
            } else if (item>='0'&&item<='9') {
                digitNum++;
            }else {
                num++;
            }
        }
        System.out.println(bigNum);
        System.out.println(smallNum);
        System.out.println(digitNum);
        System.out.println(num);
    }
}
