/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import constand.Query;
import dao.DonasiDao;
import entity.DonasiEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import koneksi.Conn;
import koneksi.KoneksiDb;

/**
 *
 * @author Daus
 */
public class DonasiService extends KoneksiDb{
    private final DonasiDao dao = new DonasiDao();
    
    public String getNoDonasi() throws Exception{
        String no_donasi = "";
        Conn connect = new Conn();
        try{
            connect.conn = getConnection();
            no_donasi = dao.getNoDonasi(connect);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return no_donasi;
    }
    
    public Map<String,Object> saveDonasi(DonasiEntity param) throws Exception{
        Map<String,Object> response = new HashMap<>();
        Conn connect = new Conn();
        try{
            connect.conn = getConnection();
            connect.conn.setAutoCommit(false);
            response = dao.insertDonasi(param,connect);
            
            if(!(boolean)response.get("status")){
                throw new Exception(response.get("message").toString());
            }else{
                connect.conn.commit();
            }
        }catch(Exception e){
            connect.conn.rollback();
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return response;
    }
    
    public List<DonasiEntity> getAllDataDonasi() throws Exception{
        List<DonasiEntity> response = new ArrayList<>();
        Conn connect = new Conn();
        try{
           connect.conn = getConnection();
           response = dao.getAllDataDonasi(connect);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return response;
    }
    
    public DonasiEntity getDataDonasiByNoDonasi(String no_donasi) throws Exception{
        DonasiEntity response = new DonasiEntity();
        Conn connect = new Conn();
        try {
            connect.conn = getConnection();
            response = dao.getDataDonasiByNoDonasi(no_donasi, connect);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return response;
    }
    
    public Map<String,Object> deleteDonasi(String no_donasi) throws Exception{
        Map<String,Object> response = new HashMap<>();
        Conn connect = new Conn();
        try{
            connect.conn = getConnection();
            connect.conn.setAutoCommit(false);
            response = dao.deleteDonasi(no_donasi, connect);
            
            if(!(boolean)response.get("status")){
                throw new Exception(response.get("message").toString());
            }else{
                connect.conn.commit();
            }
        }catch(Exception e){
            response.put("message", e.getMessage());
            response.put("status", false);
            throw new Exception(e.getMessage());
        }
        return response;
    }
    
    public Map<String,Object> ubahDataDonasi(DonasiEntity param) throws Exception{
        Map<String,Object> response = new HashMap<>();
        Conn connect = new Conn();
        try{
            connect.conn = getConnection();
            connect.conn.setAutoCommit(false);
            response = dao.ubahDataDonasi(param,connect);
            
            if(!(boolean)response.get("status")){
                throw new Exception(response.get("message").toString());
            }else{
                connect.conn.commit();
            }
        }catch(Exception e){
            connect.conn.rollback();
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return response;
    }
    
    public List<DonasiEntity> getLaporanDonasi(String tanggal1, String tanggal2) throws Exception {
        List<DonasiEntity> list = new ArrayList<>();
        Conn connect = new Conn();
        try{
           connect.conn = getConnection();
           list = dao.getLaporanDonasi(tanggal1, tanggal2, connect);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }finally{
            connect.closeConnection();
        }
        return list;
    }
}
