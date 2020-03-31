/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 15997107
 */
public class KoneksiDb {
   
    public static java.sql.Connection getConnection() throws SQLException{
        Connection conn = null;
        try{
            String url = "jdbc:mysql://localhost/sistemdonasi";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            
        }catch(ClassNotFoundException | SQLException e){
            throw new SQLException(e.getMessage());
        }
        return conn;
    }
}
