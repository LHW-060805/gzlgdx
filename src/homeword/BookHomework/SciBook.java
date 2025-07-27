package homeword.BookHomework;
/*
① SciBook类和LitBook类分别继承自Book类，表示科技书和文艺书两种不同种类的图书。
② 子类通过实现基类的抽象方法，具体定义了科技书、文艺书特性。
例如，showKind()方法分别输出“这本书是科学书”和“这本书是文学书”。
③ 子类也实现了getPrice(int page, double discount) 方法，
根据各自的定价规则计算图书价格。这里假设科技书每页价格为0.1元，文艺书每页价格为0.08元，并考虑了折扣因素
 */
public class SciBook extends Book{
    public SciBook(){}
    public SciBook(int page,double discount){
        super(page,discount);
    }
    @Override
    public void showKind(){
        System.out.println("这是本科技书！");
    }
    public void getPrice(int page,double discount){
        price=0.1*page*discount;
        System.out.println("科技书的价格为："+price);
    }
}
