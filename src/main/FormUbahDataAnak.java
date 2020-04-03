/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.AnakEntity;
import entity.SessionEntity;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import service.AnakService;

/**
 *
 * @author Daus
 */
public class FormUbahDataAnak extends javax.swing.JFrame {

    /**
     * Creates new form FormUbahDataAnak
     */
    private AnakService service = new AnakService();
    public FormUbahDataAnak() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.tanggalSekarang();
        menuLogout.setText("User Login : " + SessionEntity.getNama_lengkap());
        namaAnak.requestFocus();
        this.loadGetDataAnakByKode();
        kodeAnak.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pendidikanTerakhir = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        keterangan = new javax.swing.JTextArea();
        simpan = new javax.swing.JButton();
        tanggalLahir = new com.toedter.calendar.JDateChooser();
        tanggalMasukPanti = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        orangTuaAnak = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        kodeAnak = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        namaAnak = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tempatLahir = new javax.swing.JTextField();
        jenisKelamin = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        date3 = new javax.swing.JLabel();
        date4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuKeluar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pendidikanTerakhir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Pilih--", "SD", "SMP", "SMA", "TIDAK SEKOLAH" }));

        keterangan.setColumns(20);
        keterangan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        keterangan.setRows(5);
        jScrollPane1.setViewportView(keterangan);

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        tanggalLahir.setDateFormatString("yyyy-MM-dd");

        tanggalMasukPanti.setDateFormatString("yyyy-MM-dd");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Nama Orang Tua");

        orangTuaAnak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangTuaAnakActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Kode Anak");

        kodeAnak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeAnakActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama Anak");

        namaAnak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaAnakActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Tempat Lahir");

        tempatLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempatLahirActionPerformed(evt);
            }
        });

        jenisKelamin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jenisKelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Pilih--", "L - Laki-Laki", "P - Perempuan" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Tanggal Lahir");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Tanggak Masuk Panti");

        date1.setText("Tanggal");

        date2.setText(":");

        date3.setText("Waktu");

        date4.setText(":");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Form Tambah Anak");

        date.setText("Tanggal");

        time.setText("Waktu");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Pendidikan Terakhir");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Keterangan");

        jMenu1.setText("Aksi");

        menuKeluar.setText("Keluar");
        menuKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKeluarActionPerformed(evt);
            }
        });
        jMenu1.add(menuKeluar);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        menuLogout.setText("User Login");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Logout");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuLogout.add(jMenuItem3);

        jMenuBar1.add(menuLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(date1)
                                .addGap(13, 13, 13)
                                .addComponent(date2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(date3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time)
                            .addComponent(date))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1))
                                        .addGap(25, 25, 25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(namaAnak, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kodeAnak, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orangTuaAnak, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(24, 24, 24)
                                .addComponent(tempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(simpan))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(78, 78, 78)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tanggalMasukPanti, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(pendidikanTerakhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tanggalLahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date)
                            .addComponent(date1)
                            .addComponent(date2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date3)
                            .addComponent(date4)
                            .addComponent(time))))
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(kodeAnak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(tanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(tanggalMasukPanti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(pendidikanTerakhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(namaAnak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orangTuaAnak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(simpan)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        try{
            if(namaAnak.getText().equals("")){
                namaAnak.requestFocus();
                throw new Exception("Nama Anak tidak boleh kosong !");
            }else if(jenisKelamin.getSelectedIndex() == 0){
                jenisKelamin.requestFocus();
                throw new Exception("Jenis Kelamin belum di pilih !");
            }else if (tempatLahir.getText().equals("")){
                tempatLahir.requestFocus();
                throw new Exception("Tempat Lahir tidak boleh kosong !");
            }else if(tanggalLahir.getCalendar() == null){
                tanggalLahir.requestFocus();
                throw new Exception("Tanggal Lahir tidak boleh kosong !");
            }else if(tanggalMasukPanti.getCalendar() == null){
                tanggalMasukPanti.requestFocus();
                throw new Exception("Tanggal Masuk Panti tidak boleh kosong !");
            }else if(pendidikanTerakhir.getSelectedIndex() == 0){
                pendidikanTerakhir.requestFocus();
                throw new Exception("Pendidikan terakhir belum di pilih !");
            }else if(orangTuaAnak.getText().equals("")){
                orangTuaAnak.requestFocus();
                throw new Exception("Nama Orang Tua tidak boleh kosong !");
            }else{
                int flag = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menyimpan data ini ?","Peringatan", JOptionPane.YES_NO_OPTION);
                if(flag == 0){

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                    AnakEntity entity = new AnakEntity();

                    entity.setKode_anak(kodeAnak.getText());
                    entity.setNama_anak(namaAnak.getText());

                    String arr_jenis_kelamin[] = jenisKelamin.getSelectedItem().toString().trim().split("-");
                    entity.setJenis_kelamin(arr_jenis_kelamin[0]);
                    entity.setTempat_lahir(tempatLahir.getText());
                    entity.setTanggal_lahir(((JTextField)tanggalLahir.getDateEditor().getUiComponent()).getText());
                    entity.setTanggal_masuk_panti(((JTextField)tanggalMasukPanti.getDateEditor().getUiComponent()).getText());
                    entity.setNama_orangtua_anak(orangTuaAnak.getText());
                    entity.setPendidikan_terakhir(pendidikanTerakhir.getSelectedItem().toString());
                    entity.setKeterangan(keterangan.getText());

                    Map<String,Object> saveAnak = new HashMap<String, Object>();
                    saveAnak = service.ubahDataAnak(entity);

                    if(!(boolean)saveAnak.get("status")){
                        throw new Exception(saveAnak.get("message").toString());
                    }else{
                        JOptionPane.showMessageDialog(null, saveAnak.get("message").toString());
                        this.setVisible(false);
                        FormAnak ds;
                        ds = new FormAnak();
                        ds.setTitle("Form Anak");
                        ds.setVisible(true);
                    }
                }
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_simpanActionPerformed

    private void orangTuaAnakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangTuaAnakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orangTuaAnakActionPerformed

    private void kodeAnakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeAnakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeAnakActionPerformed

    private void namaAnakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaAnakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaAnakActionPerformed

    private void tempatLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempatLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempatLahirActionPerformed

    private void menuKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKeluarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FormAnak ds;
        try {
            ds = new FormAnak();
            ds.setTitle("Form Anak");
            ds.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(FormTambahAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuKeluarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        int flag = JOptionPane.showConfirmDialog(null, "Anda yakin ingin logout ? ", "Peringatan", JOptionPane.YES_NO_OPTION);
        if(flag == 0){
            Index idx = new Index();
            idx.setVisible(true);
            idx.setTitle("Login");
            SessionEntity.setNama_lengkap(null);
            SessionEntity.setStatus(0);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUbahDataAnak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUbahDataAnak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUbahDataAnak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUbahDataAnak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FormUbahDataAnak form = new FormUbahDataAnak();
                    form.setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(FormUbahDataAnak.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    
     public void tanggalSekarang(){     
        Thread clock = new Thread(){
            public void run(){
                for(;;){
                    Calendar cal = new GregorianCalendar();
                    int tanggal = cal.get(Calendar.DAY_OF_MONTH);
                    int bulan1 = cal.get(Calendar.MONTH);
                    int tahun = cal.get(Calendar.YEAR);
                    java.util.Date d = new java.util.Date();
                    String bulan = "MM";
                    String dayweek = "EEEE";
                    String jam = "HH";
                    String menit = "mm";
                    String detik = "ss";
                    SimpleDateFormat sdf = new SimpleDateFormat(dayweek);
                    SimpleDateFormat bln = new SimpleDateFormat(bulan);
                    SimpleDateFormat hr = new SimpleDateFormat(jam);
                    SimpleDateFormat mnt = new SimpleDateFormat(menit);
                    SimpleDateFormat sd = new SimpleDateFormat(detik);
                    
                    String bulan_indo = "";
                    switch(bln.format(d)){
                        case "01" :
                           bulan_indo = "Januari";
                           break;
                        case "02" :
                           bulan_indo = "Februari";
                           break;
                        case "03" :
                           bulan_indo = "Maret";
                           break;
                        case "04" :
                           bulan_indo = "April";
                           break;
                        case "05" :
                           bulan_indo = "Mei";
                           break;
                        case "06" :
                           bulan_indo = "Juni";
                           break;
                        case "07" :
                           bulan_indo = "Juli";
                           break;
                        case "08" :
                           bulan_indo = "Agustus";
                           break;
                         case "09" :
                           bulan_indo = "September";
                           break;
                        case "10" :
                           bulan_indo = "Oktober";
                           break;
                        case "11" :
                           bulan_indo = "November";
                           break;
                        case "12" :
                           bulan_indo = "Desember";
                           break;
                    }
                    
                    String hari_indo = "";
                    
                    switch(sdf.format(d)){
                        case "Monday" :
                           hari_indo = "Senin";
                           break;
                        case "Tuesday" :
                           hari_indo = "Selasa";
                           break;
                        case "Wednesday" :
                           hari_indo = "Rabu";
                           break;
                        case "Thursday" :
                           hari_indo = "Kamis";
                           break;
                        case "Friday" :
                           hari_indo = "Jum'at";
                           break;
                        case "Saturday" :
                           hari_indo = "Sabtu";
                           break;
                        case "Sunday" :
                           hari_indo = "Minggu";
                           break;
                    }
                    
                    date.setText(hari_indo+", "+tanggal+" "+bulan_indo+" "+tahun);
                    time.setText(hr.format(d)+":"+(mnt.format(d))+":"+sd.format(d));
//                    tgl_resep.setText(""+sdf.format(d)+", "+tanggal+" / "+(bulan1+1)+" / "+tahun);
//                    tgl_rekam_medis.setText(tanggal+"-"+(bulan1+1)+"-"+tahun);
                    try{
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };        
        clock.start();        
    }
     
     private void loadGetDataAnakByKode() throws Exception{
         try{
            AnakEntity entity = new AnakEntity();
            entity = service.getAnakByKode(SessionEntity.getKode_anak());
            String jenis_kelamin = "";
            if(entity.getJenis_kelamin().trim().equals("L")){
                jenis_kelamin = "L - Laki-Laki";
            }else{
                jenis_kelamin = "P - Perempuan";
            }
            
            Date tanggal_lahir = new SimpleDateFormat("yyyy-MM-dd").parse(entity.getTanggal_lahir());
            Date tanggal_masuk_panti = new SimpleDateFormat("yyyy-MM-dd").parse(entity.getTanggal_masuk_panti());
            
            kodeAnak.setText(entity.getKode_anak());
            namaAnak.setText(entity.getNama_anak());
            jenisKelamin.setSelectedItem(jenis_kelamin);
            tempatLahir.setText(entity.getTempat_lahir());
            orangTuaAnak.setText(entity.getNama_orangtua_anak());
            tanggalLahir.setDate(tanggal_lahir);
            tanggalMasukPanti.setDate(tanggal_masuk_panti);
            pendidikanTerakhir.setSelectedItem(entity.getPendidikan_terakhir());
            keterangan.setText(entity.getKeterangan());
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, e.getMessage());
         }
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.JLabel date3;
    private javax.swing.JLabel date4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox jenisKelamin;
    private javax.swing.JTextArea keterangan;
    private javax.swing.JTextField kodeAnak;
    private javax.swing.JMenuItem menuKeluar;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JTextField namaAnak;
    private javax.swing.JTextField orangTuaAnak;
    private javax.swing.JComboBox pendidikanTerakhir;
    private javax.swing.JButton simpan;
    private com.toedter.calendar.JDateChooser tanggalLahir;
    private com.toedter.calendar.JDateChooser tanggalMasukPanti;
    private javax.swing.JTextField tempatLahir;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
