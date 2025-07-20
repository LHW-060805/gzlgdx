package String_exercise.String_exercise.ComparatorTest;

import String_exercise.String_exercise.CampareTest.Product;

import java.util.Arrays;
import java.util.Comparator;

public class ComparetorTest {
    public static void main(String[] args) {
//        Comparator<Product> comparator1= new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Product && o2 instanceof Product) {
//                    Product p1=(Product)o1;
//                    Product p2=(Product)o2;
//                    return -Double.compare(p1.getPrice(),p2.getPrice());
//                }
//                throw new RuntimeException("类型不匹配");
//            }
//
//            @Override
//            public boolean equals(Object obj) {
//                return false;
//            }
//        };

        Comparator<Product> comparator1=(p1,p2)->Double.compare(p1.getPrice(), p2.getPrice());
        Comparator<Product> comparator3=Product::compareTo;
        Comparator<Object> comparator2=(Object o1, Object o2) ->{
                if (o1 == o2) {
                    return 0;
                }
                if (o1 instanceof Product && o2 instanceof Product) {
                    Product p1=(Product)o1;
                    Product p2=(Product)o2;
                    return p1.getName().compareTo(p2.getName());
                }
                throw new RuntimeException("类型不匹配！");
            };
        Product[] arr=
                {
                        new Product("Phane10Promax",6999),
                        new Product("vivo12",4999),
                        new Product("idea19",9990),
                        new Product("figssho",3999),
                        new Product("uhotuo",2000)
                };
        Arrays.sort(arr,comparator2);
        for (Product items:arr) {
            System.out.println(items);
        }
    }
}
