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
 * @author 15997107
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        menuLogout.setText("User Login : " + SessionEntity.getNama_lengkap());
        tanggalSekarang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        date3 = new javax.swing.JLabel();
        date4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        menuBar = new javax.swing.JMenuBar();
        dataDonasi = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuDonasi = new javax.swing.JMenuItem();
        menuAdopsi = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistem Donasi");

        date.setText("Tanggal");

        time.setText("Waktu");

        date1.setText("Tanggal");

        date2.setText(":");

        date3.setText("Waktu");

        date4.setText(":");

        dataDonasi.setText("Data Master");

        jMenuItem1.setText("Data Anak");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        dataDonasi.add(jMenuItem1);

        jMenuItem5.setText("Data Admin");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        dataDonasi.add(jMenuItem5);

        menuBar.add(dataDonasi);

        jMenu5.setText("Data Transaksi");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        menuDonasi.setText("Data Donasi");
        menuDonasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDonasiActionPerformed(evt);
            }
        });
        jMenu5.add(menuDonasi);

        menuAdopsi.setText("Data Adopsi");
        menuAdopsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdopsiActionPerformed(evt);
            }
        });
        jMenu5.add(menuAdopsi);

        menuBar.add(jMenu5);

        jMenu6.setText("Laporan");

        jMenuItem2.setText("Laporan Data Adopsi");
        jMenu6.add(jMenuItem2);

        jMenuItem4.setText("Laporan Donasi");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        menuBar.add(jMenu6);

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

        menuBar.add(menuLogout);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
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
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
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
                .addContainerGap(208, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuLogoutActionPerformed

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        FormAnak form;
        try {
            form = new FormAnak();
            form.setVisible(true);
        form.setTitle("Form Anak");
        this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void menuDonasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDonasiActionPerformed
        // TODO add your handling code here:
        FormDonasi donasi;
        try {
            donasi = new FormDonasi();
            donasi.setVisible(true);
            donasi.setTitle("Form Donasi");
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_menuDonasiActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        FormAdmin admin;
        try {
            admin = new FormAdmin();
            admin.setVisible(true);
            admin.setTitle("Form Admin");
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void menuAdopsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdopsiActionPerformed
        // TODO add your handling code here:
        FormAdopsi form;
        try {
            this.setVisible(false);
            form = new FormAdopsi();
            form.setVisible(true);
            form.setTitle("Form Adopsi");
        } catch (Exception ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_menuAdopsiActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dashboard ds = new Dashboard();
                ds.setVisible(true);
                ds.setTitle("Dashboard");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu dataDonasi;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.JLabel date3;
    private javax.swing.JLabel date4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuAdopsi;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuDonasi;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
