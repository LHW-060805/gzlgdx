package Study.StreamTest;

import String_exercise.String_exercise.CampareTest.Product;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Instantiation {
    public static void main(String[] args) {
        List<Product> productList=Product.DateSave();
//        Stream<Product> stream1 = productList.stream();
//        Stream<Product> stream2 = productList.parallelStream();
//        System.out.println(stream1);
//        System.out.println(stream2);
//
//        Integer[] arr={1,2,3,4,5};
//        Stream<Integer> stream3 = Arrays.stream(arr);
//        System.out.println(stream3);
//
//        Stream<Integer> integerStream = Stream.of(1, 245, 45, 6, 7);
//        System.out.println(integerStream);

        //attention!!这里的filter和forEach都是接口，可以用lambda表达式,涉及到stream的方法都是接口
        //filter适用于过滤数据流，forEach是用来结束流，要是没有结束流，中间操作就不会执行
        productList.stream().filter(product -> product.getPrice() >= 9090).forEach(System.out::println);
        System.out.println("===================================================");
        productList.stream().limit(4).forEach(System.out::println);
        System.out.println("===================================================");
        productList.stream().skip(3).forEach(System.out::println);
        System.out.println("===================================================");
        productList.stream().distinct().forEach(System.out::println);
    }
}
