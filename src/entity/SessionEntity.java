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
       
       
}   
