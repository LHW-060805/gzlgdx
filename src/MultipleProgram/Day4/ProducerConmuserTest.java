package MultipleProgram.Day4;

public class ProducerConmuserTest {
    public static void main(String[] args) {
        Clerk clerk=new Clerk();
        Producer producer=new Producer(clerk,"生产者");
        Consumer consumer=new Consumer(clerk,"消费者");
        producer.start();
        consumer.start();
        // 主线程运行5秒后中断生产者和消费者线程
        try {
            Thread.sleep(5000);
            producer.interrupt();
            consumer.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Clerk{
    private int produceNumber=0;

    public synchronized void ProducerAction() {
        while (produceNumber >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // 恢复中断状态
                return; // 退出方法
            }
        }
        produceNumber++;
        System.out.println
                (
                        Thread.currentThread().getName() + "生产第" + produceNumber + "个产品"
                );
        notifyAll();
    }


    public synchronized void ConsumerAction() {
        while (produceNumber <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // 恢复中断状态
                return; // 退出方法
            }
        }
        System.out.println
                (
                        Thread.currentThread().getName() + "消耗至" + produceNumber + "个产品"
                );
        produceNumber--;
        notifyAll();
    }
}

class Producer extends Thread{
    public Clerk clerk;
    public Producer(Clerk clerk,String name){
        super(name);
        this.clerk=clerk;
    }
    @Override
    public void run() {
        while(!isInterrupted()) {
            System.out.println("生产者开始生产产品");
            try {
                Thread.sleep(100);
                clerk.ProducerAction();
            } catch (InterruptedException e) {
                System.out.println("生产者被中断，准备退出...");
                Thread.currentThread().interrupt(); // 恢复中断状态
                break; // 退出循环
            }
        }
    }
}

class Consumer extends Thread{
    public Clerk clerk;
    public Consumer(Clerk clerk,String name){
        super(name);
        this.clerk=clerk;
    }
    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println("消费者开始消费产品");
            try {
                Thread.sleep(500);
                clerk.ConsumerAction();
            } catch (InterruptedException e) {
                System.out.println("生产者被中断，准备退出...");
                Thread.currentThread().interrupt(); // 恢复中断状态
                break; // 退出循环
            }
        }
    }
}