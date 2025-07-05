package MultipleProgram.ex4;

public class Rectangle implements Shape{
    double height;
    double width;
    public Rectangle(){}
    public Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }
    @Override
    public double getArea(){
        double result;
        result=height*width;
        return result;
    }
}
