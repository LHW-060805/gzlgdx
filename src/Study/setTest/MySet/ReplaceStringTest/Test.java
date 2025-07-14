package Study.setTest.MySet.ReplaceStringTest;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] words=new String[]{"你好","全球高考","一屋暗灯"};
        ReplaceString.Replace(words,1,2);
        System.out.println(Arrays.toString(words));
        ReplaceString.reserveWays(words);
        System.out.println(Arrays.toString(words));
    }
}
