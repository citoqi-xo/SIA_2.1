/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sia.mainInterface;

import com.sia.ui.tranIfram.*;
//import com.sia.ui.aruskas.HelpProduk;
import com.sia.ui.pengaman.fLogin;
import javax.swing.JFrame;

/**
 *
 * @author ARCH
 */
public class TranIfram extends javax.swing.JFrame {

    String setIdUser;
    /**
     * Creates new form MainFrame
     */
    public TranIfram() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setAlwaysOnTop(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGlass1 = new usu.widget.glass.PanelGlass();
        panelGlass8 = new usu.widget.glass.PanelGlass();
        namabarang1 = new javax.swing.JLabel();
        hargabarang4 = new javax.swing.JLabel();
        hargabarang5 = new javax.swing.JLabel();
        hargabarang6 = new javax.swing.JLabel();
        jTgl = new javax.swing.JLabel();
        jDate = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        namabarang2 = new javax.swing.JLabel();
        frame = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        produk = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        saldo = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGlass1.setAlpha(1.0F);
        panelGlass1.setBackground(new java.awt.Color(255, 255, 255));
        panelGlass1.setMinimumSize(new java.awt.Dimension(0, 0));
        panelGlass1.setPreferredSize(new java.awt.Dimension(1365, 745));
        panelGlass1.setRound(false);
        panelGlass1.setWarna(new java.awt.Color(51, 51, 51));
        panelGlass1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGlass8.setRound(false);

        namabarang1.setBackground(new java.awt.Color(153, 153, 153));
        namabarang1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namabarang1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namabarang1.setText("F1 | Produk");
        namabarang1.setOpaque(true);

        hargabarang4.setBackground(new java.awt.Color(153, 153, 153));
        hargabarang4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hargabarang4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hargabarang4.setText("F3 | Saldo Insidentil");
        hargabarang4.setOpaque(true);

        hargabarang5.setBackground(new java.awt.Color(153, 153, 153));
        hargabarang5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hargabarang5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hargabarang5.setText("F4 | Submit Transaksi");
        hargabarang5.setOpaque(true);

        hargabarang6.setBackground(new java.awt.Color(153, 153, 153));
        hargabarang6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hargabarang6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hargabarang6.setText("Esc | Keluar");
        hargabarang6.setOpaque(true);

        jTgl.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jTgl.setForeground(new java.awt.Color(255, 255, 255));
        jTgl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTgl.setText("23:45");
        jTgl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jDate.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jDate.setForeground(new java.awt.Color(255, 255, 255));
        jDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDate.setText("23-07-2015");
        jDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        namabarang2.setBackground(new java.awt.Color(153, 153, 153));
        namabarang2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        namabarang2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namabarang2.setText("F2 | Pembelian");
        namabarang2.setOpaque(true);

        javax.swing.GroupLayout panelGlass8Layout = new javax.swing.GroupLayout(panelGlass8);
        panelGlass8.setLayout(panelGlass8Layout);
        panelGlass8Layout.setHorizontalGroup(
            panelGlass8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namabarang1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namabarang2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hargabarang4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hargabarang5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hargabarang6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        panelGlass8Layout.setVerticalGroup(
            panelGlass8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass8Layout.createSequentialGroup()
                .addGroup(panelGlass8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTgl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelGlass8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(namabarang1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hargabarang4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hargabarang5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hargabarang6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(namabarang2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelGlass1.add(panelGlass8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, -1, 50));

        frame.setBackground(new java.awt.Color(204, 204, 204));
        frame.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(frame);
        frame.setLayout(frameLayout);
        frameLayout.setHorizontalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        frameLayout.setVerticalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        panelGlass1.add(frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 650));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu1.setText("Help");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.add(jSeparator2);

        produk.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        produk.setText("Produk");
        produk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produkActionPerformed(evt);
            }
        });
        jMenu1.add(produk);

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem2.setText("Submit Transaksi");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        saldo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        saldo.setText("Saldo");
        saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoActionPerformed(evt);
            }
        });
        jMenu1.add(saldo);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem4.setText("Pembelian");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1365, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelGlass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseClicked

    private void produkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produkActionPerformed
        // TODO add your handling code here:
       HelpProduk p=new HelpProduk();
       frame.add(p);
       p.setVisible(true);
       p.setLocation(110, 10);
    }//GEN-LAST:event_produkActionPerformed

    private void saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoActionPerformed
        // TODO add your handling code here:
       saldoInsedintil p=new saldoInsedintil(setIdUser);
       frame.add(p);
       p.setVisible(true);
       p.setLocation(110, 10);
    }//GEN-LAST:event_saldoActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
       this.dispose();
       fLogin login = new fLogin();
       login.setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
       subTransaksi p=new subTransaksi(setIdUser);
       frame.add(p);
       p.setVisible(true);
       p.setLocation(110, 10);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
       Pembelian p=new Pembelian(setIdUser);
       frame.add(p);
       p.setVisible(true);
       p.setLocation(110, 10);
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
            java.util.logging.Logger.getLogger(TranIfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TranIfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TranIfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TranIfram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TranIfram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exit;
    private javax.swing.JDesktopPane frame;
    private javax.swing.JLabel hargabarang4;
    private javax.swing.JLabel hargabarang5;
    private javax.swing.JLabel hargabarang6;
    private javax.swing.JLabel jDate;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel jTgl;
    private javax.swing.JLabel namabarang1;
    private javax.swing.JLabel namabarang2;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.glass.PanelGlass panelGlass8;
    private javax.swing.JMenuItem produk;
    private javax.swing.JMenuItem saldo;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables

    public void setUser(String USER, String id) {
        //To change body of generated methods, choose Tools | Templates.
        user.setText(USER);
        setIdUser=id;
    }
}
