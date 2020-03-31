/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author 15997107
 */
public class AnakEntity implements Serializable {
    
    private String kode_anak;
    private String nama_anak;
    private String jenis_kelamin;
    private String tempat_lahir;
    private String tanggal_lahir;
    private String tanggal_masuk_panti;
    private String pendidikan_terakhir;
    private String nama_orangtua_anak;
    private String keterangan;

    /**
     * @return the kode_anak
     */
    public String getKode_anak() {
        return kode_anak;
    }

    /**
     * @param kode_anak the kode_anak to set
     */
    public void setKode_anak(String kode_anak) {
        this.kode_anak = kode_anak;
    }

    /**
     * @return the nama_anak
     */
    public String getNama_anak() {
        return nama_anak;
    }

    /**
     * @param nama_anak the nama_anak to set
     */
    public void setNama_anak(String nama_anak) {
        this.nama_anak = nama_anak;
    }

    /**
     * @return the jenis_kelamin
     */
    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    /**
     * @param jenis_kelamin the jenis_kelamin to set
     */
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    /**
     * @return the tempat_lahir
     */
    public String getTempat_lahir() {
        return tempat_lahir;
    }

    /**
     * @param tempat_lahir the tempat_lahir to set
     */
    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }

    /**
     * @return the tanggal_lahir
     */
    public String getTanggal_lahir() {
        return tanggal_lahir;
    }

    /**
     * @param tanggal_lahir the tanggal_lahir to set
     */
    public void setTanggal_lahir(String tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    /**
     * @return the tanggal_masuk_panti
     */
    public String getTanggal_masuk_panti() {
        return tanggal_masuk_panti;
    }

    /**
     * @param tanggal_masuk_panti the tanggal_masuk_panti to set
     */
    public void setTanggal_masuk_panti(String tanggal_masuk_panti) {
        this.tanggal_masuk_panti = tanggal_masuk_panti;
    }

    /**
     * @return the pendidikan_terakhir
     */
    public String getPendidikan_terakhir() {
        return pendidikan_terakhir;
    }

    /**
     * @param pendidikan_terakhir the pendidikan_terakhir to set
     */
    public void setPendidikan_terakhir(String pendidikan_terakhir) {
        this.pendidikan_terakhir = pendidikan_terakhir;
    }

    /**
     * @return the nama_orangtua_anak
     */
    public String getNama_orangtua_anak() {
        return nama_orangtua_anak;
    }

    /**
     * @param nama_orangtua_anak the nama_orangtua_anak to set
     */
    public void setNama_orangtua_anak(String nama_orangtua_anak) {
        this.nama_orangtua_anak = nama_orangtua_anak;
    }

    /**
     * @return the keterangan
     */
    public String getKeterangan() {
        return keterangan;
    }

    /**
     * @param keterangan the keterangan to set
     */
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    
}
