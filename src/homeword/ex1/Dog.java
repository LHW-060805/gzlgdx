package homeword.ex1;

/*
狗(Dog)：（旺财，黑色，哈士奇）
  成员变量: 姓名name、颜色color、种类species
  成员方法: 吃饭eat、看家lookHome
 */
public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }
    public void lookhome(){
        System.out.println(name+"正在看家");
    }

}
