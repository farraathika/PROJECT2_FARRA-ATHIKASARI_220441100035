/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author asus
 */
public class NO1 extends javax.swing.JFrame {
    public double jamkerja;
    public double perjm;
    public double jumlahgaji;
    public double tarifperjam;
    public double jamLembur;
    public double gajiLembur;
    public double potonganPajak;
    public double gajiBersih;
    /**
     * Creates new form NO1
     */
    public NO1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnGajiBruto = new javax.swing.JButton();
        btnGajiBersih = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JamKerja = new javax.swing.JTextField();
        TarifPerJam = new javax.swing.JTextField();
        gjbruto = new javax.swing.JTextField();
        gjbersih = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 16)); // NOI18N
        jLabel1.setText("\"PROGRAM MENGHITUNG GAJI KARYAWAN\"");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabel2.setText("Jumlah Jam Kerja 1 Minggu");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(55, 35, 190, 16);

        jLabel3.setText("Tarif Per-jam");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(55, 75, 150, 16);

        jLabel4.setText("Gaji Bruto");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(55, 156, 130, 16);

        btnGajiBruto.setText("HITUNG GAJI BRUTO");
        btnGajiBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGajiBrutoActionPerformed(evt);
            }
        });
        jPanel2.add(btnGajiBruto);
        btnGajiBruto.setBounds(55, 112, 160, 23);

        btnGajiBersih.setText("HITUNG GAJI BERSIH");
        btnGajiBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGajiBersihActionPerformed(evt);
            }
        });
        jPanel2.add(btnGajiBersih);
        btnGajiBersih.setBounds(55, 193, 160, 23);

        jLabel5.setText("Gaji Bersih");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(55, 237, 130, 16);
        jPanel2.add(JamKerja);
        JamKerja.setBounds(266, 32, 145, 22);
        jPanel2.add(TarifPerJam);
        TarifPerJam.setBounds(266, 72, 145, 22);
        jPanel2.add(gjbruto);
        gjbruto.setBounds(266, 153, 145, 22);
        jPanel2.add(gjbersih);
        gjbersih.setBounds(266, 234, 145, 22);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG.jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 460, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGajiBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGajiBrutoActionPerformed
        // TODO add your handling code here:
        double jamkerja = Double.parseDouble(JamKerja.getText());
        double perjm = Double.parseDouble(TarifPerJam.getText());
        if (jamkerja <= 40) {
            jumlahgaji = jamkerja * perjm;
        }else {
            double jamLembur = jamkerja - 40;
            double gajiLembur = jamLembur * (perjm * 1.5);
            jumlahgaji = 40 * perjm + gajiLembur;
        }
            gjbruto.setText(String.valueOf(jumlahgaji));
    }//GEN-LAST:event_btnGajiBrutoActionPerformed

    private void btnGajiBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGajiBersihActionPerformed
        // TODO add your handling code here:
        double potonganPajak = 0.1 * jumlahgaji;
        double gajiBersih = jumlahgaji - potonganPajak;
        gjbersih.setText(String.valueOf(gajiBersih));
    }//GEN-LAST:event_btnGajiBersihActionPerformed

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
            java.util.logging.Logger.getLogger(NO1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NO1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NO1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NO1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NO1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JamKerja;
    private javax.swing.JTextField TarifPerJam;
    private javax.swing.JButton btnGajiBersih;
    private javax.swing.JButton btnGajiBruto;
    private javax.swing.JTextField gjbersih;
    private javax.swing.JTextField gjbruto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
