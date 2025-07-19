package ReflectionTest.Day3;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws Exception {
        Student instance = ReflectionTest.getInstance();
        System.out.println(instance);
        String items1="java.util.Date";
        Object instance1 = ReflectionTest.getInstance(items1);
        System.out.println(instance1);

        String items2="ReflectionTest.Day3.Student";
        Object show = ReflectionTest.getMethod(items2, "show");
        System.out.println(show);
    }
}
