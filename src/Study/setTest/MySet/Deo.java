package Study.setTest.MySet;

import java.util.*;

public class Deo<T> {
    Map<String,T> map;
    {
        map=new HashMap<>();
    }
    public void addSet(String id,T tUser){
        if (!map.containsKey(id)) {
            map.put(id, tUser);
            System.out.println("已添加");
        }else{
            System.out.println("不存在");
        }
    }
    public void removeSet(String id){
        if (!map.containsKey(id)) {
            map.remove(id);
            System.out.println("已删除");
        }else{
            System.out.println("不存在");
        }
    }
    public T getValues(String id){
        return map.get(id);
    }
    public List<T> list(){
        Collection<T> values = map.values();
        List<T> list=new ArrayList<>();
        list.addAll(values);
        return list;
    }
}
