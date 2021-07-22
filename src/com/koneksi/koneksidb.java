/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ARCH
 */
public class koneksidb {
    private static Connection koneksi;

    public Connection getConnection() throws SQLException {
        if (koneksi == null) {
            // panggil Driver MySQL
            try {
                String url = "jdbc:mysql://localhost:3306/test";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);

            } catch (SQLException e) {
                System.out.println("Terjadi Error conection di koneksi : "+e);
                
            }
        }
        return koneksi;
    }
}
