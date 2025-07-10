package Study.setTest.MySet;

public class DeoTest {
    public static void main(String[] args) {
        Deo<User> demo= new Deo<>();
        demo.addSet("001",new User("秦究",29,"人类"));
        demo.getValues("001");
        demo.list();
    }
}
