/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sia.ui.pengaman;

import com.koneksi.koneksidb;
import com.service.LoginService;
import com.sia.mainInterface.Akuntansi;
import com.sia.mainInterface.Manager;
import com.sia.mainInterface.TranIfram;
import com.sia.ui.aruskas.InsertSaldo;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.SwingUtilities;


/**
 *
 * @author ARCH
 */
public class fLogin extends javax.swing.JFrame {
koneksidb conn = new koneksidb();
String username="";
LoginService db = new LoginService();
    /**
     * Creates new form fLogin
     */
    public fLogin() {
        initComponents();
        focus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        panelGlass1 = new usu.widget.glass.PanelGlass();
        panelGlass2 = new usu.widget.glass.PanelGlass();
        panelGlass5 = new usu.widget.glass.PanelGlass();
        jLabel1 = new javax.swing.JLabel();
        panelGlass6 = new usu.widget.glass.PanelGlass();
        btn_login = new usu.widget.ButtonGlass();
        err_msg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusCycleRoot(false);
        setModalExclusionType(null);
        setType(java.awt.Window.Type.UTILITY);

        panelGlass1.setAlpha(1.0F);
        panelGlass1.setBackground(new java.awt.Color(255, 255, 255));
        panelGlass1.setPreferredSize(new java.awt.Dimension(1004, 920));
        panelGlass1.setRound(false);
        panelGlass1.setWarna(new java.awt.Color(0, 0, 0));

        panelGlass2.setAlpha(0.0F);
        panelGlass2.setBackground(new java.awt.Color(255, 255, 255));
        panelGlass2.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/icon/login.png"))); // NOI18N
        panelGlass2.setPreferredSize(new java.awt.Dimension(733, 493));
        panelGlass2.setWarna(new java.awt.Color(0, 0, 0));
        panelGlass2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGlass5.setAlpha(0.0F);
        panelGlass5.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/icon/key_blue.png"))); // NOI18N
        panelGlass5.setRound(false);

        javax.swing.GroupLayout panelGlass5Layout = new javax.swing.GroupLayout(panelGlass5);
        panelGlass5.setLayout(panelGlass5Layout);
        panelGlass5Layout.setHorizontalGroup(
            panelGlass5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );
        panelGlass5Layout.setVerticalGroup(
            panelGlass5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        panelGlass2.add(panelGlass5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 42));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");
        panelGlass2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 116, 36));

        panelGlass6.setAlpha(0.0F);
        panelGlass6.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/icon/userLog.png"))); // NOI18N
        panelGlass6.setRound(false);

        javax.swing.GroupLayout panelGlass6Layout = new javax.swing.GroupLayout(panelGlass6);
        panelGlass6.setLayout(panelGlass6Layout);
        panelGlass6Layout.setHorizontalGroup(
            panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );
        panelGlass6Layout.setVerticalGroup(
            panelGlass6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        panelGlass2.add(panelGlass6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btn_login.png"))); // NOI18N
        btn_login.setAlignmentY(0.0F);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        panelGlass2.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 80, 40));

        err_msg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        err_msg.setForeground(new java.awt.Color(255, 255, 255));
        err_msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelGlass2.add(err_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 370, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        user.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        user.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelGlass2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 260, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        password.setBorder(null);
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelGlass2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 260, -1));

        javax.swing.GroupLayout panelGlass1Layout = new javax.swing.GroupLayout(panelGlass1);
        panelGlass1.setLayout(panelGlass1Layout);
        panelGlass1Layout.setHorizontalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGlass1Layout.createSequentialGroup()
                .addComponent(panelGlass2, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelGlass1Layout.setVerticalGroup(
            panelGlass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGlass1Layout.createSequentialGroup()
                .addComponent(panelGlass2, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGlass1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(489, 411));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        if(user.getText().isEmpty()){
            if(password.getText().isEmpty()){
                err_msg.setText("NAMA ATAU PWD KOSONG!");
                err_msg.setForeground(Color.red);
            } else{
                err_msg.setText("NAMA KOSONG!");
                err_msg.setForeground(Color.red);
            }   
        } else{
            if(password.getText().isEmpty()){
                err_msg.setText("PWD KOSONG!");
                err_msg.setForeground(Color.red);
            } else{
               
                loginAkses();
            }
        }
            
    }//GEN-LAST:event_btn_loginActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
             if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
          if(user.getText().isEmpty()){
            if(password.getText().isEmpty()){
                err_msg.setText("NAMA ATAU PWD KOSONG!");
                err_msg.setForeground(Color.red);
            } else{
                err_msg.setText("NAMA KOSONG!");
                err_msg.setForeground(Color.red);
            }   
        } else{
            if(password.getText().isEmpty()){
                err_msg.setText("PWD KOSONG!");
                err_msg.setForeground(Color.red);
            } else{
                loginAkses();
            }
        }
            
        }
    }//GEN-LAST:event_passwordKeyPressed

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
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass btn_login;
    private javax.swing.JLabel err_msg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private usu.widget.glass.PanelGlass panelGlass1;
    private usu.widget.glass.PanelGlass panelGlass2;
    private usu.widget.glass.PanelGlass panelGlass5;
    private usu.widget.glass.PanelGlass panelGlass6;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
    
    
    public void loginAkses(){
        
        String USER = user.getText().toString();
        String pas = password.getText().trim();
        String hakakses = null;
        String id = null;
        try {
            List<String[]> result = db.login(USER, pas);
            for(int i = 0; i < result.size();i++){
                String[] r = result.get(i);
                hakakses=r[0];
                id =r[1];
            }
        } catch (Exception ex) {
            err_msg.setText("NAMA ATAU PWD SALAH!");
            err_msg.setForeground(Color.red);
        }
        if (hakakses!=null){
            if(hakakses.equals("akuntansi")){
                Akuntansi call = new Akuntansi();
                InsertSaldo callE = new InsertSaldo();
                call.show();
                call.setUser(USER,id);
                this.dispose();
            }
            else if (hakakses.equals("manager")){
                Manager call = new Manager();
                call.show();
                call.SetUser(USER,id);
                this.dispose();
            }
             else if (hakakses.equals("petugas")){
                TranIfram call = new TranIfram();
                //Pembelian callP = new Pembelian();
                call.show();
                call.setUser(USER,id);
                this.dispose();
            }
//            else if (hakakses.equals("admin")){
////                uiLogin1 call = new uiLogin1();
////                call.show();
////                call.jembatan(USER,id);
////                this.dispose();
//            }
       }else {
            err_msg.setText("NAMA ATAU PWD SALAH!");
            err_msg.setForeground(Color.red);
        }
        //new Akuntansi().setVisible(true);
         //System.out.println("hakakses = "+hakakses);                               

    }
    
    private void focus(){
        panelGlass2.setVisible(true);
       // panelGlass2.setFocusable(true);
//        SwingUtilities.invokeLater(new Runnable() {
//        addWindowListener(new WindowAdapter(){ 
//  public void windowOpened( WindowEvent e){ 
//    user.requestFocusInWindow();
//  } 
//}); 
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //isiTtlBr.requestFocusInWindow();
                user.requestFocusInWindow();
            }
        });
    }
}
