package String_exercise.String_exercise.CampareTest;

import java.util.Objects;

public class Product implements Comparable<Object>{
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    //此方法用于执行如何判断当前类的大小排序
    @Override
    public int compareTo(Object o) {        //用来判断对象之间的排序关系
        if (o == this) {
            return 0;
        }
        if (o instanceof Product) {     //老糊涂犯了，instanceof是比较类之间的相同！！！
            Product p=(Product)(o);     //参数o的类型是Object，这意味着它可以是任何类型的对象
            int num= Double.compare(this.price,p.price);
            if (num !=0) {
                return -num;
            }
            return this.name.compareTo(p.name);
            //因为是字符串，本身已经重写compareTo方法
        }
        throw new RuntimeException("类型不匹配");
    }
}
