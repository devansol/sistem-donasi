/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import constand.Query;
import dao.AdminDao;
import entity.AdminEntity;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import koneksi.Conn;

/**
 *
 * @author 15997107
 */
public class AdminService extends koneksi.KoneksiDb{
    
    AdminDao adminDao = new AdminDao();
    
    public AdminEntity login(AdminEntity data) throws Exception{
        Conn connection = new Conn();
        AdminEntity login = new AdminEntity();
        try{
            connection.conn = getConnection();
            login =  adminDao.login(data, connection);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            connection.closeConnection();
        }
        return login;
    }
    
    public List<AdminEntity> getDataAdmin() throws Exception{
        List<AdminEntity> list = new ArrayList<>();
        Conn connect = new Conn();
        try{
            connect.conn = getConnection();
            list = adminDao.getDataAdmin(connect);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return list;
    }
    
    public boolean saveAdmin(AdminEntity param) throws Exception{
        Conn connect = new Conn();
        boolean save = false;
        try {
            connect.conn = getConnection();
            connect.conn.setAutoCommit(false);
            
            boolean validasi = adminDao.validasiAdmin(param.getUsername(), connect);
            
            if(validasi){
                throw new Exception("Username sudah di gunakan !");
            }else{
                save = adminDao.saveAdmin(param, connect);
                connect.conn.commit();
            }
        } catch (Exception e) {
            connect.conn.rollback();
            throw new Exception(e.getMessage());
        }finally{
           connect.closeConnection();
        }
        return save;
    }
    
    public AdminEntity getDataAdminByUsername(String username) throws Exception{
        AdminEntity entity = new AdminEntity();
        Conn connect = new Conn();
        try{
            connect.conn = getConnection();
            entity = adminDao.getDataAdminByUsername(username, connect);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return entity;
    }
    
    public boolean ubahPassword(AdminEntity param) throws Exception {
        boolean update = false;
        Conn connect = new Conn();
        try{
            connect.conn = getConnection();
            connect.conn.setAutoCommit(false);
            update = adminDao.ubahPassword(param, connect);
            connect.conn.commit();
        }catch(Exception e){
            connect.conn.rollback();
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return update;
    }
}
