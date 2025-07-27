package homeword.StudentHomework;

public class Test {
    public static void main(String[] args) {
        Graduate graduate=new Graduate("张三","男",25);
        graduate.setFee(20000);
        graduate.setPay(5000);
        graduate.loan();
    }
}
