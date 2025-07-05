package Polymorphism.FishAction;

public class shaFish extends Fish implements Swim,Eat,electricity_Feel{
    public shaFish(){}
    public shaFish(String type){
        this.type=type;
    }
    @Override
    public void swim(){
        System.out.println("鲨鱼在游泳");
    }
    public void eat(){
        System.out.println("鲨鱼在吃");
    }
    public void E_feel(){
        System.out.println("鲨鱼电感应能力");
    }
    @Override
    public void show(){
        System.out.println("这是"+type);
    }
}
