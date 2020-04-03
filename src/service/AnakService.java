/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import constand.Query;
import dao.AnakDao;
import entity.AnakEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    
    public List<AnakEntity> getDataAnak() throws Exception{
        List<AnakEntity> list = new ArrayList<>();
        Conn connect = new Conn();
        try{
            connect.conn = getConnection();
            list = dao.getDataAnak(connect);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return list;       
    }
    
    public AnakEntity getAnakByKode(String kode_anak) throws Exception{
        AnakEntity entity = new AnakEntity();
        Conn connect = new Conn();
        try{
            connect.conn = getConnection();
            entity = dao.getAnakByKode(kode_anak, connect);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return entity; 
    }
    
    public List<AnakEntity> getDataAnakByKodeOrNama(String param) throws Exception{
        List<AnakEntity> list = new ArrayList<>();
        Conn connect = new Conn();
        try{
            connect.conn = getConnection();
            list = dao.getAnakByKodeOrNama(param,connect);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return list;       
    }
    
    public Map<String,Object> ubahDataAnak(AnakEntity param) throws Exception{
        Map<String,Object> response = new HashMap<>();
        Conn connect = new Conn();
        try {
            connect.conn = getConnection();
            connect.conn.setAutoCommit(false);
            response = dao.ubahDataAnak(param, connect);
            
            if(!(boolean)response.get("status")){
                throw new Exception(response.get("message").toString());
            }else{
                connect.conn.commit();
            }
        } catch (Exception e) {
            connect.conn.rollback();
            response.put("message", e.getMessage());
            response.put("status", false);
            throw new Exception(e.getMessage());
        }
        return response;
    }
    
    public Map<String,Object> hapusDataAnak(String kode_anak) throws Exception{
        Map<String,Object> response = new HashMap<>();
        Conn connect = new Conn();
        try {
            connect.conn = getConnection();
            connect.conn.setAutoCommit(false);
            response = dao.hapusDataAnak(kode_anak, connect);
            
            if(!(boolean)response.get("status")){
                throw new Exception(response.get("message").toString());
            }else{
                connect.conn.commit();
            }
        } catch (Exception e) {
            connect.conn.rollback();
            response.put("message", e.getMessage());
            response.put("status", false);
            throw new Exception(e.getMessage());
        }
        return response;
    }
    
}
