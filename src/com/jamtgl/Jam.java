/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamtgl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.Timer;

/**
 *
 * @author ARCH
 */
public class Jam extends javax.swing.JPanel {

    /**
     * Creates new form JamTgl
     */
    public Jam() {
        initComponents();
    ActionListener taskPerformer = new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
          Calendar cal = new GregorianCalendar();
        String nolJam = "";
        String nolMenit = "";
        String nolDetik = "";

        // Membuat Date
        Date dt = new Date();
        // Mengambil nilaj JAM, MENIT, dan DETIK Sekarang
        int nilaiJam = dt.getHours();
        int nilaiMenit = dt.getMinutes();
        int nilaiDetik = dt.getSeconds();
        // Jika nilai JAM lebih kecil dari 10 (hanya 1 digit)
        if (nilaiJam <= 9) {
          // Tambahkan "0" didepannya
          nolJam = "0";
        }
        // Jika nilai MENIT lebih kecil dari 10 (hanya 1 digit)
        if (nilaiMenit <= 9) {
          // Tambahkan "0" didepannya
          nolMenit = "0";
        }
        // Jika nilai DETIK lebih kecil dari 10 (hanya 1 digit)
        if (nilaiDetik <= 9) {
          // Tambahkan "0" didepannya
          nolDetik = "0";
        }

        // Membuat String JAM, MENIT, DETIK
        String jam = nolJam + Integer.toString(nilaiJam);
        String menit = nolMenit + Integer.toString(nilaiMenit);
        String detik = nolDetik + Integer.toString(nilaiDetik);

        // Menampilkan pada Layar
        tampiljam.setText(jam+":"+menit+":"+detik);
      }
    };
    // Timer
    new Timer(1000, taskPerformer).start();
    }    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGlass6 = new usu.widget.glass.PanelGlass();
        tampiljam = new javax.swing.JLabel();

        panelGlass6.setBackground(new java.awt.Color(102, 102, 102));
        panelGlass6.setOpaque(true);
        panelGlass6.setRound(false);

        tampiljam.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        tampiljam.setForeground(new java.awt.Color(255, 255, 255));
        tampiljam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tampiljam.setText("23:24");
        tampiljam.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, java.awt.Color.lightGray));
        tampiljam.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tampiljamAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout panelGlass6Layout = new javax.swing.GroupLayout(panelGlass6);
        panelGlass6.setLayout(panelGlass6Layout);
        panelGlass6Layout.setHorizontalGroup(
            panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tampiljam, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelGlass6Layout.setVerticalGroup(
            panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tampiljam)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tampiljamAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tampiljamAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tampiljamAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.glass.PanelGlass panelGlass6;
    private javax.swing.JLabel tampiljam;
    // End of variables declaration//GEN-END:variables
}
