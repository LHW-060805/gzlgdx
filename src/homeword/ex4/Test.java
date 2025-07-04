package homeword.ex4;
/*
Test类是测试类，用于演示如何使用Calculator类中的静态方法和常量。
① main方法是程序的入口点。在main方法中，调用Calculator类的add和subtract静态方法，执行加法和减法运算，并将结果分别存储在sum和diff变量中，输出运算结果。
② 调用Calculator类的area方法，计算一个半径为5的圆的面积，并将结果存储在circleArea变量中，输出结果。
 */
public class Test {
    public static void main(String[] args) {
        int sum=Calculate.add(3,5);
        int diff=Calculate.subtract(10,4);
        double result=Calculate.area(5);
        System.out.println("两个数和为："+sum);
        System.out.println("两个数差为："+diff);
        System.out.println("圆的面积为："+result);
    }
}
