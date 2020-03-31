/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import koneksi.Conn;

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
}
