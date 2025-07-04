package Study.set;

import Study.ex1.Cat;
import Study.ex1.Dog;
import Study.ex1.Master;
import Study.ex1.Monkey;

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
