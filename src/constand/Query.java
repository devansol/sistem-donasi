/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constand;

/**
 *
 * @author 15997107
 */
public class Query {
    public static final String login = "select a.nama_lengkap, a.status "
            + "from mst_login a where a.username = ? and a.password = ?";
    
    public static final String getAllDataAdmin = "select * from mst_login";
    
    public static final String saveAdmin = "insert into mst_login(username,password,nama_lengkap,status) "
            + "values(?,?,?,?)";
    
    public static final String validasiAdmin = "select * from mst_login where username = ?";
    
    public static final String ubahPassword = "update mst_login set password = ? where username = ?";
}
