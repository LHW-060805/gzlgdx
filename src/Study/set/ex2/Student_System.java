package Study.set.ex2;
import java.util.ArrayList;
import java.util.List;


public class Student_System {
    List<Student> list = new ArrayList<>();

    public void addStudent(Student student) {
        list.add(student);
        if (list.contains(student)) {
            System.out.println("添加成功");
        } else {
            System.err.println("未知异常");
        }
    }

//      public void searchStudent(){
//        for (Student ST:list) {
//            System.out.println(ST);
//        }
//    }
    public void searchStudent(String name) {
        boolean found = false;
        for (Student student : list) {
            if (student.getName().equals(name)) {
                System.out.println("找到学生信息：");
                System.out.println("姓名：" + student.getName());
                System.out.println("年龄：" + student.getAge());
                System.out.println("性别：" + student.getSex());
                found = true;
                break;
            }
        }
        if (!found) {
            System.err.println("未找到名为 " + name + " 的学生");
        }
    }
}
