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
import javax.swing.JTextField;

/**
 *
 * @author ARCH
 */
public class PendapatanQuery {
    koneksidb conn = new koneksidb();
    
    public void viewTotalPendapatan(JLabel tglVw, JFormattedTextField iTotalPendapatan) {
        //To change body of generated methods, choose Tools | Templates.
        String tanggal, isitotal ;
        tanggal = tglVw .getText().trim();
        String b [] = new String [1];
        try {
            Connection c = conn.getConnection();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT jumlah_pend FROM pendapatan " 
                    +"WHERE tgl_pendapatan = '"+tanggal+"' ");
            while ( r.next()){
            b[0]=r.getString("jumlah_pend");
            }
        } catch (SQLException e) {
                System.out.println("Error view Total Pendapatan! "+e);
        }
        iTotalPendapatan.setText(b[0]);
    }

    public void insertInto(String date) {
         //To change body of generated methods, choose Tools | Templates.
         try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
           int r=s.executeUpdate("INSERT INTO  `test`.`pendapatan` (`TGL_PENDAPATAN`,`JUMLAH_PEND`)"
                   + "VALUES ('"+date+"','0')");
        } catch (SQLException e) {
                System.out.println("Error insert into pendapatan! "+e);
        }
    }
    
    public void laba(JTextField isilaba, JLabel isitglawal1,JLabel isitglakhir1 ){
        String tanggal_awal1, tanggal_akhir1 ;
        tanggal_awal1 = isitglawal1 .getText().trim();
        tanggal_akhir1 = isitglakhir1.getText().trim();
        String b [] = new String [1];
        try {
            Connection c = conn.getConnection();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery( "select (count(*)*(u.harga_jual-u.harga_default))"
                    + "as laba from penjualan p, pulsa u where p.id_pulsa = u.id_pulsa and `tanggal` "
                    + "BETWEEN '"+tanggal_awal1+"' and '"+tanggal_akhir1+"'");
            
            while ( r.next()){
              
            b[0]=r.getString("laba");
           
            }
        } catch (SQLException e) {
                System.out.println("Error di select alllalalalababa pendapatan! "+e);
        }
        isilaba.setText(b[0]);
        
    }
    
//    public List<String[]> viewTotalTransaksi(JLabel tglVw) {
//        List<String[]> result = new ArrayList<String[]>();
//        String tanggal = tglVw.getText().trim();
//
//        try {
//            Connection c=conn.getConnection();
//            Statement s=c.createStatement();
//            ResultSet r=s.executeQuery("SELECT i.ID_PEMBELIAN, i.TGL_PEMBELIAN, p.nama_petugas, "
//                                       +"i.NAMA_PEMBELIAN, i.JUMLAH_PEMBELIAN, i.HARGA_BP, i.HARGA_JBP\n" +
//                                        "FROM petugas AS p JOIN pembelian AS i\n" +
//                                        "WHERE i.TGL_PEMBELIAN\n" +
//                                        "BETWEEN  '2015-08-09' AND  '2015-08-12'\n" +
//                                        "AND i.kode_petugas = p.kode_petugas");
//            while(r.next()){
//            String[] ss = new String[7]; 
//            ss[0]=r.getString("i.ID_PEMBELIAN");
//            ss[1]=r.getString("i.TGL_PEMBELIAN");
//            ss[2]=r.getString("p.nama_petugas");
//            ss[3]=r.getString("i.NAMA_PEMBELIAN");
//            ss[4]=r.getString("i.JUMLAH_PEMBELIAN");
//            ss[5]=r.getString("i.HARGA_BP");
//            ss[6]=r.getString("i.HARGA_JBP");
//            
//            result.add(ss);
//            }
//        }catch (SQLException e){
//            System.out.println("terjadi error :" +e);
//        }
//        return result;
//    }

    public void editPendapatan(JLabel tglVw, JFormattedTextField iTtlPend) {
        //To change body of generated methods, choose Tools | Templates.
        String isitotal,tanggal ;
        isitotal = String.valueOf(iTtlPend.getValue());
        tanggal = tglVw.getText().toString();;
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            int r=s.executeUpdate("UPDATE `pendapatan` SET `JUMLAH_PEND`='"+isitotal+"'"
                    + " WHERE `pendapatan`.`TGL_PENDAPATAN` =  '"+tanggal+"'");
        } catch (SQLException e) {
                System.out.println("Error edit pendapatan! "+e);
        }
    }
    
}
