package homeword.ex3;
/*
2）子类设计：
① Dog类是Animal类的子类。Dog类重写了cry方法，输出“汪汪汪”。Dog类还定义了一个特有方法lookHome，用于模拟狗的看家行为，输出“狗在看家”。
② Cat类同样是Animal类的子类。Cat类重写了cry方法，输出“喵喵喵”。此外，Cat类还定义了一个特有方法catchMouse，用于模拟猫的捕鼠行为，输出“猫在抓老鼠”。
（3）测试类设计：Test类作为测试类，包含程序的入口方法 main()以及一个辅e助方法show。
① 在main方法中，创建了两个Animal类型的引用变量cat和dog。调用show方法，并分别传入cat和dog作为参数。
② show方法接受一个Animal类型的参数，调用cry方法展示动物的叫声，并分别调用Cat和Dog中特有方法catchMouse和lookHome。
 */
public class Dog extends Animal{
    @Override
    public void cry(){
        System.out.println("汪汪汪");
    }
    public void catchMouse(){
        System.out.println("狗在看家");
    }
}
