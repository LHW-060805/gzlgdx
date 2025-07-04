package MultipleProgram.Day1;
//第二种方式的线程
//此方式更实用，大部分情况都要用此方式
class EvenNumber implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

public class exer1 {
    public static void main(String[] args) {
        EvenNumber n1 = new EvenNumber();
        Thread t1=new Thread(n1);//多态
        t1.start();
        Thread t2=new Thread(n1);//共享数据问题，只有n1一个对象，天然共享
        t2.start();

        //对上述方法的改进，代码更简洁高效通懂
        new Thread(new Runnable(){
            public void run() {
                for (int i = 1; i <=100 ; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }).start();

//        Lambda写法，超简洁
        new Thread(() -> {
            for (int i = 1; i <=100 ; i++) {
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();
        //注意！这些都是分线程
    }
}
