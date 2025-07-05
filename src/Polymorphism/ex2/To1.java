package Polymorphism.ex2;

public class To1 {
    public static void main(String[] args) {
        Grandpa grandpa=new Grandpa();
        String[] types={"Dog","Cat","Pig"};
        for(String type:types){
            Animal animal=grandpa.cuiShape(type);
            animal.getShape();
        }
    }
}
