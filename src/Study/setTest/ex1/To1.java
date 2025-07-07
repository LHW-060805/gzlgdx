package Study.setTest.ex1;
import java.util.*;

public class To1 {
    public static void main(String[] args) {
       // 泛型集合，在Java中泛型集合比较推荐，在实际操作中也推荐
        List<Book> list=new ArrayList<>();
        Book b1=new Book("你却爱着一个傻逼",98,"水千丞");
        list.add(b1);
        Book b2=new Book("娘娘腔",65,"水千丞");
        list.add(b2);
        for(Book item:list){
            System.out.println(item);
        }


        /*=========================================================*/


        Map<String,Book> map=new HashMap<>();
        Book b3=new Book("全球高考",45,"木苏里原著");
        Book b4=new Book("某某",46,"木苏里原著");
        //存储集合元素
        map.put(b1.getName(),b3);
        map.put(b2.getName(),b4);
        Set<String> keys=map.keySet();
        for(String key:keys){
            Book values=map.get(key);//打印出book类的内容，因为是Book类型
            System.out.println(values);
            System.out.println(key+"==="+values.getAuthor());
        }

    }
}
