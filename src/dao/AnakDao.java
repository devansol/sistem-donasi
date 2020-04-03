/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import constand.Query;
import entity.AnakEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import koneksi.Conn;
import static koneksi.KoneksiDb.getConnection;

/**
 *
 * @author 15997107
 */
public class AnakDao {
    
    public String kodeAnak(Conn connect) throws Exception {
        String no_siswa = "";
        try {
            String query = "select kode_anak from mst_anak ORDER BY kode_anak desc";
            
            connect.ps = connect.conn.prepareStatement(query);
            connect.rs = connect.ps.executeQuery();
            
            if(connect.rs.next()){
                String temp_siswa = connect.rs.getString("kode_anak").substring(2);
                String an = "" + (Integer.parseInt(temp_siswa) + 1);
                String nol = "";
                if(an.length() == 1){
                    nol = "000";
                }else if (an.length() == 2){
                    nol = "00";
                }else if (an.length() == 3){
                    nol = "0";
                }else if(an.length() == 4) {
                    nol = "";
                }
                no_siswa = "KA" + nol + an;
            }else{
                no_siswa = "KA0001";
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
        return no_siswa;
    }
    
    public Map<String,Object> saveAnak(AnakEntity entity, Conn connect) throws Exception{
        Map<String,Object> map = new HashMap<>();
        try{
            connect.ps = connect.conn.prepareStatement(Query.saveAnak);
            connect.ps.setString(1, entity.getKode_anak());
            connect.ps.setString(2, entity.getNama_anak());
            connect.ps.setString(3, entity.getJenis_kelamin().trim());
            connect.ps.setString(4, entity.getTempat_lahir());
            connect.ps.setString(5, entity.getTanggal_lahir());
            connect.ps.setString(6, entity.getTanggal_masuk_panti());
            connect.ps.setString(7, entity.getPendidikan_terakhir());
            connect.ps.setString(8, entity.getNama_orangtua_anak());
            connect.ps.setString(9, entity.getKeterangan());
            
            connect.ps.executeUpdate();
            
            map.put("message", "Data berhasil di simpan");
            map.put("status", true);
        }catch(Exception e){
            map.put("message", e.getMessage());
            map.put("status", false);
            throw new Exception(e.getMessage());
        }
        return map;
    }
    
    public List<AnakEntity> getDataAnak(Conn connect) throws Exception {
        List<AnakEntity> list = new ArrayList<>();
        try{
            connect.ps = connect.conn.prepareStatement(Query.getAllDataAnak);
            connect.rs = connect.ps.executeQuery();
            
            while(connect.rs.next()){
                AnakEntity entity = new AnakEntity();
                entity.setKode_anak(connect.rs.getString(1));
                entity.setNama_anak(connect.rs.getString(2));
              
                list.add(entity);
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        return list;
    }
    
    public AnakEntity getAnakByKode(String kode_anak, Conn connect) throws Exception{
        AnakEntity entity = new AnakEntity();
        try {
            connect.ps = connect.conn.prepareStatement(Query.getDataAnakByKode);
            connect.ps.setString(1, kode_anak);
            connect.rs = connect.ps.executeQuery();
            
            while(connect.rs.next()){
                entity.setKode_anak(connect.rs.getString(2));
                entity.setNama_anak(connect.rs.getString(3));
                entity.setJenis_kelamin(connect.rs.getString(4));
                entity.setTempat_lahir(connect.rs.getString(5));
                entity.setTanggal_lahir(connect.rs.getString(6));
                entity.setTanggal_masuk_panti(connect.rs.getString(7));
                entity.setPendidikan_terakhir(connect.rs.getString(8));
                entity.setNama_orangtua_anak(connect.rs.getString(9));
                entity.setKeterangan(connect.rs.getString(10));
            } 
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return entity;
    }
    
    public List<AnakEntity> getAnakByKodeOrNama(String param, Conn connect) throws Exception{
        List<AnakEntity> list  = new ArrayList<>();
        String params = "%" + param + "%";
        try {
            connect.ps = connect.conn.prepareStatement(Query.getDataAnakByKodeOrNama);
            connect.ps.setString(1, params);
            connect.ps.setString(2, params);
            connect.rs = connect.ps.executeQuery();
            
            while(connect.rs.next()){
                AnakEntity entity = new AnakEntity();
                entity.setKode_anak(connect.rs.getString(1));
                entity.setNama_anak(connect.rs.getString(2));
                list.add(entity);
            } 
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return list;
    }
    
    public Map<String,Object> ubahDataAnak(AnakEntity param , Conn connect) throws Exception{
        Map<String,Object> response = new HashMap<>();
        try {
            connect.ps = connect.conn.prepareStatement(Query.ubahDataAnak);
            connect.ps.setString(1, param.getNama_anak());
            connect.ps.setString(2, param.getJenis_kelamin().trim());
            connect.ps.setString(3, param.getTempat_lahir());
            connect.ps.setString(4, param.getTanggal_lahir());
            connect.ps.setString(5, param.getTanggal_masuk_panti());
            connect.ps.setString(6, param.getPendidikan_terakhir());
            connect.ps.setString(7, param.getNama_orangtua_anak());
            connect.ps.setString(8, param.getKeterangan());
            connect.ps.setString(9, param.getKode_anak());
            connect.ps.executeUpdate();
            response.put("message", "Data berhasil di ubah");
            response.put("status", true);
        } catch (Exception e) {
            response.put("message", e.getMessage());
            response.put("status", false);
            throw new Exception(e.getMessage());
        }
        return response;
    }
    
    public Map<String,Object> hapusDataAnak(String kode_anak, Conn connect) throws Exception{
        Map<String,Object> response = new HashMap<>();
        try{
            connect.ps = connect.conn.prepareStatement(Query.hapusDataAnak);
            connect.ps.setString(1, kode_anak);
            connect.ps.executeUpdate();
            response.put("message", "Data berhasil di hapus !");
            response.put("status", true);
        }catch(Exception e){
            response.put("message", e.getMessage());
            response.put("status", false);
            throw new Exception(e.getMessage());
        }
        return response;
    }
}