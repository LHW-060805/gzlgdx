package homeword.PersonIDHomework;
/*
1.定义项目经理类（ProjectManager）
	属性：姓名name、工号id、工资salary、奖金bonus
	行为：工作work
2.定义程序员类（Developer）
	属性：姓名name、工号id、工资salary
	行为：工作work
3.要求：向上抽取一个父类员工类，让这两个类都继承这个父类，共有的属性写在父类中，子类重写父类中的方法。
 */
public class Developer extends system {
    public Developer(String name,String id,double salary){
        super(name, id, salary);
    }
    @Override
    public void word(){
        System.out.println("程序员["+name+ "]  ID:"+id+"  正在实现核心功能模块(基础工资："+salary+"元)");
    }
}
