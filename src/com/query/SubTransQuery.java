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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

/**
 *
 * @author ARCH
 */
public class SubTransQuery {
    koneksidb conn = new koneksidb();
    
       public List<String[]> viewTransaksi(JLabel tglVw) {
        List<String[]> result = new ArrayList<String[]>();
        String tanggal = tglVw.getText().trim();

        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT * FROM `del_jual`"
                    + "WHERE `tgl_jual`= '"+tanggal+"' AND `status_bayar`= 'tunai'");
            
            while(r.next()){
            String[] ss = new String[4]; 
            ss[0]=r.getString("No_jual");
            ss[1]=r.getString("tgl_jual");
            ss[2]=r.getString("status_bayar");
            ss[3]=r.getString("uang_bayar");
            
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error vie transaksi :" +e);
        }
        return result;
    }
       
       public void sumTransaksi(JLabel tglVw, JFormattedTextField iTtlPend){
        String tanggal;
        tanggal = tglVw .getText().trim();
        String b [] = new String [1];
        try {
            Connection c = conn.getConnection();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT SUM( uang_bayar ) AS total\n" +
                    "FROM del_jual "
                    + "WHERE  `status_bayar` =  'tunai'\n" +
                    "AND tgl_jual =  '"+tanggal+"'");
            while ( r.next()){
            b[0]=r.getString("total");
            }
        } catch (SQLException e) {
                System.out.println("Error Sum transaksi tunai! "+e);
        }
        iTtlPend.setText(b[0]);
       }
       
       public void sumBankA(JLabel tglVw, JFormattedTextField iTtlPend){
        String tanggal;
        tanggal = tglVw .getText().trim();
        String b [] = new String [1];
        try {
            Connection c = conn.getConnection();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT SUM( uang_bayar ) AS total\n" +
                    "FROM del_jual "
                    + "WHERE  `jenis_card` =  'A'\n" +
                    "AND tgl_jual =  '"+tanggal+"'");
            while ( r.next()){
            b[0]=r.getString("total");
            }
        } catch (SQLException e) {
                System.out.println("Error Sum transaksi bank a! "+e);
        }
        iTtlPend.setText(b[0]);
       }
    
       public void sumBankB(JLabel tglVw, JFormattedTextField iTtlPend){
        String tanggal;
        tanggal = tglVw .getText().trim();
        String b [] = new String [1];
        try {
            Connection c = conn.getConnection();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT SUM( uang_bayar ) AS total\n" +
                    "FROM del_jual "
                    + "WHERE  `jenis_card` =  'B'\n" +
                    "AND tgl_jual =  '"+tanggal+"'");
            while ( r.next()){
            b[0]=r.getString("total");
            }
        } catch (SQLException e) {
                System.out.println("Error Sum transaksi bank b! "+e);
        }
        iTtlPend.setText(b[0]);
       }
       
       public void sumBankC(JLabel tglVw, JFormattedTextField iTtlPend){
        String tanggal;
        tanggal = tglVw .getText().trim();
        String b [] = new String [1];
        try {
            Connection c = conn.getConnection();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT SUM( uang_bayar ) AS total\n" +
                    "FROM del_jual "
                    + "WHERE  `jenis_card` =  'C'\n" +
                    "AND tgl_jual =  '"+tanggal+"'");
            while ( r.next()){
            b[0]=r.getString("total");
            }
        } catch (SQLException e) {
                System.out.println("Error Sum transaksi bank c! "+e);
        }
        iTtlPend.setText(b[0]);
       }
       
       public void sumAll(JLabel tglVw, JFormattedTextField iTtlPend){
        String tanggal;
        tanggal = tglVw .getText().trim();
        String b [] = new String [1];
        try {
            Connection c = conn.getConnection();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT SUM( uang_bayar ) AS total\n" +
                    "FROM del_jual "
                    + "WHERE tgl_jual =  '"+tanggal+"'");
            while ( r.next()){
            b[0]=r.getString("total");
            }
        } catch (SQLException e) {
                System.out.println("Error Sum transaksiAll! "+e);
        }
        iTtlPend.setText(b[0]);
       }
}
