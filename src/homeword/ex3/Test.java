package homeword.ex3;
/*
（3）测试类设计：Test类作为测试类，包含程序的入口方法 main()以及一个辅助方法show。
① 在main方法中，创建了两个Animal类型的引用变量cat和dog。调用show方法，并分别传入cat和dog作为参数。
② show方法接受一个Animal类型的参数，调用cry方法展示动物的叫声，并分别调用Cat和Dog中特有方法catchMouse和lookHome。
 */

public class Test {
    public static void show(Animal animal){
    animal.cry();
    if(animal instanceof Cat){
        Cat cat=(Cat)animal;
        cat.lookHome();
    }else if(animal instanceof Dog){
        Dog dog=(Dog)animal;
        dog.catchMouse();
    }
}
    public static void main(String[] args) {
        Animal cats=new Cat();
        Animal dogs=new Dog();
        show(dogs);
        show(cats);
    }
}
