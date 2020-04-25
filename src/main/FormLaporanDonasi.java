/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.SessionEntity;
import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Daus
 */
public class FormLaporanDonasi extends javax.swing.JFrame {

    /**
     * Creates new form FormLaporanDonasi
     */
    public FormLaporanDonasi() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.tanggalSekarang();
        menuLogout.setText("User Login : " + SessionEntity.getNama_lengkap());
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tgl1 = new com.toedter.calendar.JDateChooser();
        tgl2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        date1 = new javax.swing.JLabel();
        date3 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuKeluar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("s/d");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText(":");

        tgl1.setDateFormatString("yyyy-MM-dd");

        tgl2.setDateFormatString("yyyy-MM-dd");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Form Cetak Laporan Donasi");

        jButton1.setText("Cetak");

        date1.setText("Tanggal");

        date3.setText("Waktu");

        date.setText("Tanggal");

        time.setText("Waktu");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Tanggal");

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
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(date1)
                    .addComponent(date3))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(time)
                    .addComponent(date))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tgl1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tgl2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(date)
                                    .addComponent(date1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(date3)
                                    .addComponent(time))))
                        .addGap(14, 14, 14)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4))
                                    .addComponent(tgl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))))
                    .addComponent(tgl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKeluarActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);

        try {
            FormDonasi ds;
            ds = new FormDonasi();
            ds.setTitle("Form Donasi");
            ds.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(FormTambahDonasi.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(FormLaporanDonasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLaporanDonasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLaporanDonasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLaporanDonasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLaporanDonasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem menuKeluar;
    private javax.swing.JMenu menuLogout;
    private com.toedter.calendar.JDateChooser tgl1;
    private com.toedter.calendar.JDateChooser tgl2;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
