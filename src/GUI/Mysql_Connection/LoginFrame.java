package GUI.Mysql_Connection;

import GUI.Day2.mainframe;
import GUI.Mysql_Connection.jdbcUtiles;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginFrame extends Frame {
    private static final int height = 200; // 设置窗口高度
    private static final int width = 350; // 设置窗口宽度


    public LoginFrame() {
        // 获取屏幕大小
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((screenSize.width - width) / 2);
        int y = (int) ((screenSize.height - height) / 2);
        this.setBounds(x, y, width + 17, height + 38);    // 设置大小
        this.setTitle("登录界面"); // 设置程序名字
        initPane(); // 初始化登录面板
    }

    private void initPane() {
        final JPanel fieldPanel = new JPanel(); // 生成panel对象
        //创建表格布局管理器
        GridLayout gridLayout = new GridLayout(5, 2, 10, 10);
        //让窗体交给表格布局管理器管理
        fieldPanel.setLayout(gridLayout);

        JLabel a1 = new JLabel("昵  称:", SwingConstants.RIGHT);
        fieldPanel.add(a1); // 添加按钮
        JTextField nickname = new JTextField(12);
        fieldPanel.add(nickname); // 添加文本框

        JLabel a2 = new JLabel("账  号:", SwingConstants.RIGHT);
        fieldPanel.add(a2);
        JPasswordField loginId = new JPasswordField(12);
        fieldPanel.add(loginId);

        JLabel a3 = new JLabel("密  码:", SwingConstants.RIGHT);
        fieldPanel.add(a3);
        JPasswordField loginPwd = new JPasswordField(12);
        fieldPanel.add(loginPwd);

        JButton jbu1 = new JButton("开始游戏"); // 生成确定按钮
        JButton jbu2 = new JButton("退出游戏"); // 生成取消按钮
        JButton jbu3 = new JButton("注册"); // 生成取消按钮
        JButton jbu4 = new JButton("删除账号");
        fieldPanel.add(jbu1, BorderLayout.SOUTH); // 添加按钮
        fieldPanel.add(jbu2, BorderLayout.SOUTH); // 添加按钮
        fieldPanel.add(jbu3, BorderLayout.SOUTH); // 添加按钮
        fieldPanel.add(jbu4, BorderLayout.SOUTH);
        jbu1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nickname.getText().trim();
                String id = loginId.getText().trim();
                String password = loginPwd.getText().trim();
                Connection connection = null;
                PreparedStatement preparedStatement = null;
                connection = jdbcUtiles.getConnection();
                try {
                    mainframe game = new mainframe();
                    game.setVisible(true);
                } finally {
                    jdbcUtiles.close(null, preparedStatement, connection);
                }
            }
        });
        jbu2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(
                        LoginFrame.this,
                        "确定要退出游戏吗?",
                        "确认退出",
                        JOptionPane.YES_NO_OPTION
                );
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
        jbu3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nickname.getText().trim();//用于获得nickname里的文本，且不包含空
                String id = loginId.getText().trim();
                String password = loginPwd.getText().trim();
                String sql = "insert into lianliankan values (?,?,?)";
                Connection connection = null;
                PreparedStatement preparedStatement = null;//用于执行MySQL的语句
                connection = jdbcUtiles.getConnection();
                try {
                    connection = jdbcUtiles.getConnection();
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, name);//将Java的字符串安全的传入sql语句中
                    preparedStatement.setString(2, id);
                    preparedStatement.setString(3, password);
                    preparedStatement.executeUpdate();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                } finally {
                    jdbcUtiles.close(null, preparedStatement, connection);
                }
            }
        });
        jbu4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = loginId.getText().trim();
                String password = loginPwd.getText().trim();

                if (id.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(          //带有确认信息的对话框
                            LoginFrame.this,
                            "账号和密码不能为空",
                            "删除失败",
                            JOptionPane.WARNING_MESSAGE
                    );
                    return;
                }

                int confirm = JOptionPane.showConfirmDialog(        //带有选项的交流框
                        LoginFrame.this,
                        "确定要删除该账号吗? 此操作不可恢复!",
                        "确认删除",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE     //用于直观提示
                );

                if (confirm != JOptionPane.YES_OPTION) {
                    return;
                }

                Connection conn = null;
                PreparedStatement stmt = null;
                ResultSet rs = null;

                try {
                    conn = jdbcUtiles.getConnection();

                    // 验证账号密码
                    String Sql = "SELECT * FROM lianliankan WHERE id = ? AND password = ?";
                    stmt = conn.prepareStatement(Sql);
                    stmt.setString(1, id);//此处的1是指第一个占位符
                    stmt.setString(2, password);
                    rs = stmt.executeQuery();

                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(
                                LoginFrame.this,
                                "账号或密码错误",
                                "删除失败",
                                JOptionPane.ERROR_MESSAGE
                        );
                        return;
                    }

                    // 删除账号
                    String deleteSql = "DELETE FROM lianliankan WHERE id = ?";
                    stmt = conn.prepareStatement(deleteSql);
                    stmt.setString(1, id);
                    int rows = stmt.executeUpdate();

                    if (rows > 0) {
                        JOptionPane.showMessageDialog(
                                LoginFrame.this,
                                "账号删除成功",
                                "删除结果",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                        loginId.setText("");
                        loginPwd.setText("");
                        nickname.setText("");

                    } else {
                        JOptionPane.showMessageDialog(
                                LoginFrame.this,
                                "账号删除失败",
                                "删除结果",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(
                            LoginFrame.this,
                            "数据库错误: " + ex.getMessage(),
                            "删除失败",
                            JOptionPane.ERROR_MESSAGE
                    );
                } finally {
                    jdbcUtiles.close(rs, stmt, conn);
                }
            }
        });

//        this.getContentPane().add(fieldPanel, BorderLayout.CENTER);

    }
}
class Login_Main{
    public static void main(String[] args) {
        LoginFrame l1 = new LoginFrame();
        l1.setVisible(true);
    }
}
