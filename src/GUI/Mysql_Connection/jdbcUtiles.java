package GUI.Mysql_Connection;

import java.sql.*;


public class jdbcUtiles {
    //工具类，连接mysql的连接和关闭
    private static String url="jdbc:mysql://localhost:3306/Connection?useSSL=false&serverTimezone=UTC";
    private static String user="root";
    private static String password="060805";
    private static String driver="com.mysql.jdbc.Driver";
    //连接数据库
    public static Connection getConnection(){

        try {
            System.out.println(user+","+password+","+url+","+driver);
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //关闭相关资源
    public static void close(ResultSet set, PreparedStatement preparedStatement,Connection connection){
//java.sql.SQLNonTransientConnectionException
        try {
            if(set!=null){
                set.close();
            }
            if(preparedStatement!=null){
                preparedStatement.close();
            }
            if(connection!=null){
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

class qwe{
    public static void main(String[] args) {

        jdbcUtiles.getConnection();
    }
}
