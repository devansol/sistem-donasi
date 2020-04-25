/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import constand.Query;
import entity.AdopsiEntity;
import entity.DonasiEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import koneksi.Conn;

/**
 *
 * @author Daus
 */
public class AdopsiDao {
    
    public String getNoAdopsi(Conn connect) throws Exception{
        String no_donasi = "";
        SimpleDateFormat bulan = new SimpleDateFormat("MM");
        SimpleDateFormat tahun = new SimpleDateFormat("YYYY");
        Date date = new Date();
        System.out.println(bulan.format(date));
        System.out.println(tahun.format(date));
        try {
            connect.ps = connect.conn.prepareStatement(Query.getKodeAdopsi);
            connect.rs = connect.ps.executeQuery();
            
            if(connect.rs.next()){
                String temp_no_donatur = connect.rs.getString("no_adopsi").substring(2);
                
                String[] split = temp_no_donatur.split("/");
                String an = "" + (Integer.parseInt(split[split.length - 1]) + 1);
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
                no_donasi = "AD/"+bulan.format(date)+"/"+tahun.format(date)+"/"+ nol + an;
            }else{
                no_donasi = "AD/"+bulan.format(date)+"/"+tahun.format(date)+"/0001";
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
                    
        }
        return no_donasi;
    }
    
    public Map<String,Object> saveAdopsi(AdopsiEntity param, Conn connect) throws Exception {
        Map<String,Object> map = new HashMap<>();
        try{
            int count = 0;
            connect.ps = connect.conn.prepareStatement("select 1 from mst_adopsi where kode_anak = ?");
            connect.ps.setString(1, param.getKode_anak());
            connect.rs = connect.ps.executeQuery();
            if(connect.rs.next()){
                map.put("message", "Nama anak denga Kode Anak = " + param.getKode_anak() + " sudah di adopsi !");
                map.put("status", false);
                throw new Exception(map.get("message").toString());
            }else{
                connect.ps = connect.conn.prepareStatement(Query.insertAdopsi);
                connect.ps.setString(1, param.getNo_adopsi());
                connect.ps.setString(2, param.getNama_adopsi());
                connect.ps.setString(3, param.getAlamat());
                connect.ps.setString(4, param.getNo_telp());
                connect.ps.setString(5, param.getPekerjaan());
                connect.ps.setString(6, param.getKode_anak());
                connect.ps.setString(7, param.getKeterangan());
                connect.ps.executeUpdate();
                map.put("message", "Data berhasil di simpan !");
                map.put("status", true);
            }
            
            
            
        }catch(Exception e){
            map.put("message", e.getMessage());
            map.put("status", false);
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
        return map;
    }
    
    public List<AdopsiEntity> getAllAdopsi(Conn connect) throws Exception{
        List<AdopsiEntity> response = new ArrayList<>();
        try{
            connect.ps = connect.conn.prepareStatement(Query.getAllAdopsi);
            connect.rs = connect.ps.executeQuery();
            
            while(connect.rs.next()){
                AdopsiEntity entity = new AdopsiEntity();
                entity.setNo_adopsi(connect.rs.getString(1));
                entity.setNama_adopsi(connect.rs.getString(2));
                entity.setNama_anak(connect.rs.getString(3));
                response.add(entity);
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        return response;
    }
    
    public Map<String,Object> ubahDataAdopsi(AdopsiEntity param, Conn connect) throws Exception {
        Map<String,Object> map = new HashMap<>();
        try{
            connect.ps = connect.conn.prepareStatement(Query.ubahDataAdopsi);
            
            connect.ps.setString(1, param.getNama_adopsi());
            connect.ps.setString(2, param.getAlamat());
            connect.ps.setString(3, param.getNo_telp());
            connect.ps.setString(4, param.getPekerjaan());
            connect.ps.setString(5, param.getKode_anak());
            connect.ps.setString(6, param.getKeterangan());
            connect.ps.setString(7, param.getNo_adopsi());
            connect.ps.executeUpdate();
            map.put("message", "Data berhasil di simpan !");
            map.put("status", true);
        }catch(Exception e){
            map.put("message", e.getMessage());
            map.put("status", false);
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
        return map;
    }
    
    public AdopsiEntity getDataAdopsiByNoAdopsi(String no_adopsi, Conn connect) throws Exception{
        AdopsiEntity response = new AdopsiEntity();
        try{
            connect.ps = connect.conn.prepareStatement(Query.getDataAdopsiByNoAdopsi);
            connect.ps.setString(1, no_adopsi);
            connect.rs = connect.ps.executeQuery();
            
            while(connect.rs.next()){
                response.setNo_adopsi(connect.rs.getString(1));
                response.setNama_adopsi(connect.rs.getString(2));
                response.setAlamat(connect.rs.getString(3));
                response.setNo_telp(connect.rs.getString(4));
                response.setPekerjaan(connect.rs.getString(5));
                response.setKode_anak(connect.rs.getString(6));
                response.setNama_anak(connect.rs.getString(7));
                response.setKeterangan(connect.rs.getString(8));
            }
        }catch(Exception e){
        
            throw new Exception(e.getMessage());
        }
        return response;
    }
    
    public List<AdopsiEntity> getLaporanAdopsi(String tanggal1, String tanggal2, Conn connect) throws Exception {
        List<AdopsiEntity> list = new ArrayList<>();
        try{
            connect.ps = connect.conn.prepareStatement(Query.getLaporanAdopsi);
            connect.ps.setString(1, tanggal1);
            connect.ps.setString(2, tanggal2);
            connect.rs = connect.ps.executeQuery();
            while(connect.rs.next()){
                AdopsiEntity entity = new AdopsiEntity();
                entity.setNo_adopsi(connect.rs.getString(1));
                entity.setNama_adopsi(connect.rs.getString(2));
                entity.setAlamat(connect.rs.getString(3));
                entity.setNo_telp(connect.rs.getString(4));
                entity.setPekerjaan(connect.rs.getString(5));
                entity.setNama_anak(connect.rs.getString(6));
                entity.setKeterangan(connect.rs.getString(7));
                entity.setTanggal_adopsi(connect.rs.getString(8));
                list.add(entity);
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        return list;
    }
}
