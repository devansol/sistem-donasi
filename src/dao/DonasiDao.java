/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import constand.Query;
import java.text.SimpleDateFormat;
import java.util.Date;
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
                String temp_no_donatur = connect.rs.getString("no_donatur").substring(2);
                String an = "" + (Integer.parseInt(temp_no_donatur) + 1);
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
                no_donasi = "KA" + nol + an;
            }else{
                no_donasi = "DN/"+bulan.format(date)+"/"+tahun.format(date)+"/0001";
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
                    
        }
        return no_donasi;
    }
}
