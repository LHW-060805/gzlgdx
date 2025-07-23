package Study.NewTest.StreamTest;

import String_exercise.String_exercise.CampareTest.Product;

import java.util.Arrays;
import java.util.List;

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
        List<String> list=Arrays.asList("AA","BB","CC");
        //map是函数接口，可以用lambda表达式和方法引用
        //map的作用是接收一个函数作为参数，将函数转换为其他形式或者提取，并且遍历到每个元素
        list.stream().map(String::toLowerCase).toList().forEach(System.out::println);
        System.out.println("===================================================");
        //使用filter过滤掉数据后用map映射数据
//        productList.stream().
//                filter(product -> product.getName().length()>5).
//                map(Product::getName).
//                forEach(System.out::println);
        productList.stream().map(Product::getName).filter(name->name.length()>3).forEach(System.out::println);
        System.out.println("===================================================");
        Integer[] arr1={54,98,100,33,4,86,0};
        String[] arr2={"AA","ZZ","DD","赵声阁"};
//        Arrays.stream(arr1).sorted().forEach(System.out::println);
//        Arrays.stream(arr2).sorted().forEach(System.out::println);
        productList.stream().sorted().forEach(System.out::println);
        Arrays.stream(arr2).sorted((e1,e2)->-e1.compareTo(e2)).forEach(System.out::println);

        System.out.println("===================================================");
        System.out.println(Arrays.stream(arr1).reduce(0, Integer::max));
//        System.out.println(Arrays.stream(arr1).max(Integer::compare).get());
        System.out.println(productList.stream().max(Product::compareTo));
        long count = productList.stream().count();
        System.out.println(count);
    }
}
