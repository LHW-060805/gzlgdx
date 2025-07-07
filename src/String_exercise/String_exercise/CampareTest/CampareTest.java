package String_exercise.String_exercise.CampareTest;

import java.util.Arrays;

public class CampareTest {
    public static void main(String[] args) {
        String[] items=new String[]{"陈景深","喻繁","许则","陆赫杨","陈挽","赵声阁"};
        Arrays.sort(items);     //默认排序
        for (String item:items) {
            System.out.println(item);
        }
    }
}
