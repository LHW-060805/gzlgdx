package Study.setTest.TreeSetTest;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
//        treeSet.add("AA");
//        treeSet.add("WW");
//        treeSet.add("AA");
//        treeSet.add("JJ");
//        treeSet.add("YY");
        //需为同类型比较大小
        User user1=new User("lili",25);
        User user2=new User("luohaiwen",21);
        User user3=new User("oufg",19);
        User user4=new User("sgoriu",29);
        User user5=new User("zgogg",25);
        treeSet.add(user1);
        treeSet.add(user2);
        treeSet.add(user3);
        treeSet.add(user4);
        treeSet.add(user5);
        //结果表明，TreeSet集合中，equals方法和HashCode方法在这不用，不必重写，比较大小看的是所在类的Compara方法和CompareTo
        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
