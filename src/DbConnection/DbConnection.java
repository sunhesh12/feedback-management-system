/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DbConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection dbConnection;

    private final Connection connection;

    private DbConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FMS","root","wakudabarnp123");
    }

    public static DbConnection getInstance() throws SQLException, ClassNotFoundException {
        /*if(dbConnection==null){
            dbConnection=new DBConnection();
        }
        return dbConnection;*/
        return  (dbConnection==null)?dbConnection=new DbConnection() :dbConnection;
    }

    public Connection getConnection(){
        return  connection;
    }
}
