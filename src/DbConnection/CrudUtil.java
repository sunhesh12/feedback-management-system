package DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CrudUtil {
    /**Modern Typ
     * @param <T>e
     * @param sql
     * @param params
     * @return 
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException*/
    public static <T> T execute(String sql, Object...params) throws SQLException, ClassNotFoundException{
        Connection connection= DBConnection_1.getInstance().getConnection();
        PreparedStatement stm=connection.prepareStatement(sql);

        for(int i=0;i<params.length;i++){
            stm.setObject(i+1,params[i]);
        }

        if(sql.startsWith("SELECT")){
            return (T)stm.executeQuery();
        }else{
            return (T)((Boolean)(stm.executeUpdate()>0));
        }
    }
}
