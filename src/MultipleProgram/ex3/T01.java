package MultipleProgram.ex3;

public class T01 {
    public static void main(String[] args) {
//        jinFish jinfish=new jinFish("金鱼");
//        jinfish.show();
//        jinfish.swim();
//        jinfish.eat();
//        System.out.println("========================");
//        shaFish shafish=new shaFish("鲨鱼");
//        shafish.show();
//        shafish.swim();
//        shafish.eat();
//        shafish.E_feel();
        Fish[] fish={new jinFish("金鱼"),new shaFish("鲨鱼")};
        for(Fish fishs:fish){
            fishs.show();
            fishs.eat();
            fishs.swim();
        }
    }
}
