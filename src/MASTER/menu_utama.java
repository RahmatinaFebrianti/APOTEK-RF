/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MASTER;
import java.util.Calendar;
import java.util.GregorianCalendar;
import TRANSAKSI.Transaksi;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Rahmatina
 */
public class menu_utama extends javax.swing.JFrame {

    /**
     * Creates new form menu_utama
     */
    public menu_utama() {
        initComponents();
        waktu();
        tanggal();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU UTAMA");
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 80)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APOTEK RF");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 690, 70));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 175, 175));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 680));

        jMenu1.setText("MASTER");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem1.setText("PELANGGAN");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem2.setText("KARYAWAN");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem3.setText("OBAT");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("TRANSAKSI");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("LAPORAN");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jMenuItem4.setText("DATA PELANGGAN");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("DATA KARYAWAN");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("DATA OBAT");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("TRANSAKSI");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("LOG OUT");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1266, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void tanggal(){
        java.util.Date tgl = new java.util.Date();
        java.text.SimpleDateFormat kal = new
        java.text.SimpleDateFormat("EEEE, dd-MMMMMMMM-yyyy");
        jLabel1.setText(kal.format(tgl));
    }
    
    private void waktu(){
        new Thread(){
            int waktumulai;
            @Override
            public void run(){
                while (waktumulai==0){
                    Calendar calendar = new GregorianCalendar();
                    int jam = calendar.get(Calendar.HOUR);
                    int menit = calendar.get(Calendar.MINUTE);
                    int detik = calendar.get(Calendar.SECOND);
                    int AM_PM = calendar.get(Calendar.AM_PM);
                    String siang_malam = "";
                    if (AM_PM==1){
                        siang_malam="PM";
                    }else{
                        siang_malam="AM";
                    }
                    String time = jam+":"+menit+":"+detik + "" + siang_malam;
                    jLabel3.setText(time);
                }
            }
        }.start();
    }
    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         // TODO add your handling code here:
        new Data_Pelanggan().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         new Data_Karyawan().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
         new Data_Obat().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
         // TODO add your handling code here:
         new Transaksi().setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         // TODO add your handling code here:
         try {
            String NamaFile = "src/report/PELANGGAN.jasper";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/apotek_rahmatina","root","");
            HashMap hash = new HashMap();
            File file = new File(NamaFile);
            //Mengambil parameter dari ireport
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hash, koneksi);
            JRViewer aViewer = new JRViewer(jasperPrint);
            JDialog viewer = new JDialog();
            viewer.setTitle(".: Jasper Report :.");
            //viewer.setAlwaysOnTop(true);
            viewer.getContentPane().add(aViewer);
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            viewer.setBounds(0,0,screenSize.width, screenSize.height);
            viewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Error Cetak "+e);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
         // TODO add your handling code here:
         try {
            String NamaFile = "src/report/KARYAWAN.jasper";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/apotek_rahmatina","root","");
            HashMap hash = new HashMap();
            File file = new File(NamaFile);
            //Mengambil parameter dari ireport
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hash, koneksi);
            JRViewer aViewer = new JRViewer(jasperPrint);
            JDialog viewer = new JDialog();
            viewer.setTitle(".: Jasper Report :.");
            //viewer.setAlwaysOnTop(true);
            viewer.getContentPane().add(aViewer);
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            viewer.setBounds(0,0,screenSize.width, screenSize.height);
            viewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Error Cetak "+e);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
         // TODO add your handling code here:
         try {
            String NamaFile = "src/report/OBAT.jasper";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/apotek_rahmatina","root","");
            HashMap hash = new HashMap();
            File file = new File(NamaFile);
            //Mengambil parameter dari ireport
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, hash, koneksi);
            JRViewer aViewer = new JRViewer(jasperPrint);
            JDialog viewer = new JDialog();
            viewer.setTitle(".: Jasper Report :.");
            //viewer.setAlwaysOnTop(true);
            viewer.getContentPane().add(aViewer);
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            viewer.setBounds(0,0,screenSize.width, screenSize.height);
            viewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Error Cetak "+e);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
         // TODO add your handling code here:
        button_transaksi frameform = new button_transaksi(this, false);
        frameform.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
         // TODO add your handling code here:
         new Login().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_jMenu4MouseClicked

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
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
