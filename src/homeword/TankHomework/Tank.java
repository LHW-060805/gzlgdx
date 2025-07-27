package homeword.TankHomework;
public class Tank {
    private int amount;
    public int getAmount() {return amount;}
    public void setAmount(int amount) {
        if(amount<0){
            amount=0;
        }else{
            this.amount = amount;
        }
    }
    private int speed;
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {
        if(speed<0){
            speed=0;
        }else{
            this.speed = speed;
        }
    }
    public void speedup(int speed){
        this.speed+=speed;
    }
    public void speeddown(int speed) {
        this.speed-=speed;
    }
    public void fire(){
        while(amount!=0){
            System.out.println("打出一发炮弹");
            amount--;
            if(amount==0){
                System.out.println("炮弹没了，请补充！");
            }
        }

    }
}
