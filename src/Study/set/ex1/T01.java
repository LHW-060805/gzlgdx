package Study.set.ex1;

import java.util.ArrayList;
import java.util.List;


public class T01 {
    public static void main(String[] args) {
        List list=new ArrayList();
        Book b1=new Book("欲言难止",45,"大大");
        Book b2=new Book("一屋暗灯",78,"大大");
        list.add(b1);
        list.add(b2);
        Book b3=new Book("娘娘腔",65,"水千丞");
        list.add(1,b3);
        list.remove(b1);
        //是否存在某个元素.contains
        if(list.contains(b2)){
            System.out.println("有");
        }else{
            System.out.println("无");
        }
        System.out.println(b1.getName());


        for (Object o : list) {
            System.out.println(o);
        }
    }
}
