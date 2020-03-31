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
public class FormDonasi extends javax.swing.JFrame {

    /**
     * Creates new form FormDonasi
     */
    public FormDonasi() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.tanggalSekarang();
        menuLogout.setText("User Login : " + SessionEntity.getNama_lengkap());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date3 = new javax.swing.JLabel();
        date4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rowIndex, int colIndex)
            {
                return false; //Disallow the editing of any cell
            }
        };
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        tambahDonasi = new javax.swing.JMenuItem();
        hapusDataAnak = new javax.swing.JMenuItem();
        ubahData = new javax.swing.JMenuItem();
        menuKeluar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        date3.setText("Waktu");

        date4.setText(":");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Form Donasi");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("List Data Donasi");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        date.setText("Tanggal");

        time.setText("Waktu");

        date1.setText("Tanggal");

        date2.setText(":");

        jMenu1.setText("Aksi");

        tambahDonasi.setText("Tambah Data Donasi");
        tambahDonasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahDonasiActionPerformed(evt);
            }
        });
        jMenu1.add(tambahDonasi);

        hapusDataAnak.setText("Hapus Data Donasi");
        hapusDataAnak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusDataAnakActionPerformed(evt);
            }
        });
        jMenu1.add(hapusDataAnak);

        ubahData.setText("Ubah Data Donasi");
        ubahData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahDataActionPerformed(evt);
            }
        });
        jMenu1.add(ubahData);

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
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
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
                .addGap(51, 51, 51))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahDonasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahDonasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahDonasiActionPerformed

    private void menuKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKeluarActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        Dashboard ds = new Dashboard();
        ds.setTitle("Dashboard");
        ds.setVisible(true);

    }//GEN-LAST:event_menuKeluarActionPerformed

    private void hapusDataAnakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusDataAnakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hapusDataAnakActionPerformed

    private void ubahDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubahDataActionPerformed

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
            java.util.logging.Logger.getLogger(FormDonasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDonasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDonasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDonasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDonasi().setVisible(true);
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
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.JLabel date3;
    private javax.swing.JLabel date4;
    private javax.swing.JMenuItem hapusDataAnak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem menuKeluar;
    private javax.swing.JMenu menuLogout;
    private javax.swing.JMenuItem tambahDonasi;
    private javax.swing.JLabel time;
    private javax.swing.JMenuItem ubahData;
    // End of variables declaration//GEN-END:variables
}
