package com.print;

import com.koneksi.koneksidb;
import com.sia.ui.aruskas.ProAruskas;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARCH
 */
public class PengeluaranCtk {
    koneksidb conn = new koneksidb();
    HashMap param = new HashMap();
    public void CetPr(String file){
//        try{
//         Connection c = conn.getConnection();
//            param.clear();
//            //String file = "/laporan/report2.jrxml";
//            InputStream url =getClass().getResourceAsStream(file);
//            JasperDesign dis = JRXmlLoader.load(url);
//            JasperReport rep = JasperCompileManager.compileReport(dis);
//            JasperPrint jasPrint = JasperFillManager.fillReport(rep, param,c);
//
//          JasperViewer.viewReport(jasPrint,false);
//        }catch (Exception ex){
//            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
   
    public void cetPeriode(String file, String dateAwl, String dateAkh){
        try{
         Connection c = conn.getConnection();
            param.put("tglAwl",dateAwl);
            param.put("tglAkh",dateAkh);
            InputStream url =getClass().getResourceAsStream(file);
            JasperDesign dis = JRXmlLoader.load(url);
            JasperReport rep = JasperCompileManager.compileReport(dis);
            JasperPrint jasPrint = JasperFillManager.fillReport(rep, param,c);

          JasperViewer.viewReport(jasPrint,false);
        }catch (Exception ex){
            Logger.getLogger(ProAruskas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cetBulan(String file, String xTahunAwl){
        try{
         Connection c = conn.getConnection();
            param.put("thBu", xTahunAwl);
            InputStream url =getClass().getResourceAsStream(file);
            JasperDesign dis = JRXmlLoader.load(url);
            JasperReport rep = JasperCompileManager.compileReport(dis);
            JasperPrint jasPrint = JasperFillManager.fillReport(rep, param,c);

          JasperViewer.viewReport(jasPrint,false);
        }catch (Exception ex){
            Logger.getLogger(ProAruskas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cetPerBulan(String file, String xTahunAwl,String xTahunAkh){
        
        try{
         Connection c = conn.getConnection();
            param.put("thnAwl",xTahunAwl);
            param.put("thnAkh",xTahunAkh);
            InputStream url =getClass().getResourceAsStream(file);
            JasperDesign dis = JRXmlLoader.load(url);
            JasperReport rep = JasperCompileManager.compileReport(dis);
            JasperPrint jasPrint = JasperFillManager.fillReport(rep, param,c);

          JasperViewer.viewReport(jasPrint,false);
        }catch (Exception ex){
            Logger.getLogger(ProAruskas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
