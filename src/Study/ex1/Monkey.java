package Study.ex1;

public class Monkey extends Pet {
    public Monkey() {

    }

    public Monkey(String name, int power) {
        this.name = name;
        this.power = power;
    }

    @Override
    public void eat(int num) {
        this.power += num;
        System.out.println("猫猫:" + name + ",增加了能量为：" + num + ",最终的能量为：" + power);
    }
}