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
public class SaldoQuery {
    koneksidb conn = new koneksidb();
    
    /*
    menampilkan Totalsaldo
    */
    public void viewTotalSaldo(JLabel tglVw, JFormattedTextField iTotalPemasukan) {
        //To change body of generated methods, choose Tools | Templates.
        String tanggal, isitotal ;
        tanggal = tglVw .getText().trim();
        String b [] = new String [1];
        try {
            Connection c = conn.getConnection();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT isisaldo FROM saldo " 
                    +"WHERE tgl_saldo = '"+tanggal+"' ");
            while ( r.next()){
            b[0]=r.getString("isisaldo");
            }
        } catch (SQLException e) {
                System.out.println("Error vie total saldo! "+e);
        }
        iTotalPemasukan.setText(b[0]);
    }

    public void insertIntoSS(JFormattedTextField iSaldo, JLabel tglVw) {
        //To change body of generated methods, choose Tools | Templates.
        String tanggal, NOM_SALDO;
        NOM_SALDO = String.valueOf(iSaldo.getValue());
        tanggal = tglVw.getText().toString();
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            int r=s.executeUpdate("INSERT INTO  `test`.`saldo` (`TGL_SALDO`,`ISISALDO`)\n" +
                                  "VALUES ('"+tanggal+"','"+NOM_SALDO+"')");
        } catch (SQLException e) {
                System.out.println("Error insert into saldo! "+e);
        }
    }
    
//      public void editTotalSaldo(JLabel tglVw ,String a) {
//        //To change body of generated methods, choose Tools | Templates.
//        String isitotal,tanggal ;
//        
//        tanggal = tglVw.getText().toString();;
//        try {
//            Connection c=conn.getConnection();
//            Statement s=c.createStatement();
//            int r=s.executeUpdate("UPDATE `saldo` SET `ISISALDO`='"+a+"'"
//                    + " WHERE `saldo`.`TGL_SALDO` =  '"+tanggal+"'");
//        } catch (SQLException e) {
//                System.out.println("Error masuk saldo! "+e);
//        }
//     }

    public void editTotalSaldoUsaha(JLabel tglVw, JFormattedTextField iSaldo) {
        //To change body of generated methods, choose Tools | Templates.
        String isitotal,tanggal ;
        isitotal = String.valueOf(iSaldo.getValue());
        tanggal = tglVw.getText().toString();;
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            int r=s.executeUpdate("UPDATE `saldo` SET `ISISALDO`='"+isitotal+"'"
                    + " WHERE `saldo`.`TGL_SALDO` =  '"+tanggal+"'");
        } catch (SQLException e) {
                System.out.println("Error edit saldo usaha! "+e);
        }
    }

    public void insertInto(JFormattedTextField iSaldoEsok, String date) {
      //To change body of generated methods, choose Tools | Templates.
         String tanggal, NOM_SALDO;
        NOM_SALDO = String.valueOf(iSaldoEsok.getValue());
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            int r=s.executeUpdate("INSERT INTO  `test`.`saldo` (`TGL_SALDO`,`ISISALDO`)\n" +
                                  "VALUES ('"+date+"','"+NOM_SALDO+"')");
        } catch (SQLException e) {
                System.out.println("Error isnert into saldo! "+e);
        }
        
    }
    
    public void viewTotalSld(String tgl, JFormattedTextField iTotalPemasukan) {
        //To change body of generated methods, choose Tools | Templates.
        String tanggal, isitotal ;
        
        String b [] = new String [1];
        try {
            Connection c = conn.getConnection();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT isisaldo FROM saldo " 
                    +"WHERE tgl_saldo = '"+tgl+"' ");
            while ( r.next()){
            b[0]=r.getString("isisaldo");
            }
        } catch (SQLException e) {
                System.out.println("Error vie total sld! "+e);
        }
        iTotalPemasukan.setText(b[0]);
    }


}
