package String_exercise.DateTest;

public class Date {
    public static void main(String[] args) {
        java.util.Date date1=new java.util.Date();
        java.sql.Date date2=new java.sql.Date(date1.getTime());
        System.out.println(date1);
        System.out.println(date2);
    }
}
