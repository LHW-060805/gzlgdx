package Study.set.ex1;


import java.util.HashSet;
import java.util.Set;

public class T02 {
    public static void main(String[] args) {
        Set set=new HashSet();
        Book b1=new Book("你却爱着一个傻逼",98,"水千丞");
        Book b2=b1;
        set.add(b1);
        set.add(b2);
        System.out.println(set.size());
    }
}
