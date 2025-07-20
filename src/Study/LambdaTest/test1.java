package Study.LambdaTest;

import java.util.Comparator;
import java.util.function.Consumer;

public class test1 {
    public static void main(String[] args) {
        //原始方法，不提倡，太繁琐
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新特性测试");
            }
        };
        r1.run();

        Runnable r2=()->{
            System.out.println("Lambda表达式的test");
        };
        r2.run();

        Comparator<Integer> comparator1=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        System.out.println(comparator1.compare(45,78));

        @SuppressWarnings("show")
        Comparator<Integer> comparator2=(t1,t2)->Integer.compare(t1,t2);
        int compare = comparator2.compare(2, 1);
        System.out.println(compare);

        Comparator<Integer> comparator3=Integer::compare;
        int compare1 = comparator3.compare(23, 1);
        System.out.println(compare1);

        MyFunctionTest method=()-> System.out.println("MyFunctionTest");
        method.method();

        Consumer<String> consumer=s-> System.out.println(s);
        consumer.accept("顾昀迟");

        Consumer<String> consumer1= System.out::println;
        consumer1.accept("温然");


    }
}
