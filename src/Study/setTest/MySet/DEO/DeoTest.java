package Study.setTest.MySet.DEO;

import java.util.List;

public class DeoTest {
    public static void main(String[] args) {
        Deo<User> demo= new Deo<>();
        demo.addSet("001",new User("秦究",29,"人类"));
        User values = demo.getValues("001");
        System.out.println(values);
        List<User> list = demo.list();
        for (User items:list) {
            System.out.println(items);
        }
    }
}
