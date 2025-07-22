package ReflectionTest.Day3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionTest {

    //体现反射的静态性
    public static Student getInstance(){
        return new Student();
    }


    //体现反射的动态性
    public static <T> T  getInstance(String className) throws Exception {
        Class<?> aClass = Class.forName(className);
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        T t = (T) declaredConstructor.newInstance();
        return t;
    }
    
    public static Object getMethod(String className,String methodName) throws Exception {
        Class<?> aClass = Class.forName(className);
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        Object o = declaredConstructor.newInstance();
        Method declaredMethod = aClass.getDeclaredMethod(methodName);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(o);
    }
    //这里的T类型和Object类型有区别，T在编译器可以自动转换，但Object要手动转换
}
