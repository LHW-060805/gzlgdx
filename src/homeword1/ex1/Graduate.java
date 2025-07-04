package homeword1.ex1;
/*
创建一个Graduate类，实现Teacher和Student接口。
在Graduate类中定义成员变量：name（姓名）、gender（性别）、age（年龄）、fee（每学期学费）和pay（月工资）。
提供构造方法用于初始化这些成员变量。
实现接口中的getFee、setFee、getPay和setPay方法。
!!!添加贷款状态判断方法：
在Graduate类中添加一个loan方法，该方法用于判断研究生的年收入（工资乘以12）是否足够支付两学期的学费（学费乘以2）。
如果收入减去学费小于2000，则输出“你需要贷款”；否则输出“你的收入足够支配”。
 */
public class Graduate implements Teacher,Student{
    public String name;
    public String gender;
    public int age;
    public int fee;
    public int pay;
    public Graduate(){}
    public Graduate(String name,String gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    @Override
    public void setFee(int fee){
        this.fee=fee;
    }
    public int getFee(){
        return fee;
    }
    public void setPay(int pay){
        this.pay=pay;
    }
    public int getPay(){
        return pay;
    }
    public void loan(){
        int totalIncome=pay*12;
        int totalPay=fee*2;
        int total=totalIncome-totalPay;
        if(total<2000){
            System.out.println("你需要贷款");
        }else{
            System.out.println("你的收入足够支配");
        }
    }
}
