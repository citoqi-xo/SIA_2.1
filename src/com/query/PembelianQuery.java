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
public class PembelianQuery {
     koneksidb conn = new koneksidb();
     
      public List<String[]> viewTotalPembelian(JLabel tglVw) {
        List<String[]> result = new ArrayList<String[]>();
        String tanggal = tglVw.getText().trim();

        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT i.ID_PEMBELIAN, i.TGL_PEMBELIAN, p.nama_petugas, "
                                       +"i.NAMA_PEMBELIAN, i.JUMLAH_PEMBELIAN, i.HARGA_BP, i.HARGA_JBP, i.KET_PEMBELIAN\n" +
                                        "FROM petugas AS p JOIN pembelian AS i\n" +
                                        "WHERE i.TGL_PEMBELIAN = '"+tanggal+"'" +
                                        "AND i.kode_petugas = p.kode_petugas");
            while(r.next()){
            String[] ss = new String[8]; 
            ss[0]=r.getString("i.ID_PEMBELIAN");
            ss[1]=r.getString("i.TGL_PEMBELIAN");
            ss[2]=r.getString("p.nama_petugas");
            ss[3]=r.getString("i.NAMA_PEMBELIAN");
            ss[4]=r.getString("i.KET_PEMBELIAN");
            ss[5]=r.getString("i.JUMLAH_PEMBELIAN");
            ss[6]=r.getString("i.HARGA_BP");
            ss[7]=r.getString("i.HARGA_JBP");
            
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error tampil pembelian:" +e);
        }
        return result;
    }

   public void insertIntoPembelian(JLabel tglVw,String IdUser, JTextField iNamaBr, JFormattedTextField iHargaBr1, JFormattedTextField iJmlBr, JFormattedTextField iTtlBr,JTextField ketPem){
        //To change body of generated methods, choose Tools | Templates.
        String tanggal,kode_petugas,nama_pemb,Jum,hargabp,hargattl,TGLpeng,KetPEMB;
        tanggal = tglVw.getText();
        nama_pemb = iNamaBr.getText();
        KetPEMB=ketPem.getText();
        Jum = String.valueOf(iJmlBr.getValue());//
        hargabp = String.valueOf(iHargaBr1.getValue());//
        hargattl = String.valueOf(iTtlBr.getValue());//
        TGLpeng = tglVw.getText();

        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            int r=s.executeUpdate("INSERT INTO  `test`.`pembelian` (`ID_PEMBELIAN`, "
                    + "`TGL_PENGELUARAN`, `KODE_PETUGAS`, `TGL_PEMBELIAN`, `NAMA_PEMBELIAN`, "
                    + "`JUMLAH_PEMBELIAN`, `HARGA_BP`, `HARGA_JBP`, `KET_PEMBELIAN`)"
                    + "VALUES (NULL ,  '"+tanggal+"',  '"+IdUser+"',  '"+tanggal+"',  '"+nama_pemb+"',  '"+Jum+"',  "
                    + "'"+hargabp+"',  '"+hargattl+"','"+KetPEMB+"')");
        } catch (SQLException e) {
                System.out.println("Error insert into pembelian! "+e);
        }
    }
    
   public void editPembelian(String id, JTextField iNamaBr, JFormattedTextField iHargaBr1, JFormattedTextField iJmlBr, JFormattedTextField iTtlBr, JTextField ketPemb) {
//        String isitotal,tanggal ;
        String tanggalPem,nama_pemb,Jum,hargabp,hargattl,TGLpeng,KETpe;

        nama_pemb = iNamaBr.getText();
        KETpe = ketPemb.getText();
        Jum = String.valueOf(iJmlBr.getValue());//
        hargabp = String.valueOf(iHargaBr1.getValue());//
        hargattl = String.valueOf(iTtlBr.getValue());//
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            int r=s.executeUpdate("UPDATE  `test`.`pembelian` SET  `NAMA_PEMBELIAN` =  '"+nama_pemb+"',"
                    + "`JUMLAH_PEMBELIAN` =  '"+Jum+"',`HARGA_BP`='"+hargabp+"',`HARGA_JBP` =  '"+hargattl+"', "
                    + "`KET_PEMBELIAN`= '"+KETpe+"' "
                    + "WHERE  `pembelian`.`ID_PEMBELIAN` ='"+id+"'");
        } catch (SQLException e) {
                System.out.println("Error edit Pembelian! "+e);
        }
     }
      
      public void delPembelian(String id){
          try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
             int r=s.executeUpdate("DELETE FROM `pembelian` "
                                    + "WHERE ID_PEMBELIAN ='"+id+"'");
        } catch (SQLException e) {
                System.out.println("Error del pembelian! "+e);
        }
      }

    public List<String[]> fcSelectCommand(JTextField txtSearch) {
        //To change body of generated methods, choose Tools | Templates.
        List<String[]> result = new ArrayList<String[]>();
        String search = txtSearch.getText().trim();
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT i.ID_PEMBELIAN, i.TGL_PEMBELIAN, p.nama_petugas, "
                                       +"i.NAMA_PEMBELIAN, i.JUMLAH_PEMBELIAN, i.HARGA_BP, i.HARGA_JBP, i.KET_PEMBELIAN\n" +
                                        "FROM petugas AS p JOIN pembelian AS i\n"
                    + "ON p.kode_petugas=i.kode_petugas\n" +
                    "where p.nama_petugas = '"+search+"'\n" +
                    "or i.NAMA_PEMBELIAN like '%"+search+"%'\n"
                    + "or i.KET_PEMBELIAN like '%"+search+"%'" +
                    "or i.TGL_PEMBELIAN like '%"+search+"%'");
            while(r.next()){
            String[] ss = new String[8]; 
            ss[0]=r.getString("i.ID_PEMBELIAN");
            ss[1]=r.getString("i.TGL_PEMBELIAN");
            ss[2]=r.getString("p.nama_petugas");
            ss[3]=r.getString("i.NAMA_PEMBELIAN");
            ss[4]=r.getString("i.KET_PEMBELIAN");
            ss[5]=r.getString("i.JUMLAH_PEMBELIAN");
            ss[6]=r.getString("i.HARGA_BP");
            ss[7]=r.getString("i.HARGA_JBP");
            
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error fc Search pembelian :" +e);
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
            ResultSet r=s.executeQuery("SELECT @no := @no +1 AS ID_PEMBELIAN, i.TGL_PEMBELIAN, p.nama_petugas, i.NAMA_PEMBELIAN, "
                    + "i.JUMLAH_PEMBELIAN, i.HARGA_BP, i.HARGA_JBP, i.KET_PEMBELIAN\n" +
                    "FROM petugas AS p JOIN pembelian AS i,(SELECT @no :=0) AS no\n" +
                    "WHERE i.TGL_PEMBELIAN BETWEEN '"+dateAwl+"' AND '"+dateAkh+"'\n" +
                    "AND i.kode_petugas = p.kode_petugas");
            while(r.next()){
            String[] ss = new String[8]; 
            ss[0]=r.getString("ID_PEMBELIAN");
            ss[1]=r.getString("i.TGL_PEMBELIAN");
            ss[2]=r.getString("p.nama_petugas");
            ss[3]=r.getString("i.NAMA_PEMBELIAN");
            ss[4]=r.getString("i.KET_PEMBELIAN");
            ss[5]=r.getString("i.JUMLAH_PEMBELIAN");
            ss[6]=r.getString("i.HARGA_BP");
            ss[7]=r.getString("i.HARGA_JBP");
            
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
            ResultSet r=s.executeQuery("SELECT @no := @no +1 AS ID_PEMBELIAN, DATE_FORMAT( i.TGL_PEMBELIAN,  '%Y-%m-%d' ) AS TGL_PEMBELIAN, "
                    + "p.nama_petugas, i.NAMA_PEMBELIAN, i.JUMLAH_PEMBELIAN, i.HARGA_BP, i.HARGA_JBP, i.KET_PEMBELIAN\n" +
                    "FROM petugas AS p JOIN pembelian AS i,(SELECT @no :=0) AS no\n" +
                    "WHERE DATE_FORMAT( i.TGL_PEMBELIAN,  '%Y-%m' )= '"+tahunAwl+"-"+xdateAwl+"'\n" +
                    "AND i.kode_petugas = p.kode_petugas");
            while(r.next()){
             String[] ss = new String[8]; 
            ss[0]=r.getString("ID_PEMBELIAN");
            ss[1]=r.getString("TGL_PEMBELIAN");
            ss[2]=r.getString("p.nama_petugas");
            ss[3]=r.getString("i.NAMA_PEMBELIAN");
            ss[4]=r.getString("i.KET_PEMBELIAN");
            ss[5]=r.getString("i.JUMLAH_PEMBELIAN");
            ss[6]=r.getString("i.HARGA_BP");
            ss[7]=r.getString("i.HARGA_JBP");
            
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error :" +e);
        }
        return result;
    
    }

    public List<String[]> lapPerBulan(int tahunAwl, int tahunAkh, String xdateAwl, String xdateAkh) {
        //To change body of generated methods, choose Tools | Templates.
        String thBuAw= ""+tahunAwl+"-"+xdateAwl;
        String thBuAk= ""+tahunAkh+"-"+xdateAkh;
         List<String[]> result = new ArrayList<String[]>();
        try {
            Connection c=conn.getConnection();
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("SELECT DATE_FORMAT( i.TGL_PEMBELIAN,  '%Y/%m' ) AS\n" +
            "TGL_PEMBELIAN,p.nama_petugas, i.nama_PEMBELIAN,i.ket_pembelian, SUM(i.JUMLAH_PEMBELIAN) AS\n" +
            "JUMLAH_PEMBELIAN, i.HARGA_BP, \n" +
            "SUM(i.HARGA_JBP) AS HARGA_JBP\n" +
            "FROM petugas AS p JOIN pembelian AS i\n" +
            "WHERE DATE_FORMAT( i.TGL_PEMBELIAN,  '%Y-%m' ) BETWEEN '"+tahunAwl+"-"+xdateAwl+"' AND '"+tahunAkh+"-"+xdateAkh+"'\n" +
            "AND i.kode_petugas = p.kode_petugas\n" +
            "GROUP BY DATE_FORMAT( i.TGL_PEMBELIAN,  '%Y-%m' ),i.nama_pembelian, i.ket_pembelian");
            while(r.next()){
            String[] ss = new String[8]; 
            ss[1]=r.getString("TGL_PEMBELIAN");
            ss[3]=r.getString("i.NAMA_PEMBELIAN");
            ss[4]=r.getString("i.KET_PEMBELIAN");
            ss[5]=r.getString("JUMLAH_PEMBELIAN");
            ss[6]=r.getString("i.HARGA_BP");
            ss[7]=r.getString("HARGA_JBP");
            
            result.add(ss);
            }
        }catch (SQLException e){
            System.out.println("terjadi error :" +e);
        }
        return result;
    
    }
    


}
