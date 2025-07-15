package Study.setTest.SetExercise;

import java.util.*;

public class FavouriteWriter {
    public static final String writer1 = "麦香鸡呢";
    public static final String writer2 = "水千丞";
    public static final Scanner input=new Scanner(System.in);
    public static final Map<String, List> map = new HashMap<>();

    public static void setInputWriter(String inputWriters){
        boolean isValues=false;
        String name=inputWriters;
        while(!isValues){
            if (map.containsKey(inputWriters)) {
                System.out.println("查询成功");
                isValues=true;
            }else {
                System.out.println("无该作家");
                name=input.next();
            }
        }

        map.get(name)
        for(Object items:books){
            System.out.print(items+"\t\t");
        }

        List<String> currentBooks=map.get(name);    //获得value值
        System.out.println("请选择最喜欢的书");
        String inputBooks= input.next();

        while(true) {
            if (currentBooks.contains(inputBooks)) {
                 System.out.println("有该书");
                System.out.println
                        (
                                "你最喜欢的作家为："+inputWriters+",最喜欢的书为："+inputBooks
                        );
                break;
            }else{
                System.out.println("无该书");
                System.out.println("请选择最喜欢的书");
                inputBooks= input.next();
            }
        }
    }

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("欲言又止");
        list1.add("囚于永夜");
        list1.add("一屋暗灯");
        list1.add("荒野植被");
        map.put(writer1, list1);

        List<String> list2 = new ArrayList<>();
        list2.add("娘娘腔");
        list2.add("一经醉年");
        list2.add("你却爱着一个傻逼");
        list2.add("针峰对决");
        list2.add("附加遗产");
        list2.add("谁把谁当真");
        map.put(writer2, list2);

//        Set<Map.Entry<String, List>> entrySet = map.entrySet();
//        Iterator<Map.Entry<String, List>> iterator = entrySet.iterator();
        var entrySet=map.entrySet();
        var iterator=entrySet.iterator();
        System.out.println("作家名如下：");
        while(iterator.hasNext()){
            var next = iterator.next();
            System.out.print(next.getKey()+"\t\t");
        }
        System.out.println("\n");

        System.out.println("请输入作家：");
        String inputWriters= input.next();
        setInputWriter(inputWriters);
    }
}