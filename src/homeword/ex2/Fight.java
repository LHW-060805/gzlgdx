package homeword.ex2;

public class Fight {
    public static void main(String[] args) {
        Tank t1=new Tank();
        t1.setAmount(3);
        t1.setSpeed(50);
        t1.speedup(5);
        t1.speeddown(10);
        System.out.println("当前的坦克炮弹为："+t1.getAmount());
        System.out.println("当前的坦克速度为"+t1.getSpeed());
        t1.fire();
        System.out.println("当前的炮弹数量为："+t1.getAmount());
    }
}
