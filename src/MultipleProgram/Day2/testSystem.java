package MultipleProgram.Day2;

public class testSystem {
    public static void main(String[] args) {
        mySystem mysystem=new mySystem();
        Thread thread1=new Thread(mysystem);
        thread1.setName("陆赫杨+许则");
        thread1.start();

        Thread thread2=new Thread(mysystem);
        thread2.setName("宋星澜+宋俞");
        thread2.start();
    }
}
