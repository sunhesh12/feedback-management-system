package DbConnection;

//Singleton design pattern --> 1 object ekak share karanawa users la godak athare  -->(Share an object through many users)

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection_1 {
    private static DBConnection_1 dbConnection;

    private final Connection connection;

    private DBConnection_1() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/FMS","root","wakudabarnp123");
    }

    /**
     *
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static DBConnection_1 getInstance() throws SQLException, ClassNotFoundException {
        /*if(dbConnection==null){
            dbConnection=new DBConnection();
        }
        return dbConnection;*/
        return  (dbConnection==null)?dbConnection=new DBConnection_1() :dbConnection;
    }

    public Connection getConnection(){
        return  connection;
    }
}
