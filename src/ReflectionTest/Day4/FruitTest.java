package ReflectionTest.Day4;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class FruitTest {
    public static void main(String[] args) {
        Properties properties=new Properties();
        try(FileInputStream fis=new FileInputStream("src/config.properties")) {
            properties.load(fis);
            String fruitName = properties.getProperty("fruitName");
            Class<?> aClass = Class.forName(fruitName);
            Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            Object o = declaredConstructor.newInstance();
            Juicer juicer=new Juicer();
            juicer.run((Fruit) o);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
