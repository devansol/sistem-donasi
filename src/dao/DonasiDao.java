/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import constand.Query;
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
public class DonasiDao {
    
    public String getNoDonasi(Conn connect) throws Exception{
        String no_donasi = "";
        SimpleDateFormat bulan = new SimpleDateFormat("MM");
        SimpleDateFormat tahun = new SimpleDateFormat("YYYY");
        Date date = new Date();
        System.out.println(bulan.format(date));
        System.out.println(tahun.format(date));
        try {
            connect.ps = connect.conn.prepareStatement(Query.getKodeNoDonatur);
            connect.rs = connect.ps.executeQuery();
            
            if(connect.rs.next()){
                String temp_no_donatur = connect.rs.getString("no_donasi").substring(2);
                
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
                no_donasi = "DN/"+bulan.format(date)+"/"+tahun.format(date)+"/"+ nol + an;
            }else{
                no_donasi = "DN/"+bulan.format(date)+"/"+tahun.format(date)+"/0001";
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
                    
        }
        return no_donasi;
    }
    
    public Map<String,Object> insertDonasi(DonasiEntity param, Conn connect) throws Exception{
        Map<String,Object> response = new HashMap<>();
        try{
            connect.ps = connect.conn.prepareStatement(Query.insertDonasi);
            connect.ps.setString(1, param.getNo_donasi());
            connect.ps.setString(2, param.getNama_donatur());
            connect.ps.setString(3, param.getAlamat_donatur());
            connect.ps.setDouble(4, param.getJumlah_donasi());
            connect.ps.setString(5, param.getNo_telp());
            connect.ps.setString(6, param.getBukti_pembayaran());
            connect.ps.setString(7, param.getKeterangan());
            connect.ps.executeUpdate();
            response.put("message", "Data donasi berhasil di simpan !");
            response.put("status", true);
        }catch(Exception e){
            response.put("message", e.getMessage());
            response.put("status", false);
            throw new Exception(e.getMessage());
        }
        return response;
    }
    
    public List<DonasiEntity> getAllDataDonasi(Conn connect) throws Exception{
        List<DonasiEntity> response = new ArrayList<>();
        try{
            connect.ps = connect.conn.prepareStatement(Query.getAllDataDonasi);
            connect.rs = connect.ps.executeQuery();
            
            while(connect.rs.next()){
                DonasiEntity entity = new DonasiEntity();
                entity.setNo_donasi(connect.rs.getString(1));
                entity.setNama_donatur(connect.rs.getString(2));
                entity.setJumlah_donasi(connect.rs.getDouble(3));
                entity.setTotal_donasi(connect.rs.getDouble(4));
                response.add(entity);
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        return response;
    }
    
    public DonasiEntity getDataDonasiByNoDonasi(String no_donasi, Conn connect) throws Exception{
        DonasiEntity response = new DonasiEntity();
        try {
            connect.ps = connect.conn.prepareStatement(Query.getDataDonasiByNoDonasi);
            connect.ps.setString(1, no_donasi);
            connect.rs = connect.ps.executeQuery();
            if(connect.rs.next()){
                response.setNo_donasi(no_donasi);
                response.setNama_donatur(connect.rs.getString(3));
                response.setAlamat_donatur(connect.rs.getString(4));
                response.setJumlah_donasi(connect.rs.getDouble(5));
                response.setNo_telp(connect.rs.getString(6));
                response.setBukti_pembayaran(connect.rs.getString(7));
                response.setKeterangan(connect.rs.getString(8));
            }else{
                throw new Exception("Data tidak di temukan !");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
        return response;
    }
    
    public Map<String,Object> deleteDonasi(String no_donasi, Conn connect) throws Exception{
        Map<String,Object> response = new HashMap<>();
        try{
            connect.ps = connect.conn.prepareStatement(Query.hapusDataDonasi);
            connect.ps.setString(1, no_donasi);
          
            connect.ps.executeUpdate();
            response.put("message", "Data donasi berhasil di hapus !");
            response.put("status", true);
        }catch(Exception e){
            response.put("message", e.getMessage());
            response.put("status", false);
            throw new Exception(e.getMessage());
        }
        return response;
    }
    
    public Map<String,Object> ubahDataDonasi(DonasiEntity param , Conn connect) throws Exception {
        Map<String,Object> response  = new HashMap<String, Object>();
        try{
            connect.ps = connect.conn.prepareStatement(Query.ubahDatadonasi);
            
            connect.ps.setString(1, param.getNama_donatur());
            connect.ps.setString(2, param.getAlamat_donatur());
            connect.ps.setDouble(3, param.getJumlah_donasi());
            connect.ps.setString(4, param.getNo_telp());
            connect.ps.setString(5, param.getBukti_pembayaran());
            connect.ps.setString(6, param.getKeterangan());
             connect.ps.setString(7, param.getNo_donasi());
            connect.ps.executeUpdate();
            response.put("message", "Data donasi berhasil di ubah !");
            response.put("status", true);
        }catch(Exception e){
             response.put("message", e.getMessage());
            response.put("status", false);
            throw new Exception(e.getMessage());
        }
        return response;
    }
    
    public List<DonasiEntity> getLaporanDonasi(String tanggal1, String tanggal2, Conn connect) throws Exception {
        List<DonasiEntity> list = new ArrayList<>();
        try{
            connect.ps = connect.conn.prepareStatement(Query.getLaporanDonasi);
            connect.ps.setString(1, tanggal1);
            connect.ps.setString(2, tanggal2);
            connect.rs = connect.ps.executeQuery();
            while(connect.rs.next()){
                DonasiEntity entity = new DonasiEntity();
                entity.setNo_donasi(connect.rs.getString(1));
                entity.setNama_donatur(connect.rs.getString(2));
                entity.setJumlah_donasi(connect.rs.getDouble(3));
                entity.setTanggal_donasi(connect.rs.getString(4));
                entity.setTotal_donasi(connect.rs.getDouble(5));
                list.add(entity);
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
        return list;
    }
}
