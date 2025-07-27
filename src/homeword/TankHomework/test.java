package homeword.TankHomework;

import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<brand> arr=Arrays.asList(
                new brand("001","哇哈哈",3.5,100),
                new brand("002","福德",6.8,99),
                new brand("003","罗浮山泉",2.0,999)
        );
        arr.forEach(System.out::println);
    }
}
