package Study.setTest.MySet.DEO;

import java.util.*;

public class Deo<T> {
    Map<String,T> map;
    {
        map=new HashMap<>();
    }
//
//    1.统一初始化逻辑：无论使用哪个构造函数创建对象，初始化块中的代码都会被执行。
//    2.确保变量初始化：在对象实例化时自动执行，保证成员变量在使用前被正确初始化。
//
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
