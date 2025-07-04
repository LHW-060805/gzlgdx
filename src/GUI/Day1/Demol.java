package GUI.Day1;

import javax.swing.*;
import java.awt.*;

public class Demol extends JFrame{

    public Demol() {
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension d=toolkit.getScreenSize();
        int x=(int)d.getWidth();
        int y=(int)d.getHeight();
        this.setBounds((x-600)/2,(y-600)/2,600,600);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //基本界面

        //菜单
        JMenuBar bar=new JMenuBar();
        this.add(bar,BorderLayout.NORTH);//创建菜单
        JMenu fileMenu=new JMenu("文件");
        JMenu editMenu=new JMenu("编辑");
        bar.add(fileMenu);
        bar.add(editMenu);

        //菜单栏
        JMenuItem OpenMenu=new JMenuItem("打开");
        JMenuItem saveMenu=new JMenuItem("保存");
        fileMenu.add(OpenMenu);
        fileMenu.add(saveMenu);

        JMenuItem copyMenu=new JMenuItem("复制");
        JMenuItem cutMenu=new JMenuItem("剪辑");
        JMenuItem switchMenu=new JMenuItem("切换工作状态");
        editMenu.add(copyMenu);
        editMenu.add(cutMenu);
        editMenu.add(switchMenu);
    }
}
