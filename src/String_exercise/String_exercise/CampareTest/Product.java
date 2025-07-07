package String_exercise.String_exercise.CampareTest;

public class Product implements Comparable{
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Product(){
        
    }
    public Product(String name,double price){
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //此方法用于执行如何判断当前类的大小排序
    @Override
    public int compareTo(Object o) {
        if (o == this) {
            return 0;
        }
        if (o instanceof Product) {     //老糊涂犯了，instanceof是比较类之间的相同！！！
            Product p=(Product)(o);
            int num= Double.compare(this.price,p.price);
            if (num !=0) {
                return num;
            }
            return this.name.compareTo(p.name);
            //因为是字符串，本身已经重写compareTo方法
        }
        throw new RuntimeException("类型不匹配");
    }
}
