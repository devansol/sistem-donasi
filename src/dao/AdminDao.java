/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import constand.Query;
import entity.AdminEntity;
import java.util.ArrayList;
import java.util.List;
import koneksi.Conn;

/**
 *
 * @author 15997107
 */
public class AdminDao {
    
    public AdminEntity login(AdminEntity param, Conn connection) throws Exception{
        AdminEntity login = new AdminEntity();
        login.setNama_lengkap("");
        login.setStatus(0);
        try {
            connection.ps = connection.conn.prepareStatement(Query.login);
            connection.ps.setString(1, param.getUsername());
            connection.ps.setString(2, param.getPassword());
            connection.rs = connection.ps.executeQuery();
            
            while(connection.rs.next()){
                login.setNama_lengkap(connection.rs.getString(1));
                login.setStatus(connection.rs.getInt(2));
            }

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return login;
    }
    
    public List<AdminEntity> getDataAdmin(Conn connection) throws Exception{
        List<AdminEntity> list = new ArrayList<AdminEntity>();
        try{
            connection.ps = connection.conn.prepareStatement(Query.getAllDataAdmin);
            connection.rs = connection.ps.executeQuery();
            
            while(connection.rs.next()){
                AdminEntity entity = new AdminEntity();
                entity.setUsername(connection.rs.getString("username"));
                entity.setNama_lengkap(connection.rs.getString("nama_lengkap"));
                entity.setStatus(connection.rs.getInt("status"));
                list.add(entity);
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        return list;
    }
    
    public boolean saveAdmin(AdminEntity param, Conn connect) throws Exception{
        boolean save = false;
        try{
            connect.ps = connect.conn.prepareStatement(Query.saveAdmin);
            connect.ps.setString(1, param.getUsername());
            connect.ps.setString(2, param.getPassword());
            connect.ps.setString(3, param.getNama_lengkap());
            connect.ps.setInt(4, param.getStatus());
            
            connect.ps.executeUpdate();
            save = true;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        
        return save;
    }
    
    public boolean validasiAdmin(String username, Conn connect) throws Exception {
        boolean validasi = false;
        try{
            connect.ps = connect.conn.prepareStatement(Query.validasiAdmin);
            connect.ps.setString(1, username);
            connect.rs = connect.ps.executeQuery();
            
            if(connect.rs.next()){
               validasi = true;
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        return validasi;
    }
    
    public AdminEntity getDataAdminByUsername(String username, Conn connect) throws Exception{
        AdminEntity entity = new AdminEntity();
        try{
            connect.ps = connect.conn.prepareStatement(Query.validasiAdmin);
            connect.ps.setString(1, username);
            connect.rs = connect.ps.executeQuery();
            
            if(connect.rs.next()){
               entity.setNama_lengkap(connect.rs.getString("nama_lengkap"));
               entity.setStatus(connect.rs.getInt("status"));
               entity.setPassword(connect.rs.getString("password"));
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        return entity;
    }
    
    public boolean ubahPassword(AdminEntity param, Conn connect) throws Exception{
        boolean update = false;
        try{
            connect.ps = connect.conn.prepareStatement(Query.ubahPassword);
            connect.ps.setString(1, param.getPassword());
            connect.ps.setString(2, param.getUsername());
            connect.ps.executeUpdate();
            update = true;
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        return update;
    }
}
