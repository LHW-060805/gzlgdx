package Study.ex1;

public class Dog extends Pet {
    public Dog(){

    }
    public Dog(String name,int power){
        this.name=name;
        this.power=power;
    }
    @Override
    public void eat(int num){
        //重写方法
        this.power+=num;
        System.out.println("狗狗:"+name+"，能量值增加了："+num+",最终的能量值为："+power);
    }
}
