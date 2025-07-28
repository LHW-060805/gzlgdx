package MultipleProgram.Day1;

public class EvenNumberTest {
    private static final Runnable Runnable_Test=()->{
        for (int i = 1; i <=100 ; i++) {
            if (i %2==0) {
                System.out.println(":"+i);
            }
        }
    };
    public static void main(String[] args) {
    Thread RunnableThread=new Thread(Runnable_Test,"RunnableTest");
    RunnableThread.start();

    class PrintNumber extends Thread{

        public PrintNumber(){

        }//线程
        public PrintNumber(String name){
            super(name);
        }
        @Override
        public void run() {
            for (int i = 1; i <=100 ; i++) {
                if (i %2==0) {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }
    }

        Thread.currentThread().setName("主线程");
    //sleep方法，Thread.sleep()来调用，因为它是静态方法
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
        new Thread(()-> {
            for (int i = 0; i < 100; i++) {
                if(i%2==0){
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 1; i <=100 ; i++) {
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();
        PrintNumber printnumber=new PrintNumber("线程1");//线程构造器
        printnumber.start();
    }
}