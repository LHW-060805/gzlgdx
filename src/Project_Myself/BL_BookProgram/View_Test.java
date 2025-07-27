package Project_Myself.BL_BookProgram;

import GUI.Mysql_Connection.jdbcUtiles;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class View_Test {
    //后续就不用再开对象
    public static Scanner input = new Scanner(System.in);
//    涉及数据库的连接

    public static void main(String[] args) {
        System.out.println("1-你的原耽圈    2-添加原耽成员    3-删除原耽成员    4-退出    请选择(1-4):");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        while(num!=4){
            switch(num){
                case 1->selectBook();
                case 2->addBook();
                case 3->deleteBook();
            }
            System.out.println("1-你的原耽圈    2-添加原耽成员    3-删除原耽成员    4-退出    请选择(1-4):");
            num= input.nextInt();
            if (num == 4) {
                System.out.println("程序结束");
            }
        }
    }

    public static void selectBook(){
        String sqlSelect="select * from bl_book";
        try(Connection connection=jdbcUtiles.getConnection()){
            try(PreparedStatement preparedStatement= connection.prepareStatement(sqlSelect)){
                try(ResultSet rs=preparedStatement.executeQuery()){
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
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void addBook(){
        String sqlSelect="select book from bl_book where book=?";
        String sqlAdd="insert into bl_book values (?,?,?)";
        System.out.println("请输入top名字：");
        String name1=input.next().trim();
        System.out.println("请输入bottom名字：");
        String name2=input.next().trim();
        System.out.println("请输入书名：");
        String book=input.next().trim();
        try(Connection connection=jdbcUtiles.getConnection()){
            try (PreparedStatement statement = connection.prepareStatement(sqlSelect)) {
                statement.setString(1,book);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        System.out.println("有该书");
                        return;
                    }
                }
            }
            try (PreparedStatement statement  = connection.prepareStatement(sqlAdd)) {
                statement.setString(1,name1);
                statement.setString(2,name2);
                statement.setString(3,book);
                int update = statement.executeUpdate();
                if (update > 0) {
                    System.out.println("添加完毕");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteBook(){
        String sqlSelect="select book from bl_book where book=?";
        String sqlDelete="delete from bl_book where book=?";
        System.out.println("请输入你要删掉的书");
        String inputBook= input.next().trim();
        try(Connection connection=jdbcUtiles.getConnection()){
            try(PreparedStatement preparedStatement= connection.prepareStatement(sqlSelect)){
                preparedStatement.setString(1,inputBook);
                try(ResultSet rs= preparedStatement.executeQuery()){
                    if (!rs.next()) {
                        System.out.println("无该书");
                    }
                }
            }
            try(PreparedStatement preparedStatement1= connection.prepareStatement(sqlDelete)){
                preparedStatement1.setString(1,inputBook);
                int update = preparedStatement1.executeUpdate();
                if (update >0) {
                    System.out.println("已删除");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
