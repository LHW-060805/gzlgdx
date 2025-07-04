package homeword.ex4;
/*
Calculator类定义了一个简单的计算器，包含三个静态方法和一个静态常量。
① PI是一个静态常量，用于存储圆周率的近似值，值为3.14159。
② add方法是一个静态方法，用于执行两个浮点数的加法运算。
③ subtract方法同样是一个静态方法，用于执行两个浮点数的减法运算。
④ area方法使用静态常量PI来计算给定半径的圆的面积。它接受一个浮点数作为参数（代表圆的半径），并返回计算得到的面积。
（2）Test类是测试类，用于演示如何使用Calculator类中的静态方法和常量。
① main方法是程序的入口点。在main方法中，调用Calculator类的add和subtract静态方法，执行加法和减法运算，并将结果分别存储在sum和diff变量中，输出运算结果。
② 调用Calculator类的area方法，计算一个半径为5的圆的面积，并将结果存储在circleArea变量中，输出结果。
 */
public class Calculate {
    public static final double PI=3.14;
    public static int add(int res1,int res2){
        int result;
        result=res1+res2;
        return result;
    }
    public static int subtract(int res1,int res2){
        int result;
        result=res1-res2;
        return result;
    }
    public static double area(int r){
        double result;
        result=PI*r*r;
        return result;
    }
}
