package Study.set.ex1;

import Polymorphism.AnimalEat.Cat;
import Polymorphism.AnimalEat.Dog;
import Polymorphism.AnimalEat.Master;
import Polymorphism.AnimalEat.Monkey;

public class text {
    public static void main(String[] args) {
        Dog dog = new Dog("小黑", 100);
        Cat cat=new Cat("小雪",100);
        Monkey monkey=new Monkey("海恩",100);
        Master master=new Master();
        master.feed(dog,45);
        master.feed(cat,20);
        master.feed(monkey,45);
    }
}
