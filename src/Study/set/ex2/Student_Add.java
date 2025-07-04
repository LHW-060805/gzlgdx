package Study.set.ex2;

import java.util.Scanner;

public class Student_Add {
private static String getValidName(Scanner input) {
    while (true) { // 无限循环，直到输入合法
        System.out.print("请输入姓名（至少2个字母，不含数字）：");
        String name = input.nextLine().trim(); // 读取输入并去除首尾空格
        if (name.isEmpty()) {
            throw new IllegalArgumentException("姓名不能为空");
        }
        // 正则表达式校验：仅允许字母和空格，且长度≥2
        if (!name.matches("^[a-zA-Z\\s]{2,}$")) {
            throw new IllegalArgumentException("姓名格式错误：只能包含字母和空格，且长度≥2");
        }

        return name; // 输入合法时返回姓名
    }
}
    public static void main(String[] args) {
        Student_System SSY=new Student_System();
        Scanner input=new Scanner(System.in);
        String Yesornot="yes";
        while(Yesornot.equals("yes")){
            try {
                String inputname = getValidName(input);
                System.out.print("请输入年龄：");
                int inputage = input.nextInt();
                System.out.print("请输入性别:");
                String inputsex = input.next();
                Student ST = new Student(inputname, inputage, inputsex);
                SSY.addStudent(ST);
            }catch (IllegalArgumentException e) {
                System.out.println("输入错误：" + e.getMessage());
                input.nextLine(); // 清除错误输入
            }
            System.out.print("是否继续添加：");
            Yesornot=input.next();
        }
//        System.out.println("是否要查询学生信息（yes or no）：");
//        String define=input.next();
//        while(define.equals("yes")){
//            SSY.searchStudent();
//            break;
//        }
        System.out.print("是否要查询学生信息（yes/no）：");
        String define = input.next();
        if (define.equals("yes")) {
            System.out.print("请输入要查询的学生姓名：");
            String searchName = input.next();
            SSY.searchStudent(searchName);
        }
        System.out.println("程序结束");
    }
}
