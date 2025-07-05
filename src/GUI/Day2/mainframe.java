package GUI.Day2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainframe extends JFrame {
    JButton[][] buttons = new JButton[gamedata.rows][gamedata.cols];

    public mainframe() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();//与系统相关的工具类
        Dimension d = toolkit.getScreenSize();
        int x = (int) d.getWidth();
        int y = (int) d.getHeight();
        this.setBounds((x - 600) / 2, (y - 300) / 2, 600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用于同步关闭程序
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("梨花与祥哥的爱情故事");
        //基础的界面设计

        /*=============================================================================*/

        JMenuBar menu = new JMenuBar();
        this.setJMenuBar(menu);
        JMenu MENU = new JMenu("文件");
        JMenuItem MI1 = new JMenuItem("hello");
        JMenuItem MI2 = new JMenuItem("重开");
        JMenuItem MI3 = new JMenuItem("error");
        menu.add(MENU);
        MENU.add(MI1);
        MENU.add(MI2);
        MENU.add(MI3);
        MI1.addActionListener(E -> System.out.println("重开"));
        MI2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello");
            }
        });
        initpane();
        initBotton();
        showImage();
    }

    public void initpane() {
        JPanel jPanel = new JPanel(new FlowLayout());
        jPanel.add(new JLabel("用户名：海"));
        jPanel.add(new JLabel("得分：0"));
        JButton btnResort = new JButton("重排");
        JButton btnReplay = new JButton("新开");
        jPanel.add(btnResort);
        jPanel.add(btnReplay);
        this.getContentPane().add(jPanel, BorderLayout.NORTH);
    }

    public void initBotton() {
        JPanel gamePanel = new JPanel(new GridLayout(gamedata.rows, gamedata.cols));
        for (int i = 0; i < gamedata.rows; i++) {
            for (int j = 0; j < gamedata.cols; j++) {
                buttons[i][j] = new JButton();
                gamePanel.add(buttons[i][j]);
                this.getContentPane().add(gamePanel, BorderLayout.CENTER);
            }
        }
    }

    public void showImage() {
        for (int i = 0; i < gamedata.rows; i++) {
            for (int j = 0; j < gamedata.cols; j++) {
                buttons[i][j].setVisible(true);
                ImageIcon icon = new ImageIcon
                        ("F:\\Project_class2\\Image\\" + gamedata.data[i + 1][j + 1] + ".png");
                icon.setImage(icon.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
                buttons[i][j].setIcon(icon);
            }
        }
    }
}




