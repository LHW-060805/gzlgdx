package MultipleProgram.Day4;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        num n=new num();
        Thread t1=new Thread(n,"线程1");
        Thread t2=new Thread(n,"线程2");
        t1.start();
        t2.start();
    }
}
class num implements Runnable{
    int ass=0;
    @Override
    public void run() {
        while(true) {
            synchronized (this) {
                this.notify();
                if (ass <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ass++;
                    System.out.println(Thread.currentThread().getName() + ":" + ass);
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}

