package homeword1.ex3;

public class Test {
    public static void main(String[] args) {
        SciBook book1=new SciBook(530,0.7);
        book1.showKind();
        book1.getPrice(530,0.7);
        System.out.println("======================");
        LitBook book2=new LitBook(530,0.7);
        book2.showKind();
        book2.getPrice(530,0.7);
    }
}
