package String_exercise;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Integrate {
    public static void main(String[] args) {
//        StringBuffer sb=new StringBuffer();
//        sb.append("许则");
//        sb.append("陆赫杨");
//        sb.insert(2,"爱");
//        String str=sb.toString();
//        System.out.println(str);
//        Random rd1=new Random();
//        int num1=rd1.nextInt(100)+1;
//        System.out.println(num1);
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat asd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(asd.format(date));
    }
}
