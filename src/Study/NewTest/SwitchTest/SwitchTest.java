package Study.NewTest.SwitchTest;

import Study.ex1.Enum.WeekDay.WeekDay;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 提示用户输入星期几
        System.out.println("请输入星期几 (MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY):");
        String userInput = input.nextLine().trim().toUpperCase();
        WeekDay weekDay = WeekDay.valueOf(userInput);
        String words=switch(weekDay){
            case MONDAY -> "周一";
            case TUESDAY -> "周二";
            case WEDNESDAY -> "周三";
            case THURSDAY -> "周四";
            case FRIDAY -> "周五";
            case SATURDAY -> "周六";
            case SUNDAY -> "周天";
        };
        System.out.println(words);
    }
}
