package MultipleProgram.Day3.exercise2;

public class HappyNewyear {
    public static void main(String[] args) {
        for (int i = 10; i >=0 ; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i ==0) {
                System.out.println("Happy NewYear");
            }else {
                System.out.println(i);
            }
        }
    }
}
