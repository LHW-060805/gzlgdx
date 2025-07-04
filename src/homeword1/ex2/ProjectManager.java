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
public class ProjectManager extends system{
    public double bonus;
    public ProjectManager(String name,String id,double salary,double bonus){
        super(name,id,salary);
        this.bonus=bonus;
    }
    @Override       //此关键字用来重写父类的方法
    public void word(){
        System.out.println("项目经理["+name+"]  ID:"+id+"  正在协同开" +
                "发进度(基础工资："+salary+"元,项目奖金："+bonus+"元)");
    }
}
