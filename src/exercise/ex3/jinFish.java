package exercise.ex3;

public class jinFish extends Fish implements Swim,Eat{
    public jinFish(){}
    public jinFish(String type){
        this.type=type;
    }
    @Override
    public void swim(){
        System.out.println("金鱼在游泳");
    }
    public void eat(){
        System.out.println("金鱼在吃东西");
    }
    @Override
    public void show(){
        System.out.println("这是"+type);
    }
}
