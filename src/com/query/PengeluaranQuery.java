/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.query;

import com.koneksi.koneksidb;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

/**
 *
 * @author ARCH
 */
public class PengeluaranQuery {
    koneksidb conn = new koneksidb();
    
    public void viewTotalPengeluaran(JLabel tglVw,JFormattedTextField iTotalPeng){
        String tanggal, isitotal ;
        tanggal = tglVw .getText().trim();
        String b [] = new String [1];
        try {
            Connection c = conn.getConnection();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT jumlah_keluar FROM pengeluaran " 
                    +"WHERE tgl_pengeluaran = '"+tanggal+"' ");
            while ( r.next()){
            b[0]=r.getString("jumlah_keluar");
            }
        } catch (SQLException e) {
                System.out.println("Error di select jumlah_keluar! "+e);
        }
        iTotalPeng.setText(b[0]);
    }
        
    
    public void editPengeluaran(JLabel tglVw,JFormattedTextField iTotalPeng){
        String tanggal, isitotal ;
        tanggal = tglVw .getText().trim();
       isitotal = String.valueOf(iTotalPeng.getValue());
        
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            int r=s.executeUpdate("UPDATE `pengeluaran` SET `JUMLAH_KELUAR`= '"+isitotal+"' "
                    + "WHERE `TGL_PENGELUARAN`= '"+tanggal+"'");
        } catch (SQLException e) {
                System.out.println("Error edit pengeluran! "+e);
        }
    }

    public void insertInto(String date) {
         //To change body of generated methods, choose Tools | Templates.
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
           int r=s.executeUpdate("INSERT INTO  `test`.`pengeluaran` (`TGL_PENGELUARAN`,`JUMLAH_KELUAR`)"
                   + "VALUES ('"+date+"','0')");
        } catch (SQLException e) {
                System.out.println("Error insert into pengeluaran! "+e);
        }

    }

}
