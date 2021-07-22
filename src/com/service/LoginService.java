/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.koneksi.koneksidb;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author ARCH
 */
public class LoginService {
    koneksidb conn = new koneksidb();
    
    public List<String[]> login (String USER, String pas) throws SQLException{
        List<String[]> result = new ArrayList<String[]>();
        try {
            Connection c = conn.getConnection();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT A.kode_petugas,s.nama_status \n" +
                                    "FROM petugas A, status s \n" +
                                    "WHERE A.nama_petugas = '"+USER+"'\n" +
                                    "AND A.katakunci = '"+pas+"'"
                                  + "AND A.id_status = s.id_status");
            while(r.next()){
            String[] hakakses = new String[2]; 
            hakakses[0]=r.getString("s.nama_status");
            hakakses[1]=r.getString("A.kode_petugas");
            result.add(hakakses);
            }
            
        }
          catch(Exception e) {
           
        }  
        return result;
    }
    
    
    
}
