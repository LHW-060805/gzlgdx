package homeword1.ex3;
/*
① 图书共有的属性，如页码（page）、折扣（discount）和价格（price），其中价格为公有属性。
② 提供了构造函数，用于初始化页码和折扣属性。
③ 定义了两个抽象方法：showKind() 用于显示图书种类，
getPrice(int page, double discount) 用于计算图书价格。这两个方法的具体实现在子类中完成。
④ 定义了一个普通方法showPrice()，用于显示图书的价格
 */
public abstract class Book {
    public int page;
    public double discount;
    public double price;
    public Book(){}
    public Book(int price,double discount){
        this.price=price;
        this.discount=discount;
    }
    public abstract void showKind();
    public abstract void getPrice(int price,double discount);
}
