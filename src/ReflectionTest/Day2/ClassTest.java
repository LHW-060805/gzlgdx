package ReflectionTest.Day2;

public class ClassTest {
    public static void main(String[] args) {
        //此方法在反射机制的创建class对象比较常用,较能体现动态
        String item="ReflectionTest.Day1.PersonBooks";
        try {
            Class.forName(item);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
