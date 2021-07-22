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
public class PemasukanQuery {
    koneksidb conn = new koneksidb();
    
     public void viewTotalPemasukan(JLabel tglVw, JFormattedTextField iTtlPemasukan) {
        //To change body of generated methods, choose Tools | Templates.
        String tanggal;
        tanggal = tglVw .getText().trim();
        String b [] = new String [1];
        try {
            Connection c = conn.getConnection();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT  `JUMLAH_PEMS` FROM  `pemasukan` \n" +
                    "WHERE tgl_pemasukan =  '"+tanggal+"'");
            while ( r.next()){
            b[0]=r.getString("JUMLAH_PEMS");
            }
        } catch (SQLException e) {
                System.out.println("Error view Total PEmasukan! "+e);
        }
        iTtlPemasukan.setText(b[0]);
    }
     
     
    public void editPemasukan(JLabel tglVw, JFormattedTextField iTtlPem) {
        //To change body of generated methods, choose Tools | Templates.
         String isitotal,tanggal ;
        isitotal = String.valueOf(iTtlPem.getValue());
        tanggal = tglVw.getText().toString();;
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            int r=s.executeUpdate("UPDATE `pemasukan` SET `JUMLAH_PEMS`='"+isitotal+"'"
                    + " WHERE `pemasukan`.`TGL_PEMASUKAN` =  '"+tanggal+"'");
        } catch (SQLException e) {
                System.out.println("Error edit pemasukan! "+e);
        }
    }

    public void insertInto(JFormattedTextField iSaldoEsok,String date) {
       //To change body of generated methods, choose Tools | Templates.
         String isitotal,tanggal ;
        isitotal = String.valueOf(iSaldoEsok.getValue());
          try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
           int r=s.executeUpdate("INSERT INTO `pemasukan`(`TGL_PEMASUKAN`, `TGL_SALDO`, `TGL_PENDAPATAN`, `JUMLAH_PEMS`) "
                   + "VALUES ('"+date+"','"+date+"','"+date+"','"+isitotal+"')");
        } catch (SQLException e) {
                System.out.println("Error insert into pemasukan! "+e);
        }
    }
    
        public List<String[]> viewPemsTrk(JLabel tglVw) {
        List<String[]> result = new ArrayList<String[]>();
        String tanggal = tglVw.getText().trim();

        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT @no := @no +1 AS NO, p.nama_PETUGAS, d.TGL_JUAL, d.JML_JUAL, d.POT_JMLJUAL, "
                    + "d.PEMBELI, d.UANG_BAYAR, d.SISA_BAYAR, d.STATUS_BAYAR, d.KETERANGAN, d.JENIS_CARD \n" +
                    "FROM del_jual d, petugas p, (SELECT @no :=0) AS no \n" +
                    "where d.tgl_jual = '"+tanggal+"'"
                    + "and p.kode_petugas = d.kode_petugas");
            
            while(r.next()){
            String[] ss = new String[11]; 
            ss[0]=r.getString("NO");
            ss[1]=r.getString("P.nama_PETUGAS");
            ss[2]=r.getString("d.TGL_JUAL");
            ss[3]=r.getString("d.JML_JUAL");
            ss[4]=r.getString("d.POT_JMLJUAL");
            ss[5]=r.getString("d.PEMBELI");
            ss[6]=r.getString("d.UANG_BAYAR");
            ss[7]=r.getString("d.SISA_BAYAR");
            ss[8]=r.getString("d.STATUS_BAYAR");
            ss[9]=r.getString("d.KETERANGAN");
            ss[10]=r.getString("d.JENIS_CARD");
            
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error view pems transaksi:" +e);
        }
        return result;
    }
    
    public List<String[]> fcSelectCommand(JTextField txtSearch) {
        //To change body of generated methods, choose Tools | Templates.
        List<String[]> result = new ArrayList<String[]>();
        String search = txtSearch.getText().trim();
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT @no := @no +1 AS NO, p.nama_PETUGAS, d.TGL_JUAL, d.JML_JUAL, d.POT_JMLJUAL, "
                    + "d.PEMBELI, d.UANG_BAYAR, d.SISA_BAYAR, d.STATUS_BAYAR, d.KETERANGAN, d.JENIS_CARD \n" +
                    "FROM del_jual d, petugas p, (SELECT @no :=0) AS no \n" +
                    "where d.tgl_jual like '"+search+"' \n" +
                    "or d.pembeli like '"+search+"' \n" +
                    "or d.status_bayar like '"+search+"' \n" +
                    "or d.keterangan like '"+search+"' \n" +
                    "or d.jenis_card like '"+search+"' \n" +
                    "and p.kode_petugas = d.kode_petugas");
            while(r.next()){
            String[] ss = new String[11]; 
            ss[0]=r.getString("NO");
            ss[1]=r.getString("P.nama_PETUGAS");
            ss[2]=r.getString("d.TGL_JUAL");
            ss[3]=r.getString("d.JML_JUAL");
            ss[4]=r.getString("d.POT_JMLJUAL");
            ss[5]=r.getString("d.PEMBELI");
            ss[6]=r.getString("d.UANG_BAYAR");
            ss[7]=r.getString("d.SISA_BAYAR");
            ss[8]=r.getString("d.STATUS_BAYAR");
            ss[9]=r.getString("d.KETERANGAN");
            ss[10]=r.getString("d.JENIS_CARD");
            
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error search pemasukan transaksi:" +e);
        }
        return result;
    }

    public List<String[]> lapPeroide(String dateAwl, String dateAkh) {
        //To change body of generated methods, choose Tools | Templates.
         List<String[]> result = new ArrayList<String[]>();
         System.out.println(dateAkh);
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT @no := @no +1 AS NO, p.nama_PETUGAS, d.TGL_JUAL, d.JML_JUAL, d.POT_JMLJUAL, "
                    + "d.PEMBELI, d.UANG_BAYAR, d.SISA_BAYAR, d.STATUS_BAYAR, d.KETERANGAN, d.JENIS_CARD \n" +
                    "FROM del_jual d, petugas p, (SELECT @no :=0) AS no \n" +
                    "where d.tgl_jual BETWEEN '"+dateAwl+"' AND '"+dateAkh+"'"
                    + "and p.kode_petugas = d.kode_petugas");
            while(r.next()){
            String[] ss = new String[11]; 
            ss[0]=r.getString("NO");
            ss[1]=r.getString("P.nama_PETUGAS");
            ss[2]=r.getString("d.TGL_JUAL");
            ss[3]=r.getString("d.JML_JUAL");
            ss[4]=r.getString("d.POT_JMLJUAL");
            ss[5]=r.getString("d.PEMBELI");
            ss[6]=r.getString("d.UANG_BAYAR");
            ss[7]=r.getString("d.SISA_BAYAR");
            ss[8]=r.getString("d.STATUS_BAYAR");
            ss[9]=r.getString("d.KETERANGAN");
            ss[10]=r.getString("d.JENIS_CARD");
            
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error lapperiode pems trk:" +e);
        }
        return result;
    }
//
    public List<String[]> lapBulan(int tahunAwl, int tahunAkh, String xdateAwl, String xdateAkh) {
        //To change body of generated methods, choose Tools | Templates.
            List<String[]> result = new ArrayList<String[]>();
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT @no := @no +1 AS NO, DATE_FORMAT( d.TGL_JUAL,  '%Y-%m-%d' ) as tgl, "
                    + "p.nama_PETUGAS, d.JML_JUAL, d.POT_JMLJUAL, "
                    + "d.PEMBELI, d.UANG_BAYAR, d.SISA_BAYAR, d.STATUS_BAYAR, d.KETERANGAN, d.JENIS_CARD "
                    + "FROM del_jual as d join  petugas as p, (SELECT @no :=0) AS no "
                    + "where DATE_FORMAT( d.TGL_JUAL,  '%Y-%m' ) = '"+tahunAwl+"-"+xdateAwl+"' "
                    + "and p.kode_petugas = d.kode_petugas ");
            while(r.next()){
             String[] ss = new String[11]; 
            ss[0]=r.getString("NO");
            ss[1]=r.getString("P.nama_PETUGAS");
            ss[2]=r.getString("tgl");
            ss[3]=r.getString("d.JML_JUAL");
            ss[4]=r.getString("d.POT_JMLJUAL");
            ss[5]=r.getString("d.PEMBELI");
            ss[6]=r.getString("d.UANG_BAYAR");
            ss[7]=r.getString("d.SISA_BAYAR");
            ss[8]=r.getString("d.STATUS_BAYAR");
            ss[9]=r.getString("d.KETERANGAN");
            ss[10]=r.getString("d.JENIS_CARD");
            
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error  lapBulan pemsTrk:" +e);
        }
        return result;
    
    }
//
    public List<String[]> lapPerBulan(int tahunAwl, int tahunAkh, String xdateAwl, String xdateAkh) {
        //To change body of generated methods, choose Tools | Templates.
         List<String[]> result = new ArrayList<String[]>();
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT DATE_FORMAT( d.TGL_JUAL,  '%Y-%m-%d' ) as tgl, sum(d.JML_JUAL) as JML_JUAL , "
                    +"sum(d.POT_JMLJUAL) as POT_JMLJUAL,\n" +
                    "sum(d.UANG_BAYAR) as UANG_BAYAR, sum(d.SISA_BAYAR) as SISA_BAYAR, \n" +
                    "d.STATUS_BAYAR, d.KETERANGAN,d.JENIS_CARD \n" +
                    "FROM del_jual as d join  petugas as p\n" +
                    "where DATE_FORMAT( d.TGL_JUAL,  '%Y-%m' ) "
                    + "BETWEEN '"+tahunAwl+"-"+xdateAwl+"' "
                    + "AND '"+tahunAkh+"-"+xdateAkh+"' \n" +
                    "GROUP BY DATE_FORMAT( d.tgl_jual ,  '%Y-%m' ),d.STATUS_BAYAR, d.KETERANGAN, d.JENIS_CARD");
            while(r.next()){
             String[] ss = new String[11]; 
           
            
            ss[2]=r.getString("tgl");
            ss[3]=r.getString("JML_JUAL");
            ss[4]=r.getString("POT_JMLJUAL");

            ss[6]=r.getString("UANG_BAYAR");
            ss[7]=r.getString("SISA_BAYAR");
            ss[8]=r.getString("d.STATUS_BAYAR");
            ss[9]=r.getString("d.KETERANGAN");
            ss[10]=r.getString("d.JENIS_CARD");
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error :" +e);
        }
        return result;
    
    }
//    
//
}
