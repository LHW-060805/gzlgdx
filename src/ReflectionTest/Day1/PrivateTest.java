package ReflectionTest.Day1;

import java.lang.reflect.Constructor;

public class PrivateTest {
    public static void main(String[] args) throws Exception {
        Class<PersonBooks> clazz = PersonBooks.class;
        Constructor<PersonBooks> cons = clazz.getDeclaredConstructor(String.class, String.class,String.class,String.class);
        cons.setAccessible(true);
        PersonBooks personBooks = cons.newInstance("奇洛李维斯回信", "赵声阁", "陈挽", "情侣");
        System.out.println(personBooks);
    }
}
