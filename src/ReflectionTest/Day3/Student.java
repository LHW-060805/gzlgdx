package ReflectionTest.Day3;

public class Student {
    private String name;
    private int age;
    private String sex;
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
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    private void show(){
        System.out.println("你好，我是你的程序");
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
    public Student(){

    }
    public Student(String name, int age, String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

}
