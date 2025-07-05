package Polymorphism.Dancing;

public class T1 {
    public static void main(String[] args) {
        Dance[] dances=new Dance[]{new Dancer(),new DanceTeacher()};
        for (Dance item:dances) {
            item.dance();
        }
    }
}
