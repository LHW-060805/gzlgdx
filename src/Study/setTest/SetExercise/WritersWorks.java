package Study.setTest.SetExercise;

import java.util.*;

public class WritersWorks {
    public static final String writer1="麦香鸡呢";
    public static final String writer2="水千丞";
    public static void main(String[] args) {
        Map<String,List<String>> map=new HashMap<>();
        List<String> list1=new ArrayList<>();
        list1.add("欲言又止");
        list1.add("囚于永夜");
        list1.add("一屋暗灯");
        list1.add("荒野植被");
        map.put(writer1,list1);

        List<String> list2=new ArrayList<>();
        list2.add("娘娘腔");
        list2.add("一经醉年");
        list2.add("你却爱着一个傻逼");
        list2.add("针峰对决");
        list2.add("附加遗产");
        list2.add("谁把谁当真");
        map.put(writer2,list2);

        var entrySet = map.entrySet();
        var iterator = entrySet.iterator();
        while(iterator.hasNext()){
            var next = iterator.next();
            System.out.println("作家："+next.getKey());
            System.out.println("书名："+next.getValue());
        }
    }
}
