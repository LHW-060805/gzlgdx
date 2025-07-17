package MultipleProgram.Day3.exercise;

public class AccountTest {
    public static void main(String[] args) {
        Account account=new Account();
        Customer visitor1=new Customer(account,"罗海文");
        Customer visitor2=new Customer(account,"徐智敏");
        visitor1.start();
        visitor2.start();
    }
}

class Account{
    private double balance;
    public synchronized void add(double acc){
        if (acc >0) balance += acc;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+"存钱1000,余额为："+balance);
    }
}

class Customer extends Thread{
    Account account;
    public Customer(){}
    public Customer(Account account){
        this.account=account;
    }
    public Customer(Account account,String name){
        super(name);
        this.account=account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.add(1000);
        }
    }
}
