package MultipleProgram.Day2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        try (ExecutorService pool = Executors.newFixedThreadPool(3)) {
            Runnable r1 = new mySystem("test1");
            Runnable r2 = new mySystem("test2");
            Runnable r3 = new mySystem("test3");
            pool.submit(r1);
            pool.submit(r2);
            pool.submit(r3);
            pool.shutdown();
        }
    }
}
