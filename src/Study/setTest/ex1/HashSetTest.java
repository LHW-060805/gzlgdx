package Study.setTest.ex1;


import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Book> set=new HashSet<>();
        Book b1=new Book("你却爱着一个傻逼",98,"水千丞");
        set.add(b1);
        System.out.println(set.size());
        System.out.println(set);
//        Iterator iterator= set.iterator();      //迭代器用于遍历集合元素
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        set.forEach(System.out::println);
    }
}
