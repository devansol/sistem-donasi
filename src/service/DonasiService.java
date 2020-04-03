/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.DonasiDao;
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
}
