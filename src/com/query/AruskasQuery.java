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
public class AruskasQuery {
 koneksidb conn = new koneksidb();
    
    public void insertInto(JLabel tglVw, JFormattedTextField iTotalSaldo, 
            JFormattedTextField iTotalPendapatan,JFormattedTextField iTotalPemasukan, JFormattedTextField iTotalPengeluaran, 
            JFormattedTextField iSisaPemasukan, JFormattedTextField iSetoran, JFormattedTextField iSaldoEsok,
            JFormattedTextField isiCash,JFormattedTextField isiBankA,JFormattedTextField isiBankB,JFormattedTextField isiBankC) {
       //To change body of generated methods, choose Tools | Templates.
        String tanggal,iSld,iPdt,iTlPems,iTlPeng,iSPems,iSet,iSlE,cash,Ba,bb,Bc;
        tanggal = tglVw.getText();
        iSld = String.valueOf(iTotalSaldo.getValue());
        iPdt = String.valueOf(iTotalPendapatan.getValue());
        iTlPems= String.valueOf(iTotalPemasukan.getValue());
        iTlPeng = String.valueOf(iTotalPengeluaran.getValue());
        iSPems = String.valueOf(iSisaPemasukan.getValue());
        iSet = String.valueOf(iSetoran.getValue());
        iSlE = String.valueOf(iSaldoEsok.getValue());
        cash = String.valueOf(isiCash.getValue());
        Ba = String.valueOf(isiBankA.getValue());
        bb = String.valueOf(isiBankB.getValue());
        Bc = String.valueOf(isiBankC.getValue());

        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            int r=s.executeUpdate("INSERT INTO `aruskas`(`ID_ARUSKAS`, `TGL_PENGELUARAN`, `TGL_PEMASUKAN`,`TGL_ARUSKAS`, "
                    + "`SALDO_AWAL`, `JUMLAH_PENDAPATAN`, `JUMLAH_PEMASUKAN`, `JUMLAH_PENGELUARAN`, "
                    + "`SALDO_AKHIR`, `SETORAN`, `SISA_USAHA`,`tunai`, `bank A`, `bank b`, `bank c`) "
                    + "VALUES (NULL,'"+tanggal+"','"+tanggal+"','"+tanggal+"','"+iSld+"','"+iPdt+"','"+iTlPems+"','"+iTlPeng+"',"
                    + "'"+iSPems+"','"+iSet+"','"+iSlE+"','"+cash+"','"+Ba+"','"+bb+"','"+Bc+"')");
        } catch (SQLException e) {
                System.out.println("Error Insert Into! "+e);
        }
    }
    
    public List<String[]> viewArusKas(JLabel tglVw) {
        List<String[]> result = new ArrayList<String[]>();
        String tanggal = tglVw.getText().trim();

        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT `ID_ARUSKAS`, `TGL_ARUSKAS`,`SALDO_AWAL`, "
                    + "`JUMLAH_PENDAPATAN`, `JUMLAH_PEMASUKAN`, `JUMLAH_PENGELUARAN`, "
                    + "`SALDO_AKHIR`, `SETORAN`, `SISA_USAHA`, `tunai`, `bank A`, `bank b`, `bank c` "
                    + "FROM `aruskas` "
                    + "WHERE `TGL_ARUSKAS`= '"+tanggal+"'");
            
            while(r.next()){
            String[] ss = new String[13]; 
            ss[0]=r.getString("ID_ARUSKAS");
            ss[1]=r.getString("TGL_ARUSKAS");
            ss[2]=r.getString("SALDO_AWAL");
            ss[3]=r.getString("JUMLAH_PENDAPATAN");
            ss[4]=r.getString("tunai");
            ss[5]=r.getString("bank A");
            ss[6]=r.getString("bank b");
            ss[7]=r.getString("bank c");
            ss[8]=r.getString("JUMLAH_PEMASUKAN");
            ss[9]=r.getString("JUMLAH_PENGELUARAN");
            ss[10]=r.getString("SALDO_AKHIR");
            ss[11]=r.getString("SETORAN");
            ss[12]=r.getString("SISA_USAHA");
            
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error :" +e);
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
            ResultSet r=s.executeQuery("SELECT `ID_ARUSKAS`, `TGL_ARUSKAS`,`SALDO_AWAL`, "
                    + "`JUMLAH_PENDAPATAN`, `JUMLAH_PEMASUKAN`, `JUMLAH_PENGELUARAN`, "
                    + "`SALDO_AKHIR`, `SETORAN`, `SISA_USAHA`,`tunai`, `bank A`, `bank b`, `bank c` "
                    + "FROM `aruskas` "
                    + "where `TGL_ARUSKAS` = '"+search+"'\n" +
                    "or `SALDO_AWAL` like '%"+search+"%'\n" +
                    "or `JUMLAH_PENDAPATAN` like '%"+search+"%'"
                    + "or `JUMLAH_PEMASUKAN` like '%"+search+"%'"
                    + "or `JUMLAH_PENGELUARAN` like '%"+search+"%'"
                    + "or `SALDO_AKHIR` like '%"+search+"%'"
                    + "or `SETORAN` like '%"+search+"%'"
                    + "or `SISA_USAHA` like '%"+search+"%'");
            while(r.next()){
            String[] ss = new String[13]; 
            ss[0]=r.getString("ID_ARUSKAS");
            ss[1]=r.getString("TGL_ARUSKAS");
            ss[2]=r.getString("SALDO_AWAL");
            ss[3]=r.getString("JUMLAH_PENDAPATAN");
            ss[4]=r.getString("tunai");
            ss[5]=r.getString("bank A");
            ss[6]=r.getString("bank b");
            ss[7]=r.getString("bank c");
            ss[8]=r.getString("JUMLAH_PEMASUKAN");
            ss[9]=r.getString("JUMLAH_PENGELUARAN");
            ss[10]=r.getString("SALDO_AKHIR");
            ss[11]=r.getString("SETORAN");
            ss[12]=r.getString("SISA_USAHA");
            
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error :" +e);
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
            ResultSet r=s.executeQuery("SELECT @no := @no +1 AS ID_ARUSKAS, TGL_ARUSKAS,SALDO_AWAL,JUMLAH_PENDAPATAN, JUMLAH_PEMASUKAN,\n" +
            "JUMLAH_PENGELUARAN, SALDO_AKHIR, SETORAN, SISA_USAHA, `tunai`, `bank A`, `bank b`, `bank c`\n" +
            "FROM aruskas,(SELECT @no :=0) AS no\n" +
            "WHERE TGL_ARUSKAS BETWEEN '"+dateAwl+"' AND '"+dateAkh+"'");
            while(r.next()){
            String[] ss = new String[13]; 
            ss[0]=r.getString("ID_ARUSKAS");
            ss[1]=r.getString("TGL_ARUSKAS");
            ss[2]=r.getString("SALDO_AWAL");
            ss[3]=r.getString("JUMLAH_PENDAPATAN");
            ss[4]=r.getString("tunai");
            ss[5]=r.getString("bank A");
            ss[6]=r.getString("bank b");
            ss[7]=r.getString("bank c");
            ss[8]=r.getString("JUMLAH_PEMASUKAN");
            ss[9]=r.getString("JUMLAH_PENGELUARAN");
            ss[10]=r.getString("SALDO_AKHIR");
            ss[11]=r.getString("SETORAN");
            ss[12]=r.getString("SISA_USAHA");
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error :" +e);
        }
        return result;
    }

    public List<String[]> lapBulan(int tahunAwl, int tahunAkh, String xdateAwl, String xdateAkh) {
        //To change body of generated methods, choose Tools | Templates.
            List<String[]> result = new ArrayList<String[]>();
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT @no := @no +1 AS ID_ARUSKAS, DATE_FORMAT( tgl_aruskas,  '%Y-%m-%d' ) AS TGL_ARUSKAS, \n" +
            "saldo_awal,jumlah_pendapatan,jumlah_pemasukan,jumlah_pengeluaran,\n" +
            "saldo_akhir, setoran,sisa_usaha, `tunai`, `bank A`, `bank b`, `bank c` \n" +
            "	FROM aruskas , (SELECT @no :=0) AS no" +
            "	WHERE DATE_FORMAT( tgl_aruskas,  '%Y-%m' )= '"+tahunAwl+"-"+xdateAwl+"'");
            while(r.next()){
            String[] ss = new String[13]; 
            ss[0]=r.getString("ID_ARUSKAS");
            ss[1]=r.getString("TGL_ARUSKAS");
            ss[2]=r.getString("SALDO_AWAL");
            ss[3]=r.getString("JUMLAH_PENDAPATAN");
            ss[4]=r.getString("tunai");
            ss[5]=r.getString("bank A");
            ss[6]=r.getString("bank b");
            ss[7]=r.getString("bank c");
            ss[8]=r.getString("JUMLAH_PEMASUKAN");
            ss[9]=r.getString("JUMLAH_PENGELUARAN");
            ss[10]=r.getString("SALDO_AKHIR");
            ss[11]=r.getString("SETORAN");
            ss[12]=r.getString("SISA_USAHA");
            
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error :" +e);
        }
        return result;
    
    }

    public List<String[]> lapPerBulan(int tahunAwl, int tahunAkh, String xdateAwl, String xdateAkh) {
        //To change body of generated methods, choose Tools | Templates.
         List<String[]> result = new ArrayList<String[]>();
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT @no := @no +1 AS ID_ARUSKAS, DATE_FORMAT( tgl_aruskas,  '%Y/%m' ) AS TGL_ARUSKAS, \n" +
            "SUM(saldo_awal) AS saldo_awal, SUM(jumlah_pendapatan) AS jumlah_pendapatan,\n" +
            "SUM(jumlah_pemasukan) AS jumlah_pemasukan,SUM(jumlah_pengeluaran ) AS jumlah_pengeluaran,\n" +
            "SUM(saldo_akhir ) AS saldo_akhir, SUM(setoran) AS setoran,\n" +
            "SUM(sisa_usaha) AS sisa_usaha, sum(`tunai`) as tunai, sum(`bank A`) as `bank A`, sum(`bank b`) as `bank b`, "
                    + "sum(`bank c`) as `bank c`\n" +
            "	FROM aruskas , (SELECT @no :=0) AS no" +
            "	WHERE DATE_FORMAT( tgl_aruskas,  '%Y-%m' ) \n" +
            "	BETWEEN  '"+tahunAwl+"-"+xdateAwl+"'\n" +
            "	AND  '"+tahunAkh+"-"+xdateAkh+"'\n" +
            "	GROUP BY DATE_FORMAT( tgl_aruskas,  '%Y-%m' )");
            while(r.next()){
            String[] ss = new String[13]; 
            ss[0]=r.getString("ID_ARUSKAS");
            ss[1]=r.getString("TGL_ARUSKAS");
            ss[2]=r.getString("SALDO_AWAL");
            ss[3]=r.getString("JUMLAH_PENDAPATAN");
            ss[4]=r.getString("tunai");
            ss[5]=r.getString("bank A");
            ss[6]=r.getString("bank b");
            ss[7]=r.getString("bank c");
            ss[8]=r.getString("JUMLAH_PEMASUKAN");
            ss[9]=r.getString("JUMLAH_PENGELUARAN");
            ss[10]=r.getString("SALDO_AKHIR");
            ss[11]=r.getString("SETORAN");
            ss[12]=r.getString("SISA_USAHA");
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error :" +e);
        }
        return result;
    
    }
    
}
