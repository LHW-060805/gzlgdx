package Study.setTest.ex1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("CBC","中国建设银行");
        map.put("ABC","中国农业银行");
        //String value=(String)map.get("CBC");
//        System.out.println(map.get("CBC"));
//        System.out.println(map.get("ABC"));
        Set set=map.keySet();
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);
        System.out.println(map.size());
        if(map.containsKey("CBC")){
            System.out.println("存在");
        }else{
            System.out.println("no");
        }

        //迭代器的使用，用于遍历查询Map集合的元素
//        Iterator iterator=set.iterator();
//        while(iterator.hasNext()){
//            String key=(String)iterator.next();
//            String values=(String)map.get(key);
//            System.out.println(key+"===="+values);
//        }

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry next =(Map.Entry) iterator.next();
            System.out.println(next.getKey()+"+++++"+next.getValue());
        }
    }
}
