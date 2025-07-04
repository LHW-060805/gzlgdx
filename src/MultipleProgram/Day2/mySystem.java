package MultipleProgram.Day2;

public class mySystem implements Runnable{
    private String name;
    public mySystem(){

    }
    public mySystem(String name) {
        this.name=name;
    }

    public void f1() {
        synchronized (this) {       //synchronized的作用是给线程上锁，防止被别的线程抢占cpu
            for (int i = 0; i < 18; i++) {
                System.out.print(Thread.currentThread().getName() + ":");
                System.out.print("欲");
                System.out.print("言");
                System.out.print("难");
                System.out.print("止");
                System.out.println("");
            }
        }
    }
    public void f2() {
        synchronized (this) {
            for (int i = 0; i < 18; i++) {
                System.out.print(Thread.currentThread().getName() + ":");
                System.out.print("一");
                System.out.print("屋");
                System.out.print("暗");
                System.out.print("灯");
                System.out.println("");
            }
        }
    }

    @Override
    public void run() {
        System.out.println(name+"运行中");
    }
}
