package DBConnection;

import java.sql.DriverManager;

//public class Connection {
//    private static Connection connection;
//
//    public static Connection getInstance(){
//        if(connection == null){
//            try {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                connection = (Connection) DriverManager
//                        .getConnection("jdbc:mysql://localhost:3306/","root","root");
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//        return connection;
//    }
//}
  // or create new package like: utils

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionSQL {

    private static final String URL = "jdbc:mysql://localhost:3306/phonedb";
    private static final String USER = "root";
    private static final String PASS = "Joshna@2003";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
