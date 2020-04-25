/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author 15997107
 */
public class SessionEntity {
       private static String nama_lengkap;
       private static int status;
       private static String kode_anak;
       private static String no_donasi;
       private static String no_adopsi;
       
       
       

    /**
     * @return the nama_lengkap
     */
    public static String getNama_lengkap() {
        return nama_lengkap;
    }

    /**
     * @param aNama_lengkap the nama_lengkap to set
     */
    public static void setNama_lengkap(String aNama_lengkap) {
        nama_lengkap = aNama_lengkap;
    }

    /**
     * @return the status
     */
    public static int getStatus() {
        return status;
    }

    /**
     * @param aStatus the status to set
     */
    public static void setStatus(int aStatus) {
        status = aStatus;
    }

    /**
     * @return the kode_anak
     */
    public static String getKode_anak() {
        return kode_anak;
    }

    /**
     * @param aKode_anak the kode_anak to set
     */
    public static void setKode_anak(String aKode_anak) {
        kode_anak = aKode_anak;
    }

    /**
     * @return the no_donasi
     */
    public static String getNo_donasi() {
        return no_donasi;
    }

    /**
     * @param aNo_donasi the no_donasi to set
     */
    public static void setNo_donasi(String aNo_donasi) {
        no_donasi = aNo_donasi;
    }

    /**
     * @return the no_adopsi
     */
    public static String getNo_adopsi() {
        return no_adopsi;
    }

    /**
     * @param aNo_adopsi the no_adopsi to set
     */
    public static void setNo_adopsi(String aNo_adopsi) {
        no_adopsi = aNo_adopsi;
    }
       
       
}   
