package GUI.Day1;

import javax.swing.*;
import java.awt.*;

public class Demo6{
    public static void main(String[] args) {
        JFrame frame=new JFrame("个人说明");
        //创建一个面板
        Panel panel=new Panel();
        frame.add(panel);

        //用户名
        JLabel namelabel=new JLabel("用户名");
        panel.add(namelabel);
        JTextField nameField=new JTextField(12);
        panel.add(nameField);

        //密码
        JLabel passwordLabel=new JLabel("密码");
        panel.add(passwordLabel);
        JPasswordField passwordField=new JPasswordField(12);
        //敏感信息不可见
        panel.add(passwordField);

        //性别—单选框
        JLabel sexLabel=new JLabel("性别");
        panel.add(sexLabel);
        JRadioButton man=new JRadioButton("男",true);
        JRadioButton woman=new JRadioButton("女");
        ButtonGroup sexGroup=new ButtonGroup();
        sexGroup.add(man);
        sexGroup.add(woman);
        panel.add(man);
        panel.add(woman);

        //城市——下拉框
        JLabel cityLabel=new JLabel("你所在地");
        panel.add(cityLabel);
        Object[] arr={"惠州", "平山", "大岭", "黄排", "平海"};
        JComboBox city=new JComboBox(arr);
        panel.add(city);

        //爱好——复选框
        JLabel habitLabel=new JLabel("爱好");
        panel.add(habitLabel);
        JCheckBox habit1=new JCheckBox("篮球");
        JCheckBox habit2=new JCheckBox("游泳");
        JCheckBox habit3=new JCheckBox("足球");
        JCheckBox habit4=new JCheckBox("看漫画");
        JCheckBox habit5=new JCheckBox("跑步");
        panel.add(habit1);
        panel.add(habit2);
        panel.add(habit3);
        panel.add(habit4);
        panel.add(habit5);

        //个人简介
        JLabel myselfLabel=new JLabel("个人简介");
        panel.add(myselfLabel);
        JTextArea area=new JTextArea(20,15);
        area.setLineWrap(true);//自动换行
        panel.add(area);

        //提交按钮
        JButton submissLabel=new JButton("提交");
        panel.add(submissLabel,BorderLayout.SOUTH);

        JFrameUtils.initFrame(frame,500,450);
    }
}
