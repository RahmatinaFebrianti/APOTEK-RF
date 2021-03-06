/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MASTER;

import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Rahmatina
 */
public class Data_Obat extends javax.swing.JFrame {
public Statement stt;
    public Connection con;
    private TableColumn column;
    private final DefaultTableModel tabel;
    String temp_obat="";
    /**
     * Creates new form Data_Obat1
     */
    public Data_Obat() {
        initComponents();
        String[] judul={"KODE OBAT","NAMA OBAT","JENIS","DOSIS","HARGA"};
        tabel = new DefaultTableModel(judul,0);
        jTable1.setModel(tabel);
        tampilkan_data();
        penomoran_otomatis();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        enama = new javax.swing.JTextField();
        ekode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        eharga = new javax.swing.JTextField();
        cbdosis = new javax.swing.JComboBox<>();
        cbjenis = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DATA OBAT");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 33)); // NOI18N
        jLabel1.setText("APOTEK RF");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 280, 55));

        jLabel2.setFont(new java.awt.Font("Bell MT", 0, 17)); // NOI18N
        jLabel2.setText("Kode Obat");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 121, 28));

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 17)); // NOI18N
        jLabel3.setText("Nama Obat");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 121, 28));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 17)); // NOI18N
        jLabel4.setText("Jenis");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 121, 28));

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 17)); // NOI18N
        jLabel5.setText("Dosis");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 121, 28));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 17)); // NOI18N
        jLabel6.setText("Harga");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 121, 28));

        enama.setFont(new java.awt.Font("Calisto MT", 0, 15)); // NOI18N
        getContentPane().add(enama, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 190, 28));

        ekode.setFont(new java.awt.Font("Calisto MT", 0, 15)); // NOI18N
        getContentPane().add(ekode, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 190, 28));

        jTable1.setFont(new java.awt.Font("Calisto MT", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Obat", "Nama Obat", "Jenis", "Kategori", "Harga"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 650, 140));

        jButton4.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 98, 33));

        jButton3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton3.setText("EDIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 98, 33));

        jButton2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton2.setText("SIMPAN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 98, 33));

        eharga.setFont(new java.awt.Font("Calisto MT", 0, 15)); // NOI18N
        getContentPane().add(eharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 190, 28));

        cbdosis.setFont(new java.awt.Font("Calisto MT", 0, 15)); // NOI18N
        cbdosis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anak-Anak", "Dewasa", "Anak & Dewasa" }));
        getContentPane().add(cbdosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 190, 28));

        cbjenis.setFont(new java.awt.Font("Calisto MT", 0, 15)); // NOI18N
        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tablet", "Kapsul", "Cair" }));
        getContentPane().add(cbjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 190, 28));

        jButton5.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton5.setText("CLOSE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 100, 30));

        jLabel7.setFont(new java.awt.Font("Engravers MT", 1, 33)); // NOI18N
        jLabel7.setText("DATA OBAT");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 280, 55));

        jPanel1.setBackground(new java.awt.Color(255, 175, 175));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 610));

        setSize(new java.awt.Dimension(706, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
String kode_obat = ekode.getText();
String nama_obat = enama.getText();
String jenis = (String) cbjenis.getSelectedItem();
String dosis = (String) cbdosis.getSelectedItem();
String harga = eharga.getText();

{
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
com.mysql.jdbc.Connection koneksi = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/apotek_rahmatina", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="insert into tb_obat values('"+kode_obat+"','"+nama_obat+"','"+jenis+"','"+dosis+"','"+harga+"')";
int executeUpdate = statement.executeUpdate(sql);
statement.close();
JOptionPane.showMessageDialog(null, "DATA OBAT BERHASIL DISIMPAN","Insert Data",JOptionPane.INFORMATION_MESSAGE);
enama.setText("");
cbjenis.setSelectedItem("");
cbdosis.setSelectedItem("");
eharga.setText("");

koneksi.close();
}
catch (     ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e)
{
JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}
finally {
tampilkan_data();
penomoran_otomatis();
}
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
String kode_obat = ekode.getText();
String nama_obat = enama.getText();
String jenis = (String) cbjenis.getSelectedItem();
String dosis = (String) cbdosis.getSelectedItem();
String harga = eharga.getText();
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
com.mysql.jdbc.Connection koneksi = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/apotek_rahmatina", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="UPDATE tb_obat SET kd_obat='"+kode_obat+"',nama_obat='"+nama_obat+"',jenis='"+jenis+"',dosis='"+dosis+"',harga='"+harga+"' WHERE kd_obat ='"+kode_obat+"'";
statement.executeUpdate(sql);
statement.close();
JOptionPane.showMessageDialog(null, "DATA OBAT BERHASIL DIEDIT","Insert Data",JOptionPane.INFORMATION_MESSAGE);
koneksi.close();
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e) {
JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}finally{
tampilkan_data();
penomoran_otomatis();
}
enama.setText("");
cbjenis.setSelectedItem("");
cbdosis.setSelectedItem("");
eharga.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(ekode.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "PILIH DATA TERLEBIH DAHULU");
        }
        else{
            int reply = JOptionPane.showConfirmDialog(this,"YAKIN HAPUS DATA OBAT?","Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (reply == JOptionPane.YES_OPTION) {
                try {
                    java.sql.Connection koneksi = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_rahmatina","root","");
                    koneksi.createStatement().executeUpdate("DELETE FROM tb_obat where kd_obat='"+ekode.getText()+"'");
                    JOptionPane.showMessageDialog(this, "DATA OBAT BERHASIL DIHAPUS");
                    tampilkan_data();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "DATA OBAT GAGAL DIHAPUS");
                }
                
            }
            enama.setText("");
            cbjenis.setSelectedItem("");
            cbdosis.setSelectedItem("");
            eharga.setText("");
            penomoran_otomatis();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void penomoran_otomatis() {
        int no_obat=0;
        String temp_obat="";
        try {
            koneksi();
            String sql = "select kd_obat from tb_obat order by kd_obat desc limit 1";                        
            ResultSet res=stt.executeQuery(sql);
            while (res.next()) {
                temp_obat = res.getString(1);                
                String nomor_blkg = temp_obat.substring(3,5);
                no_obat=Integer.parseInt(nomor_blkg);
            }
                        
            no_obat++;
            String nilai=String.valueOf(no_obat);                      
            if(nilai.length()==1){
                ekode.setText("OB00"+no_obat);
            }else
            if(nilai.length()==2){
                ekode.setText("OB0"+no_obat);
            }else
            if(nilai.length()==3){
                ekode.setText("OB"+no_obat);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Error Penomoran !");
        }
    }
    
  
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        ekode.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        enama.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        cbjenis.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        cbdosis.setSelectedItem(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
        eharga.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
       
        temp_obat = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         // TODO add your handling code here:
        this.dispose();;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tampilkan_data() {
        try {
            int data = jTable1.getRowCount();
            for(int i=0;i<data;i++){
                tabel.removeRow(0);
            }
            com.mysql.jdbc.Connection koneksi = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_rahmatina","root","");
            ResultSet re=koneksi.createStatement().executeQuery("SELECT * FROM tb_obat ORDER BY kd_obat");            
            while(re.next()){                
                String[] tabel_master={re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5)};
                tabel.addRow(tabel_master);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi Kesalahan Tampil Tabel");
        }
    }
    
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
            java.util.logging.Logger.getLogger(Data_Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Obat().setVisible(true);
            }
        });
    }
    
    private void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver") ;
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/apotek_rahmatina","root","");
            stt = (Statement) con.createStatement();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Koneksi Database Error");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbdosis;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JTextField eharga;
    private javax.swing.JTextField ekode;
    private javax.swing.JTextField enama;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
