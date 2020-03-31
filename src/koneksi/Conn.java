/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 15997107
 */
public class Conn {
    public Connection conn = null;
    public PreparedStatement ps = null;
    public ResultSet rs = null;
    
    public void closeConnection() throws Exception{
        try{
            if(conn != null){
                conn.close();
            }
            if(ps != null){
                ps.close();
            }
            if(rs != null){
                rs.close();
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
