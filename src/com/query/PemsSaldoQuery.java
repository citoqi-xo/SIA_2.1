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
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ARCH
 */
public class PemsSaldoQuery {
    koneksidb conn = new koneksidb();
    
    public List<String[]> viewSaldoTambahan(JLabel tglVw) {
        List<String[]> result = new ArrayList<String[]>();
        String tanggal = tglVw.getText().trim();

        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT s.id_saldotam, s.TGL_SALDO, p.nama_petugas, s.ISISALDOTAM, s.STATUS_SALDO, s.KET_SALDOTAM\n" +
                        "FROM saldotambahan s, petugas p "
                      + "WHERE s.TGL_SALDO = '"+tanggal+"'"
                      + "and s.kode_petugas = p.kode_petugas");
            
            while(r.next()){
            String[] ss = new String[6]; 
            ss[0]=r.getString("s.id_saldotam");
            ss[1]=r.getString("s.TGL_SALDO");
            ss[2]=r.getString("p.Nama_Petugas");
            ss[3]=r.getString("s.ISISALDOTAM");
            ss[4]=r.getString("s.STATUS_SALDO");
            ss[5]=r.getString("s.KET_SALDOTAM");
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error :" +e);
        }
        return result;
    }
    
    public void insertInto(JLabel tglVw,String userId,JFormattedTextField iSaldo,JComboBox isiKeterangan,JTextField ketSal){
        String TGL_SALDO, NOM_SALDO,KETERANGAN,KETS ;
        NOM_SALDO = String.valueOf(iSaldo.getValue());
        String tanggal = tglVw.getText().trim();
        KETS = ketSal.getText().trim();
        KETERANGAN = isiKeterangan.getSelectedItem().toString();
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            int r=s.executeUpdate("INSERT INTO  `test`.`saldotambahan`" 
                + "(`ID_SALDOTAM`, `TGL_SALDO`, `KODE_PETUGAS`, `ISISALDOTAM`, `STATUS_SALDO`, `KET_SALDOTAM`) "
                + "VALUES (null ,'"+tanggal+"','"+userId+"','"+NOM_SALDO+"','"+KETERANGAN+"','"+KETS+"' )");
        } catch (SQLException e) {
                System.out.println("Error masuk saldo! "+e);
        }
        
    }

    public void delete(JTextField id) {
        //To change body of generated methods, choose Tools | Templates.
        String ID;
        ID = id.getText();
         try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
             int r=s.executeUpdate("DELETE FROM `saldotambahan` "
                                    + "WHERE ID_SALDOTAM ='"+ID+"'");
        } catch (SQLException e) {
                System.out.println("Error masuk saldo! "+e);
        }
    }

    public void edit(JTextField id ,JFormattedTextField iSaldo) {
        //To change body of generated methods, choose Tools | Templates.
        String NOM_SALDO, ID ;
        ID = id.getText();
        NOM_SALDO = String.valueOf(iSaldo.getValue());
        
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            int r=s.executeUpdate("UPDATE  `test`.`saldotambahan` "
                    + "SET  `ISISALDOTAM` =  '"+NOM_SALDO+"' "
                    + "WHERE  `saldotambahan`.`ID_SALDOTAM` ="+ID+"");
        } catch (SQLException e) {
                System.out.println("Error masuk saldo! "+e);
        }
    }

    public List<String[]> fcSelectCommand(JTextField txtSearch1) {
        //To change body of generated methods, choose Tools | Templates.
        List<String[]> result = new ArrayList<String[]>();
        String search = txtSearch1.getText().trim();
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT cs.id_saldotam,cs.tgl_saldo, ps.nama_petugas, cs.isisaldotam, cs.status_saldo,cs.ket_saldotam  "
                    + "FROM petugas as ps JOIN saldotambahan as cs "
                    + "ON ps.kode_petugas=cs.kode_petugas\n" +
                    "where cs.status_saldo = '"+search+"'\n" +
                    "or ps.nama_petugas like '%"+search+"%'\n" +
                    "or cs.tgl_saldo like '%"+search+"%'");
            while(r.next()){
            String[] ss = new String[6]; 
            ss[0]=r.getString("cs.id_saldotam");
            ss[1]=r.getString("cs.TGL_SALDO");
            ss[2]=r.getString("ps.Nama_Petugas");
            ss[3]=r.getString("cs.ISISALDOTAM");
            ss[4]=r.getString("cs.STATUS_SALDO");
            ss[5]=r.getString("cs.KET_SALDOTAM");
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error :" +e);
        }
        return result;
    }

    public void insertStat(String date, String userId, JFormattedTextField iSaldo) {
        //To change body of generated methods, choose Tools | Templates.
        String TGL_SALDO, NOM_SALDO,KETERANGAN ;
        NOM_SALDO = String.valueOf(iSaldo.getValue());
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            int r=s.executeUpdate("INSERT INTO `saldotambahan`(`ID_SALDOTAM`, `TGL_SALDO`, `KODE_PETUGAS`, `ISISALDOTAM`,"
                    + " `STATUS_SALDO`, `KET_SALDOTAM`) "
                    + "VALUES (NULL,'"+date+"','"+userId+"','"+NOM_SALDO+"','saldo usaha','pemilik')");
        } catch (SQLException e) {
                System.out.println("Error Pemasukan Saldo! "+e);
        }
    }

}
