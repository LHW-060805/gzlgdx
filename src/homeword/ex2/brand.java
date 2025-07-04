package homeword.ex2;
/*
定义一个数组（arr）存储3个商品对象，
商品的属性包含商品的编号（id）、名字（name）、价格（price）、库存（count），
创建三个商品对象存入到数组中，最后将数组中的商品对象信息进行输出。
 */
public class brand {
    final private String id;
    final private String name;
    final private double price;
    final private int count;
    public brand(String id,String name,double price,int count){
        this.id=id;
        this.name=name;
        this.price=price;
        this.count=count;
    }
    public String getId(){return id;}
    public int getCount(){return count;}
    public String getName(){return name;}
    public double price(){return price;}
    public void show(){
        System.out.println(id+" "+name+" "+price+" "+count);
    }
}
