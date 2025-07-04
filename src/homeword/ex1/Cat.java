package homeword.ex1;

/*
猫(Cat)：（汤姆，蓝灰色，英国短毛猫）
  成员变量: 姓名name、颜色color、种类species
  成员方法: 吃饭eat、抓老鼠catchMouse
 */
public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    public void catchMouse(){
        System.out.println(name+"正在抓老鼠");
    }

}
