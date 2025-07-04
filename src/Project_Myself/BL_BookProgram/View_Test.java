package Project_Myself.BL_BookProgram;

import GUI.Mysql_Connection.jdbcUtiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class View_Test {
    public static String inputName(Scanner input) {
        while (true) {
            try {
                System.out.print("请输入姓名：");
                String name = input.nextLine().trim();

                if (name.isEmpty()) {
                    throw new IllegalArgumentException("姓名不能为空");
                }

                return name;
            } catch (IllegalArgumentException e) {
                System.out.println("错误：" + e.getMessage());
            }
        }
    }

    //后续就不用再开对象
    private static Scanner input = new Scanner(System.in);
    private static Connection connection = null;
    private static PreparedStatement preparedStatement = null;
    private static ResultSet rs = null;
//    涉及数据库的连接

    public static void main(String[] args) {
        System.out.println("1-你的原耽圈    2-添加原耽成员    3-删除原耽成员    4-退出    请选择(1-4):");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        while(num!=4){
            switch(num){
                case 1:
                    selectBook();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    deleteBook();
                    break;
            }
            System.out.println("1-你的原耽圈    2-添加原耽成员    3-删除原耽成员    4-退出    请选择(1-4):");
            num= input.nextInt();
            if (num == 4) {
                System.out.println("程序结束");
            }
        }
    }
    public static void selectBook(){
        String sql = "SELECT * FROM bl_book";

        try {
            connection=jdbcUtiles.getConnection();
            preparedStatement=connection.prepareStatement(sql);
            rs=preparedStatement.executeQuery();
            //专门用于执行 SELECT 语句。它会将 SQL 语句发送到数据库，并等待数据库返回查询结果

            System.out.println("===== 原耽书籍列表 =====");
            System.out.println("Top角色   |   Bottom角色    |   书名");
            System.out.println("-------------------------------------");

            while(rs.next()){
                String topName=rs.getString("TopName");
                String name2=rs.getString("BottomName");
                String book=rs.getString("book");
                System.out.printf("%-8s | %-10s | %s%n",topName,name2,book);
            }
            if (rs.isBeforeFirst()) {
                System.out.println("查询完毕");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            jdbcUtiles.close(rs, preparedStatement, connection);
        }
    }
    public static void addBook(){
        String sql="insert into bl_book values (?,?,?)";
        System.out.println("请输入top名字：");
        String name1=input.next().trim();
        System.out.println("请输入bottom名字：");
        String name2=input.next().trim();
        System.out.println("请输入书名：");
        String book=input.next().trim();
        try {
            connection=jdbcUtiles.getConnection();
            preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setString(1,name1);
            preparedStatement.setString(2,name2);
            preparedStatement.setString(3,book);
            /*connection=jdbcUtiles.getConnection();
            preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,name1);
            preparedStatement.setString(2,name2);
            preparedStatement.setString(3,book);*/
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            jdbcUtiles.close(null,preparedStatement,connection);
        }
    }
    public static void deleteBook(){
        String sql2="select * from bl_book where book=?";
        String sql1="delete from bl_book where TopName=? and BottomName=?";
        System.out.println("请输入top名字：");
        String name3=input.next().trim();
        System.out.println("请输入bottom名字：");
        String name4=input.next().trim();
        System.out.println("请输入书名：");
        String book1=input.next().trim();

        try{
            connection=jdbcUtiles.getConnection();
            preparedStatement= connection.prepareStatement(sql2);
            preparedStatement.setString(1,book1);
            rs=preparedStatement.executeQuery();
            if (!rs.next()) {
                System.out.println("该书不存在！");
            }else{
                System.out.println("有该书");
            }

            preparedStatement=connection.prepareStatement(sql1);
            preparedStatement.setString(1,name3);
            preparedStatement.setString(2,name4);
            int rows = preparedStatement.executeUpdate();
            if (rows >0) {
                System.out.println("删除成功");
            }else{
                System.out.println("?");
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
