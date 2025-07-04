package Myself_Study.ex3;

public class Manager {
    public Cake getCake(String type){
        Cake cake;
        if(type.equals("慕斯蛋糕")){
            cake =new Musicake();
        }else if(type.equals("泡芙蛋糕")){
            cake =new Paofucake();
        }else{
            cake =new Hongsirangcake();
        }
        return cake;
    }
}
