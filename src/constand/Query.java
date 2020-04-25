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

    public static final String insertDonasi = "insert into mst_donasi"
            + "(no_donasi,nama_donatur,alamat_donatur,jumlah_donasi,no_telepon,"
            + "bukti_pembayaran,keterangan, create_date) values (?,?,?,?,?,?,?,sysdate())";
    
    public static final String getAllDataDonasi = "select no_donasi, nama_donatur, jumlah_donasi, "
            + "(select sum(jumlah_donasi) from mst_donasi) as total_donasi from mst_donasi";
    
    public static final String getDataDonasiByNoDonasi = "select * from mst_donasi where no_donasi = ?";

    public static final String PATH_IMAGE = "img/";
    
    public static final String hapusDataDonasi = "delete from mst_donasi where no_donasi = ?";
    
    public static final String ubahDatadonasi = "update mst_donasi "
            + "set nama_donatur = ? ,"
            + "alamat_donatur = ? ,"
            + "jumlah_donasi = ?,"
            + "no_telepon = ?,"
            + "bukti_pembayaran = ?,"
            + "keterangan = ? "
            + "where no_donasi = ?";
    
    public static final String getKodeAdopsi = "select no_adopsi from mst_adopsi ORDER BY no_adopsi";

    public static final String insertAdopsi = "insert into mst_adopsi(no_adopsi, "
            + "nama_adopsi, alamat, no_telp, pekerjaan, kode_anak, keterangan, create_date) "
            + "values(?,?,?,?,?,?,?,sysdate())";
    
    public static final String getAllAdopsi = "select a.no_adopsi, a.nama_adopsi, b.nama_anak from mst_adopsi a, mst_anak b "
            + "where a.kode_anak = b.kode_anak";
    
    public static final String ubahDataAdopsi = "update mst_adopsi set "
            + "nama_adopsi = ?,"
            + "alamat = ?,"
            + "no_telp = ?,"
            + "pekerjaan = ?,"
            + "kode_anak = ?,"
            + "keteranga = ? "
            + "where no_adopsi = ?";
    
    public static String getDataAdopsiByNoAdopsi = "select a.no_adopsi, a.nama_adopsi, "
            + "a.alamat, a.no_telp, a.pekerjaan, a.kode_anak, b.nama_anak, a.keterangan from mst_adopsi a, mst_anak b "
            + "where a.kode_anak = b.kode_anak and no_adopsi = ?";
    
    public static final String getLaporanDonasi = "select no_donasi, nama_donatur,jumlah_donasi, create_date, "
            + "(select sum(jumlah_donasi) from mst_donasi) as total_donasi "
            + "from mst_donasi where create_date BETWEEN date(?) and date(?)";
    
    public static final String getLaporanAdopsi = "SELECT\n" +
"	a.no_adopsi,\n" +
"	a.nama_adopsi,\n" +
"	a.alamat,\n" +
"	a.no_telp,\n" +
"	a.pekerjaan,\n" +
"	b.nama_anak,\n" +
"	a.keterangan,\n" +
"	a.create_date AS tanggal_adopsi \n" +
"FROM\n" +
"	mst_adopsi a,\n" +
"	mst_anak b \n" +
"WHERE\n" +
"	a.kode_anak = b.kode_anak and create_date BETWEEN date(?) and date(?)";
}
