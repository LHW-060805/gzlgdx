package MultipleProgram.Day1;

public class EvenNumberTest {
    public static void main(String[] args) {
//        PrintNumber t1=new PrintNumber();
//        t1.start();//1.启动线程     2.调用当前线程的run方法
//
//        EvenNumber t2=new EvenNumber();
//        t2.start();
//      }
//}

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
//class EvenNumber extends Thread{
//    @Override
//    public void run() {
//        for (int i = 1; i <=100 ; i++) {
//            if (i %2!=0) {
//                System.out.println(Thread.currentThread().getName()+":"+i);
//            }
//        }
//    }
//}
        //以上方法太low,但是有匿名子类的匿名对象
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