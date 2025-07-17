package ReflectionTest.Day1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        Class<PersonBooks> clazz = PersonBooks.class;
        PersonBooks personBooks = clazz.newInstance();
        System.out.println(personBooks);

        Field relationshipField = clazz.getField("relationship");
        relationshipField.set(personBooks,"情侣");
        System.out.println(relationshipField.get(personBooks));

        Method showField = clazz.getMethod("show");
        showField.invoke(personBooks);
    }
}
