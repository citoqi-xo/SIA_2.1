/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sia.ui.laporan;

import java.awt.GridBagLayout;

/**
 *
 * @author ARCH
 */
public class laporanTransaksi extends javax.swing.JPanel {
            GridBagLayout layout = new GridBagLayout();

    /**
     * Creates new form laporanBulanan
     */
    public laporanTransaksi() {
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
        tglVw = new javax.swing.JLabel();
        panelPeri = new javax.swing.JPanel();
        panelPeriode = new usu.widget.glass.PanelGlass();
        txtSearch1 = new javax.swing.JTextField();
        dateAwal = new com.toedter.calendar.JDateChooser();
        txtSearch2 = new javax.swing.JTextField();
        dateAkhir = new com.toedter.calendar.JDateChooser();
        btnCaribln1 = new usu.widget.ButtonGlass();
        panelBulan = new usu.widget.glass.PanelGlass();
        txtSearch3 = new javax.swing.JTextField();
        txtSearch4 = new javax.swing.JTextField();
        bulanAwal = new com.toedter.calendar.JMonthChooser();
        tahunAwal = new com.toedter.calendar.JYearChooser();
        btnCaribln = new usu.widget.ButtonGlass();
        bulanAkhir = new com.toedter.calendar.JMonthChooser();
        tahunAkhir = new com.toedter.calendar.JYearChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPemb = new javax.swing.JTable();
        panelGlass5 = new usu.widget.glass.PanelGlass();
        panelGlass4 = new usu.widget.glass.PanelGlass();
        btnSearch2 = new usu.widget.ButtonGlass();
        txtSearch = new javax.swing.JTextField();
        panelGlass3 = new usu.widget.glass.PanelGlass();
        btnRefresh = new usu.widget.ButtonGlass();
        btnPrint = new usu.widget.ButtonGlass();
        btnBulan = new javax.swing.JRadioButton();
        btnPeriode = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(1366, 633));
        setPreferredSize(new java.awt.Dimension(1366, 633));

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 586));

        tglVw.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        tglVw.setForeground(new java.awt.Color(255, 255, 255));
        tglVw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tglVw.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        panelPeri.setBackground(new java.awt.Color(102, 102, 102));
        panelPeri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        panelPeriode.setAlpha(0.0F);
        panelPeriode.setBackground(new java.awt.Color(51, 51, 51));
        panelPeriode.setForeground(new java.awt.Color(255, 255, 255));
        panelPeriode.setRound(false);

        txtSearch1.setBackground(new java.awt.Color(102, 102, 102));
        txtSearch1.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        txtSearch1.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearch1.setText("Dari Tanggal");
        txtSearch1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));

        dateAwal.setAlignmentX(1.0F);
        dateAwal.setAlignmentY(1.0F);
        dateAwal.setDateFormatString("yyyy-MM-dd");
        dateAwal.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        dateAwal.setOpaque(false);
        dateAwal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateAwalPropertyChange(evt);
            }
        });

        txtSearch2.setBackground(new java.awt.Color(102, 102, 102));
        txtSearch2.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        txtSearch2.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearch2.setText("Sampai");
        txtSearch2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));

        dateAkhir.setDateFormatString("yyyy-MM-dd");
        dateAkhir.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        dateAkhir.setOpaque(false);
        dateAkhir.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateAkhirPropertyChange(evt);
            }
        });

        btnCaribln1.setBackground(new java.awt.Color(0, 153, 204));
        btnCaribln1.setBorder(null);
        btnCaribln1.setForeground(new java.awt.Color(255, 255, 255));
        btnCaribln1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnCari.png"))); // NOI18N
        btnCaribln1.setAlignmentY(0.0F);
        btnCaribln1.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        btnCaribln1.setOpaque(true);
        btnCaribln1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaribln1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPeriodeLayout = new javax.swing.GroupLayout(panelPeriode);
        panelPeriode.setLayout(panelPeriodeLayout);
        panelPeriodeLayout.setHorizontalGroup(
            panelPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeriodeLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(txtSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCaribln1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelPeriodeLayout.setVerticalGroup(
            panelPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dateAwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dateAkhir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtSearch2)
            .addComponent(txtSearch1)
            .addComponent(btnCaribln1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBulan.setAlpha(0.0F);
        panelBulan.setRound(false);

        txtSearch3.setBackground(new java.awt.Color(102, 102, 102));
        txtSearch3.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        txtSearch3.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearch3.setText("Dari Bulan");
        txtSearch3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));

        txtSearch4.setBackground(new java.awt.Color(102, 102, 102));
        txtSearch4.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        txtSearch4.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearch4.setText("Sampai");
        txtSearch4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));

        bulanAwal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnCaribln.setBackground(new java.awt.Color(0, 153, 204));
        btnCaribln.setBorder(null);
        btnCaribln.setForeground(new java.awt.Color(255, 255, 255));
        btnCaribln.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btnCari.png"))); // NOI18N
        btnCaribln.setAlignmentY(0.0F);
        btnCaribln.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N
        btnCaribln.setOpaque(true);
        btnCaribln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariblnActionPerformed(evt);
            }
        });

        bulanAkhir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout panelBulanLayout = new javax.swing.GroupLayout(panelBulan);
        panelBulan.setLayout(panelBulanLayout);
        panelBulanLayout.setHorizontalGroup(
            panelBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBulanLayout.createSequentialGroup()
                .addComponent(txtSearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bulanAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tahunAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtSearch4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bulanAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tahunAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCaribln, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBulanLayout.setVerticalGroup(
            panelBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tahunAkhir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBulanLayout.createSequentialGroup()
                .addGroup(panelBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCaribln, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bulanAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSearch3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bulanAwal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addGroup(panelBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSearch4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tahunAwal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPeriLayout = new javax.swing.GroupLayout(panelPeri);
        panelPeri.setLayout(panelPeriLayout);
        panelPeriLayout.setHorizontalGroup(
            panelPeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeriLayout.createSequentialGroup()
                .addGroup(panelPeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPeriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPeriLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(panelPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPeriLayout.setVerticalGroup(
            panelPeriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPeriLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(panelPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelPemb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "Saldo Awal", "Pemasukan", "Pengeluaran", "Saldo Akhir", "Setoran"
            }
        ));
        jScrollPane1.setViewportView(tabelPemb);

        panelGlass5.setAlpha(0.0F);
        panelGlass5.setRound(false);

        panelGlass4.setAlpha(1.0F);
        panelGlass4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panelGlass4.setRound(false);

        btnSearch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btn_search.png"))); // NOI18N
        btnSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch2ActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelGlass4Layout = new javax.swing.GroupLayout(panelGlass4);
        panelGlass4.setLayout(panelGlass4Layout);
        panelGlass4Layout.setHorizontalGroup(
            panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass4Layout.createSequentialGroup()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelGlass4Layout.setVerticalGroup(
            panelGlass4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        panelGlass3.setAlpha(0.0F);
        panelGlass3.setRound(false);

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/doc_refresh.png"))); // NOI18N
        btnRefresh.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        btnRefresh.setPreferredSize(new java.awt.Dimension(117, 41));
        btnRefresh.setRoundRect(true);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(204, 0, 51));
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Printer.png"))); // NOI18N
        btnPrint.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        btnPrint.setOpaque(true);
        btnPrint.setPreferredSize(new java.awt.Dimension(117, 41));
        btnPrint.setRoundRect(true);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass3Layout = new javax.swing.GroupLayout(panelGlass3);
        panelGlass3.setLayout(panelGlass3Layout);
        panelGlass3Layout.setHorizontalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass3Layout.createSequentialGroup()
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGlass3Layout.setVerticalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass3Layout.createSequentialGroup()
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnBulan.setBackground(new java.awt.Color(51, 51, 51));
        btnBulan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBulan.setForeground(new java.awt.Color(255, 255, 255));
        btnBulan.setText("Bulan");
        btnBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBulanActionPerformed(evt);
            }
        });

        btnPeriode.setBackground(new java.awt.Color(51, 51, 51));
        btnPeriode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPeriode.setForeground(new java.awt.Color(255, 255, 255));
        btnPeriode.setText("Periode");
        btnPeriode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeriodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGlass5Layout = new javax.swing.GroupLayout(panelGlass5);
        panelGlass5.setLayout(panelGlass5Layout);
        panelGlass5Layout.setHorizontalGroup(
            panelGlass5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBulan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPeriode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelGlass4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        panelGlass5Layout.setVerticalGroup(
            panelGlass5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass5Layout.createSequentialGroup()
                .addGroup(panelGlass5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelGlass4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGlass5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelGlass5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBulan)
                            .addComponent(btnPeriode))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(panelPeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(579, 579, 579)
                        .addComponent(tglVw, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelGlass5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tglVw, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPeri, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGlass5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dateAwalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateAwalPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_dateAwalPropertyChange

    private void dateAkhirPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateAkhirPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_dateAkhirPropertyChange

    private void btnCaribln1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaribln1ActionPerformed
        // TODO add your handling code here:
//        periode();
    }//GEN-LAST:event_btnCaribln1ActionPerformed

    private void btnCariblnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariblnActionPerformed
//        // TODO add your handling code here:
//        cariBulan();
    }//GEN-LAST:event_btnCariblnActionPerformed

    private void btnSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch2ActionPerformed
        // TODO add your handling code here:
//        ssearchAction();
    }//GEN-LAST:event_btnSearch2ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
//        ssearchAction();
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        // TODO add your handling code here:
//        ssearchAction();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
//        loadTabel();
//        clear();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
//        cekPrint();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBulanActionPerformed
        // TODO add your handling code here:
//        panelBulan.setVisible(true);
//        panelPeriode.setVisible(false);
//        clear();
    }//GEN-LAST:event_btnBulanActionPerformed

    private void btnPeriodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeriodeActionPerformed
        // TODO add your handling code here:
//        panelBulan.setVisible(false);
//        panelPeriode.setVisible(true);
//        SimpleDateFormat ft,vt;
//        ft = new SimpleDateFormat("MM");
//        vt = new SimpleDateFormat("yyyy");
//        String nowM = ft.format(tglSekarang);
//        String nowY = vt.format(tglSekarang);
//        int month = Integer.parseInt(nowM)-1;
//        int year = Integer.parseInt(nowY);
//        bulanAwal.setMonth(month);
//        bulanAkhir.setMonth(month);
//        tahunAkhir.setYear(year);
//        tahunAwal.setYear(year);
    }//GEN-LAST:event_btnPeriodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnBulan;
    private usu.widget.ButtonGlass btnCaribln;
    private usu.widget.ButtonGlass btnCaribln1;
    private javax.swing.JRadioButton btnPeriode;
    private usu.widget.ButtonGlass btnPrint;
    private usu.widget.ButtonGlass btnRefresh;
    private usu.widget.ButtonGlass btnSearch2;
    private com.toedter.calendar.JMonthChooser bulanAkhir;
    private com.toedter.calendar.JMonthChooser bulanAwal;
    private com.toedter.calendar.JDateChooser dateAkhir;
    private com.toedter.calendar.JDateChooser dateAwal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private usu.widget.glass.PanelGlass panelBulan;
    private usu.widget.glass.PanelGlass panelGlass3;
    private usu.widget.glass.PanelGlass panelGlass4;
    private usu.widget.glass.PanelGlass panelGlass5;
    private javax.swing.JPanel panelPeri;
    private usu.widget.glass.PanelGlass panelPeriode;
    private javax.swing.JTable tabelPemb;
    private com.toedter.calendar.JYearChooser tahunAkhir;
    private com.toedter.calendar.JYearChooser tahunAwal;
    private javax.swing.JLabel tglVw;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearch1;
    private javax.swing.JTextField txtSearch2;
    private javax.swing.JTextField txtSearch3;
    private javax.swing.JTextField txtSearch4;
    // End of variables declaration//GEN-END:variables
}
