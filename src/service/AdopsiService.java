/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import constand.Query;
import dao.AdopsiDao;
import entity.AdopsiEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import koneksi.Conn;
import koneksi.KoneksiDb;
import static koneksi.KoneksiDb.getConnection;

/**
 *
 * @author Daus
 */
public class AdopsiService extends KoneksiDb {
    
    private AdopsiDao dao = new AdopsiDao();
    
    public String getNoAdopsi() throws Exception {
        Conn connect = new Conn();
        String no_adopsi = "";
        try {
            connect.conn = getConnection();
            no_adopsi = dao.getNoAdopsi(connect);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return no_adopsi;
    }
    
    public Map<String,Object> insertAdopsi(AdopsiEntity param) throws Exception {
        Conn connect = new Conn();
        Map<String,Object> response = new HashMap<>();
        try {
            connect.conn = getConnection();
            connect.conn.setAutoCommit(false);
            
            response = dao.saveAdopsi(param, connect);
            
            if(!(boolean) response.get("status")){
                throw new Exception(response.get("message").toString());
            }else{
                connect.conn.commit();
            }
        } catch (Exception e) {
            connect.conn.rollback();
            e.printStackTrace();
            response.put("message", e.getMessage());
            response.put("alert", false);
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return response;
    }
    
    public List<AdopsiEntity> getAllAdopsi() throws Exception{
        List<AdopsiEntity> response = new ArrayList<>();
        Conn connect = new Conn();
        try {
            connect.conn = getConnection();
            response = dao.getAllAdopsi(connect);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return response;
    }
    
    public Map<String,Object> ubahDataAdopsi(AdopsiEntity param) throws Exception {
        Conn connect = new Conn();
        Map<String,Object> response = new HashMap<>();
        try {
            connect.conn = getConnection();
            connect.conn.setAutoCommit(false);
            
            response = dao.ubahDataAdopsi(param, connect);
            
            if(!(boolean) response.get("status")){
                throw new Exception(response.get("message").toString());
            }else{
                connect.conn.commit();
            }
        } catch (Exception e) {
            connect.conn.rollback();
            e.printStackTrace();
            response.put("message", e.getMessage());
            response.put("alert", false);
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return response;
    }
    
    public AdopsiEntity getDataAdopsiByNoAdopsi(String no_adopsi) throws Exception{
        Conn connect = new Conn();
        AdopsiEntity response = new AdopsiEntity();
        try{
            connect.conn = getConnection();
            response = dao.getDataAdopsiByNoAdopsi(no_adopsi, connect);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return response;
    }
    
    public List<AdopsiEntity> getLaporanAdopsi(String tanggal1, String tanggal2) throws Exception {
        List<AdopsiEntity> list = new ArrayList<>();
        Conn connect = new Conn();
        try{
           connect.conn = getConnection();
           list = dao.getLaporanAdopsi(tanggal1, tanggal2, connect);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return list;
    }
    
    public Map<String,Object> deleteAdopsi(String no_adopsi) throws Exception{
        Map<String, Object>map = new HashMap<String, Object>();
        Conn connect = new Conn();
        try{
            connect.conn = getConnection();
             connect.conn.setAutoCommit(false);
            map = dao.deleteAdopsi(no_adopsi, connect);
            
            if(!(boolean)map.get("status")){
                throw new Exception(map.get("message").toString());
            }else{
                connect.conn.commit();
            }
            
        }catch(Exception e){
            map.put("message", "Data gagal di hapus ! (" + e.getMessage() + ")");
            map.put("status", false);
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
        return map;
    }
}
