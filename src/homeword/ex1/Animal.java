package homeword.ex1;
/*
请使用继承定义以下类: 将狗和猫相同的内容(姓名、颜色、种类、吃饭)抽取到父类Animal中，要求使用父类构造器生成初始值。
狗(Dog)：（旺财，黑色，哈士奇）
  成员变量: 姓名name、颜色color、种类species
  成员方法: 吃饭eat、看家lookHome
猫(Cat)：（汤姆，蓝灰色，英国短毛猫）
  成员变量: 姓名name、颜色color、种类species
  成员方法: 吃饭eat、抓老鼠catchMouse
 */
public class Animal {
    public String name;
    public Animal(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println(name+"正在吃饭");
    }
}
