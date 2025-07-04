package exercise.ex4;

public class Square implements Shape{
    double side;
    public Square(){};
    public Square(double side){
        this.side=side;
    }
    @Override
    public double getArea(){
        double result;
        result=side*side;
        return result;
    }
}
