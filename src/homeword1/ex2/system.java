package homeword1.ex2;
/*
1.定义项目经理类（ProjectManager）
	属性：姓名name、工号id、工资salary、奖金bonus
	行为：工作work
2.定义程序员类（Developer）
	属性：姓名name、工号id、工资salary
	行为：工作work
3.要求：向上抽取一个父类员工类，让这两个类都继承这个父类，共有的属性写在父类中，子类重写父类中的方法。
 */
public class system {
    public String name;
    public String id;
    public double salary;
    public system(String name,String id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void word(){
        System.out.println();
    }
}
