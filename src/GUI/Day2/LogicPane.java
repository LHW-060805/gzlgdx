package GUI.Day2;

import GUI.Mysql_Connection.LoginFrame;
import GUI.Mysql_Connection.jdbcUtiles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class LogicPane extends JFrame {
    private static final int height = 350; // 设置窗口高度
    private static final int width = 450; // 设置窗口宽度

    public LogicPane(){
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
        int x=(int)d.getWidth();
        int y=(int)d.getHeight();
        this.setBounds((x-width)/2,(y-height)/2,width,height);
        this.setResizable(false);
        this.setTitle("登录页面");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initPane();
    }
    public void initPane(){
        JPanel panel=new JPanel();
        GridLayout gridLayout = new GridLayout(5, 2, 10, 10);
        //让窗体交给表格布局管理器管理
        panel.setLayout(gridLayout);

        JLabel l1=new JLabel("名 字");
        panel.add(l1);
        JTextField nameField=new JTextField(12);
        panel.add(nameField);

        JLabel l2=new JLabel("账 号");
        panel.add(l2);
        JTextField idField=new JTextField(12);
        panel.add(idField);

        JLabel l3=new JLabel("密码");
        panel.add(l3);
        JPasswordField passwordField=new JPasswordField(12);
        panel.add(passwordField);

        JButton j1=new JButton("开始游戏");
        panel.add(j1);
        JButton j2=new JButton("开始游戏");
        panel.add(j2);
        JButton j3=new JButton("开始游戏");
        panel.add(j3);
        JButton j4=new JButton("开始游戏");
        panel.add(j4);

        j1.addActionListener(new ActionListener() {
            String name=nameField.getText().trim();
            String id=idField.getText().trim();
            String password=passwordField.getText().trim();
            Connection connection=null;
            PreparedStatement preparedStatement=null;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (id.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(          //带有确认信息的对话框
                            LogicPane.this,
                            "账号和密码不能为空",
                            "删除失败",
                            JOptionPane.WARNING_MESSAGE
                    );
                    return;
                }
                try{
                    connection= jdbcUtiles.getConnection();

                    mainframe game=new mainframe();
                    game.setVisible(true);
                }finally{

                }
            }
        });

        this.getContentPane().add(panel, BorderLayout.CENTER);
    }
}
class test{
    public static void main(String[] args) {
        LogicPane Pane=new LogicPane();
        Pane.setVisible(true);
    }
}
