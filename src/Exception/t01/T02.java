package Exception.t01;

public class T02 {
    public static void devide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("除数不可为0");
        }
        int result = a / b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        devide(5, 0);
    }
}

