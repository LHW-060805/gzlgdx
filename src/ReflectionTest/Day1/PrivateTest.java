package ReflectionTest.Day1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateTest {
    public static void main(String[] args) throws Exception {
        Class<PersonBooks> clazz = PersonBooks.class;
        Constructor<PersonBooks> cons = clazz.getDeclaredConstructor(String.class, String.class,String.class,String.class);
        cons.setAccessible(true);
        PersonBooks personBooks = cons.newInstance("奇洛李维斯回信", "赵声阁", "陈挽", "情侣");
        System.out.println(personBooks);

        Field bookField = clazz.getDeclaredField("book");
        bookField.setAccessible(true);
        bookField.set(personBooks,"欲言难止");
        System.out.println(bookField.get(personBooks));

        Method personBooksMethod = clazz.getDeclaredMethod("showBook", String.class, String.class, String.class);
        personBooksMethod.setAccessible(true);
        String invoke =(String) personBooksMethod.invoke(personBooks, "全球高考", "秦究", "游惑");
        System.out.println(invoke);

    }
}
