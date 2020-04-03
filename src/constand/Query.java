/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constand;

/**
 *
 * @author 15997107
 */
public class Query {
    public static final String login = "select a.nama_lengkap, a.status "
            + "from mst_login a where a.username = ? and a.password = ?";
    
    public static final String getAllDataAdmin = "select * from mst_login";
    
    public static final String saveAdmin = "insert into mst_login(username,password,nama_lengkap,status) "
            + "values(?,?,?,?)";
    
    public static final String validasiAdmin = "select * from mst_login where username = ?";
    
    public static final String ubahPassword = "update mst_login set password = ? where username = ?";
    
    public static final String saveAnak = "insert into mst_anak (kode_anak, nama_anak, jenis_kelamin,"
            + "tempat_lahir, tanggal_lahir, tanggal_masuk_panti,pendidikan_terakhir, nama_orangtua_anak,"
            + "keterangan) values (?,?,?,?,?,?,?,?,?)";
    
    public static final String getAllDataAnak = "select kode_anak, nama_anak from mst_anak";
    
    public static final String getDataAnakByKode = "select * from mst_anak where kode_anak = ?";

    public static final String getDataAnakByKodeOrNama = "select kode_anak, nama_anak from mst_anak where (kode_anak = ?) or (nama_anak like ?)";
    
    public static final String ubahDataAnak = "UPDATE mst_anak \n" +
            "SET nama_anak = ?," +
            "jenis_kelamin = ?," +
            "tempat_lahir = ?," +
            "tanggal_lahir = ?," +
            "tanggal_masuk_panti = ?," +
            "pendidikan_terakhir = ?," +
            "nama_orangtua_anak = ?," +
            "keterangan = ? " +
            "WHERE kode_anak = ?";
    
    public static final String hapusDataAnak = "delete from mst_anak where kode_anak = ?";
    
    public static final String getKodeNoDonatur = "select no_donasi from mst_donasi ORDER BY no_donasi";
}
