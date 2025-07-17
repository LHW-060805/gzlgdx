package MultipleProgram.Day3.exercise2;

import java.util.concurrent.locks.ReentrantLock;

public class tickit implements Runnable{
    int ticket=100;
    static final Object ojb=new Object();//不能保证对象唯一性     加static可以
    boolean isflat=true;
    private static final ReentrantLock lock=new ReentrantLock();//此物为公平锁
    @Override
    public void run() {

        while (true) {
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            //同步代码块
//            synchronized (ojb) {
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "售票，票数为：" + ticket);
//                    ticket--;
//                } else {
//                    break;
//                }
//            }


//            同步方法
//            try {
//                Thread.sleep(5);
//                show();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售票，票数为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            lock.unlock();
        }
    }

    //同步方法
    public synchronized void show(){
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "售票，票数为：" + ticket);
            ticket--;
        }else{
            isflat=false;
        }
    }
}
class test{
    public static void main(String[] args) {
        tickit t=new tickit();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        Thread t3=new Thread(t);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
