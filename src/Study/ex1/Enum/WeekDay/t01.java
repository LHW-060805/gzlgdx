package Study.ex1.Enum.WeekDay;

import java.util.Scanner;

public class t01 {
    public static void test(WeekDay day){
        String item=switch(day){
        case MONDAY-> "周一";
        case TUESDAY-> "周二";
        case WEDNESDAY-> "周三";
        case THURSDAY-> "周四";
        case FRIDAY-> "周五";
        case SATURDAY->"周六";
        case SUNDAY-> "周天";
    };
        System.out.println(item);
}
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String words=input.next();
        WeekDay day=WeekDay.valueOf(words);
        test(day);
    }
}
