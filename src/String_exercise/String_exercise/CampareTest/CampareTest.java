package String_exercise.String_exercise.CampareTest;

import java.util.Arrays;

public class CampareTest {
    public static void main(String[] args) {
//        String[] items=new String[]{"陈景深","喻繁","许则","陆赫杨","陈挽","赵声阁"};
//        Arrays.sort(items);     //默认排序
//        for (String item:items) {
//            System.out.println(item);
//        }
        Product[] products=
                {
                        new Product("hfosah",9000),
                        new Product("oasug",8888),
                        new Product("hsofa",10000),
                        new Product("oetewpromax",8888),
                        new Product("aawia",7788)
                };
        Arrays.sort(products);
        for (Object items:products) {
            System.out.println(items);
        }
    }
}
