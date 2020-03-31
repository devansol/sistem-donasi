/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.AnakDao;
import entity.AnakEntity;
import java.util.HashMap;
import java.util.Map;
import koneksi.Conn;
import koneksi.KoneksiDb;

/**
 *
 * @author 15997107
 */
public class AnakService extends KoneksiDb {
    
    AnakDao dao = new AnakDao();
    
    public String kodeAnak() throws Exception{
        String kode_anak = "";
        Conn connect = new Conn();
        try{
            connect.conn = getConnection();
            kode_anak = dao.kodeAnak(connect);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return kode_anak;
    }
    
    public Map<String,Object> saveAnak(AnakEntity entity) throws Exception{
        Map<String,Object> saveAnak = new HashMap<>();
        Conn connect = new Conn();
        try{
            connect.conn = getConnection();
            connect.conn.setAutoCommit(false);
         
            saveAnak = dao.saveAnak(entity, connect);
            
            if(!(boolean)saveAnak.get("status")){
                throw new Exception(saveAnak.get("message").toString());
            }else{
                connect.conn.commit();
            }
        }catch(Exception e){
            connect.conn.rollback();
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return saveAnak;
    }
}
