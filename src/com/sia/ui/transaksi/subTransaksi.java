/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sia.ui.transaksi;

import com.query.PemasukanQuery;
import com.query.PemsSaldoQuery;
import com.query.PembelianQuery;
import com.query.PendapatanQuery;
import com.query.SaldoQuery;
import com.query.SubTransQuery;
import com.service.SaldoService;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ARCH
 */
public class subTransaksi extends javax.swing.JFrame {
    GridBagLayout layout = new GridBagLayout();

PemasukanQuery pemQue;
SubTransQuery strkQue;
PendapatanQuery pendQue;

DefaultTableModel model;
java.util.Date tglSekarang = new java.util.Date();
    
    private SimpleDateFormat smpdt = new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
    private String tanggal = smpdt.format(tglSekarang);

    public subTransaksi() {
        initComponents();
       
        tglVw.setText(tanggal);
        strkQue = new SubTransQuery();
        pemQue = new PemasukanQuery();
        pendQue = new PendapatanQuery();
        model = new DefaultTableModel();
        //BynganNom.setText("0");
        //contruct tanggal
        tglVw.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
       // c.gridx = 0;
        //c.gridy = 0;
    
        //menampilkan data
        model.addColumn("Id");
        model.addColumn("Tanggal");
        model.addColumn("Nama Petugas");
        model.addColumn("Saldo Tambahan");
        model.addColumn("Status Saldo");
        tabelTrk.setModel(model);
        loadTabel();
        
        
        
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
        err_msg1 = new usu.widget.glass.PanelGlass();
        err_msg = new usu.widget.Label();
        panelGlass3 = new usu.widget.glass.PanelGlass();
        btnSubmite = new usu.widget.ButtonGlass();
        btnRefresh = new usu.widget.ButtonGlass();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelTrk = new javax.swing.JTable();
        tglVw = new javax.swing.JLabel();
        panelBayangan = new usu.widget.glass.PanelGlass();
        idVw1 = new javax.swing.JLabel();
        idBtn = new javax.swing.JLabel();
        idVw2 = new javax.swing.JLabel();
        Nominal = new javax.swing.JLabel();
        UpdSldo1 = new javax.swing.JLabel();
        BynganNom = new javax.swing.JFormattedTextField();
        panelGlass9 = new usu.widget.glass.PanelGlass();
        panelGlass24 = new usu.widget.glass.PanelGlass();
        panelGlass28 = new usu.widget.glass.PanelGlass();
        isiTtlPendapatan = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        panelGlass29 = new usu.widget.glass.PanelGlass();
        panelGlass30 = new usu.widget.glass.PanelGlass();
        isiTtlPemasukan = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        panelGlass4 = new usu.widget.glass.PanelGlass();
        label1 = new usu.widget.Label();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 590));

        err_msg1.setRound(false);

        err_msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        err_msg.setFont(new java.awt.Font("Meiryo UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout err_msg1Layout = new javax.swing.GroupLayout(err_msg1);
        err_msg1.setLayout(err_msg1Layout);
        err_msg1Layout.setHorizontalGroup(
            err_msg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(err_msg1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(err_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        err_msg1Layout.setVerticalGroup(
            err_msg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(err_msg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        panelGlass3.setAlpha(0.0F);
        panelGlass3.setRound(false);

        btnSubmite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/doc_submit.png"))); // NOI18N
        btnSubmite.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        btnSubmite.setRoundRect(true);
        btnSubmite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmiteActionPerformed(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/doc_refresh.png"))); // NOI18N
        btnRefresh.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N
        btnRefresh.setPreferredSize(new java.awt.Dimension(117, 41));
        btnRefresh.setRoundRect(true);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        tabelTrk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id Saldo", "Nominal Saldo", "Keterangan"
            }
        ));
        tabelTrk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTrkMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelTrk);

        javax.swing.GroupLayout panelGlass3Layout = new javax.swing.GroupLayout(panelGlass3);
        panelGlass3.setLayout(panelGlass3Layout);
        panelGlass3Layout.setHorizontalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelGlass3Layout.createSequentialGroup()
                        .addComponent(btnSubmite, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGlass3Layout.setVerticalGroup(
            panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelGlass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSubmite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        tglVw.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        tglVw.setForeground(new java.awt.Color(255, 255, 255));
        tglVw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tglVw.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        panelBayangan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelBayangan.setPreferredSize(new java.awt.Dimension(675, 184));
        panelBayangan.setRound(false);

        idVw2.setText("ID.SALDO");

        Nominal.setText("Nominal");

        UpdSldo1.setText("ID.Button");

        BynganNom.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));

        javax.swing.GroupLayout panelBayanganLayout = new javax.swing.GroupLayout(panelBayangan);
        panelBayangan.setLayout(panelBayanganLayout);
        panelBayanganLayout.setHorizontalGroup(
            panelBayanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBayanganLayout.createSequentialGroup()
                .addGroup(panelBayanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBayanganLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BynganNom, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBayanganLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(idVw2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idVw1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBayanganLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(idBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(panelBayanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBayanganLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panelBayanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(UpdSldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nominal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(132, Short.MAX_VALUE)))
        );
        panelBayanganLayout.setVerticalGroup(
            panelBayanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBayanganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBayanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBayanganLayout.createSequentialGroup()
                        .addComponent(idVw2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(idVw1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BynganNom, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelBayanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelBayanganLayout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(Nominal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(UpdSldo1)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        panelGlass9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelGlass9.setPreferredSize(new java.awt.Dimension(675, 184));
        panelGlass9.setRound(false);

        panelGlass24.setAlpha(1.0F);
        panelGlass24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panelGlass24.setRound(false);

        panelGlass28.setAlpha(1.0F);
        panelGlass28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelGlass28.setRound(false);

        isiTtlPendapatan.setBorder(null);
        isiTtlPendapatan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));
        isiTtlPendapatan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        isiTtlPendapatan.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout panelGlass28Layout = new javax.swing.GroupLayout(panelGlass28);
        panelGlass28.setLayout(panelGlass28Layout);
        panelGlass28Layout.setHorizontalGroup(
            panelGlass28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isiTtlPendapatan, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGlass28Layout.setVerticalGroup(
            panelGlass28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(isiTtlPendapatan, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Total Pendapatan");

        javax.swing.GroupLayout panelGlass24Layout = new javax.swing.GroupLayout(panelGlass24);
        panelGlass24.setLayout(panelGlass24Layout);
        panelGlass24Layout.setHorizontalGroup(
            panelGlass24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass24Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGlass28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelGlass24Layout.setVerticalGroup(
            panelGlass24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass24Layout.createSequentialGroup()
                .addGroup(panelGlass24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelGlass28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGlass29.setAlpha(1.0F);
        panelGlass29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        panelGlass29.setRound(false);

        panelGlass30.setAlpha(1.0F);
        panelGlass30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelGlass30.setRound(false);

        isiTtlPemasukan.setBorder(null);
        isiTtlPemasukan.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        isiTtlPemasukan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        isiTtlPemasukan.setFont(new java.awt.Font("Meiryo UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout panelGlass30Layout = new javax.swing.GroupLayout(panelGlass30);
        panelGlass30.setLayout(panelGlass30Layout);
        panelGlass30Layout.setHorizontalGroup(
            panelGlass30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(isiTtlPemasukan, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGlass30Layout.setVerticalGroup(
            panelGlass30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(isiTtlPemasukan, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Total Pemasukan");

        javax.swing.GroupLayout panelGlass29Layout = new javax.swing.GroupLayout(panelGlass29);
        panelGlass29.setLayout(panelGlass29Layout);
        panelGlass29Layout.setHorizontalGroup(
            panelGlass29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass29Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGlass30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelGlass29Layout.setVerticalGroup(
            panelGlass29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass29Layout.createSequentialGroup()
                .addGroup(panelGlass29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelGlass30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelGlass9Layout = new javax.swing.GroupLayout(panelGlass9);
        panelGlass9.setLayout(panelGlass9Layout);
        panelGlass9Layout.setHorizontalGroup(
            panelGlass9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGlass24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGlass29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGlass9Layout.setVerticalGroup(
            panelGlass9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGlass9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGlass29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelGlass24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGlass4.setAlpha(0.0F);
        panelGlass4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        panelGlass4.setPreferredSize(new java.awt.Dimension(264, 54));
        panelGlass4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setBackground(new java.awt.Color(153, 153, 153));
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Submit Transaksi");
        label1.setFont(new java.awt.Font("Meiryo UI", 0, 18)); // NOI18N
        label1.setOpaque(true);
        panelGlass4.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 280, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(panelGlass4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(err_msg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(panelGlass9, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addComponent(panelBayangan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tglVw, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBayangan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tglVw, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelGlass4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(err_msg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelGlass9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(panelGlass3, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorder(null);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(1, 20));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Exit");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1019, 666));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tabelTrkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTrkMouseClicked
        // TODO add your handling code here:
        tabelMouseAction();
    }//GEN-LAST:event_tabelTrkMouseClicked

    private void btnSubmiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmiteActionPerformed
        // TODO add your handling code here:
        idBtn.setText("1");
        tampilBtn();
        clear();
    }//GEN-LAST:event_btnSubmiteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        loadTabel();
        clear();
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(subTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new subTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField BynganNom;
    private javax.swing.JLabel Nominal;
    private javax.swing.JLabel UpdSldo1;
    private usu.widget.ButtonGlass btnRefresh;
    private usu.widget.ButtonGlass btnSubmite;
    private usu.widget.Label err_msg;
    private usu.widget.glass.PanelGlass err_msg1;
    private javax.swing.JLabel idBtn;
    private javax.swing.JLabel idVw1;
    private javax.swing.JLabel idVw2;
    private javax.swing.JFormattedTextField isiTtlPemasukan;
    private javax.swing.JFormattedTextField isiTtlPendapatan;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private usu.widget.Label label1;
    private usu.widget.glass.PanelGlass panelBayangan;
    private usu.widget.glass.PanelGlass panelGlass24;
    private usu.widget.glass.PanelGlass panelGlass28;
    private usu.widget.glass.PanelGlass panelGlass29;
    private usu.widget.glass.PanelGlass panelGlass3;
    private usu.widget.glass.PanelGlass panelGlass30;
    private usu.widget.glass.PanelGlass panelGlass4;
    private usu.widget.glass.PanelGlass panelGlass9;
    private javax.swing.JTable tabelTrk;
    private javax.swing.JLabel tglVw;
    // End of variables declaration//GEN-END:variables
  public void clear(){
        //err_msg.setText("");
      
        BynganNom.setText("");
        idBtn.setText("");
        //isiKeterangan.setEnabled(true);
        btnSubmite.setEnabled(true);
  } 
    
    private void loadTabel(){
        List<String[]> result = strkQue.viewTransaksi(tglVw);
        String TGL_SALDO;
        TGL_SALDO = tglVw.getText().trim();
        pemQue.viewTotalPemasukan(tglVw,isiTtlPemasukan);
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        tabelTrk.setModel(model);
        for(int i = 0; i < result.size();i++){
            model.addRow(result.get(i));
        }
        tabelTrk.repaint();
        model.fireTableDataChanged();
        clear();
        if(isiTtlPendapatan.getText().isEmpty()){
            strkQue.sumTransaksi(tglVw, isiTtlPendapatan);
        } else{
            err_msg.setText(" Pendapatan Telah ditambahkan! ");
            err_msg.setForeground(Color.green);
        }
        
    }
    
    private void submitAct(){
       try{
            MatEdit();
           //System.out.println(""+isiTotalSaldo.getText());                     
            err_msg.setText(" Berhasil ditambahkan! ");
            err_msg.setForeground(Color.green);
        }
        catch(Exception e){
            err_msg.setText(" Gagal ditambahkan! ");
            err_msg.setForeground(Color.red);
        } 
    }
     
    
    private void tampilBtn(){
        if (!idBtn.getText().isEmpty()){
            int Btn = Integer.parseInt(idBtn.getText());
            if(Btn==1){
                //JOptionPane.showMessageDialog(this, "1 ");
                //addAction();
                String isiTtlSaldo = String.valueOf(isiTtlPendapatan.getValue());
                   // BigDecimal nomSldo = new BigDecimal(isiTtlSaldo);
                    System.out.println(""+isiTtlSaldo);    
            } else if (Btn==2){
               // editAction();
                //JOptionPane.showMessageDialog(this, "3");
            } else if (Btn==3){
                JOptionPane.showMessageDialog(this, "3");
            }
           loadTabel(); 
        }
    }
    
    public void MatEdit(){
        String isiPemasukan = String.valueOf(isiTtlPemasukan.getValue());
        BigDecimal ttlPemasukan = new BigDecimal(isiPemasukan);
        String isiPendapatan = String.valueOf(isiTtlPendapatan.getValue());
        BigDecimal ttlPendapatan = new BigDecimal(isiPendapatan);
        
        BigDecimal tbhPemasukan = ttlPemasukan.add(ttlPendapatan);
        BynganNom.setValue(tbhPemasukan);
        pemQue.editPemasukan(tglVw, BynganNom);
        pendQue.editPendapatan(tglVw,isiTtlPendapatan);
    }
    
    private void tabelMouseAction() {
       //To change body of generated methods, choose Tools | Templates.
        btnSubmite.setEnabled(false);
        int row = tabelTrk.getSelectedRow();
        idVw1.setText(tabelTrk.getModel().getValueAt(row,0).toString());
        BynganNom.setValue(tabelTrk.getModel().getValueAt(row,3).toString());
        
    }
    
}
