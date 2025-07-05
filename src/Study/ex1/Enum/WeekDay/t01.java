package Study.ex1.Enum.WeekDay;

public class t01 {
    public static void test(WeekDay day){
        switch(day){
        case MONDAY:
            System.out.println("周一");
            break;
        case TUESDAY:
            System.out.println("周二");
            break;
        case WEDNESDAY:
            System.out.println("周三");
            break;
        case THURSDAY:
            System.out.println("周四");
            break;
        case FRIDAY:
            System.out.println("周五");
            break;
        case SATURDAY:
            System.out.println("周六");
            break;
        case SUNDAY:
            System.out.println("周天");
            break;
    }
}
    public static void main(String[] args) {

        WeekDay day=WeekDay.MONDAY;
        test(day);
    }
}
