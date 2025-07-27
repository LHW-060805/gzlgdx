package Project_Myself.Project;

import java.util.ArrayList;
import java.util.List;

public class BL_System {
    List<BL_Set> list=new ArrayList<>();
    public void add_Bl(BL_Set BL){
        list.add(BL);
        if(list.contains(BL)){
            System.out.println("添加成功");
        }else{
            System.out.println("未知异常");
        }
    }
}
