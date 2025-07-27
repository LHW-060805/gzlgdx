package homeword.ExceptionHomework;
/*
需求:  编写一个学生类
属性:  姓名、年龄、手机号码
1、年龄应控制在 0 ~120 之间
2、手机号码长度控制在11位即可
3、创建1个学生对象, 并打印学生信息 (学生的信息都来自于键盘录入)
如果出现异常, 给出提示，之后能够继续输入
手机号码如果输入11个字符，不是数字，应该怎么处理？
 */
public class Student {
    private String name;
    private int age;
    private String Number;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0||age>=120){
            System.err.println("年龄有误");
            throw new IllegalArgumentException("年龄不合法");
        }else {
            this.age = age;
        }
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        if(number.length()!=11){
            throw new IllegalArgumentException("长度不合法");
        }else{
            this.Number = number;
        }
    }
    public Student(){

    }
    public Student(String name,int age,String Number){
        setName(name);
        setAge(age);
        setNumber(Number);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Number='" + Number + '\'' +
                '}';
    }
}
