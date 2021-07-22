/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.math.BigDecimal;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

/**
 *
 * @author ARCH
 */
public class PembelianService {

    public void tambah(JFormattedTextField iTtlBr, JFormattedTextField iTtlPeng, JFormattedTextField iTtlPem) {
        //To change body of generated methods, choose Tools | Templates.
        String TTL_peng, NOM_pemb,TTL_PEM;
        NOM_pemb = String.valueOf(iTtlBr.getValue());
        TTL_peng= String.valueOf(iTtlPeng.getValue());
        TTL_PEM=String.valueOf(iTtlPem.getValue());
            
            BigDecimal TTLpem = new BigDecimal(TTL_PEM);
            BigDecimal nomPemb = new BigDecimal(NOM_pemb);
            BigDecimal TTLPemb = new BigDecimal(TTL_peng);
            
            BigDecimal zz = nomPemb.add(TTLPemb);
            BigDecimal yyy = TTLpem.subtract(nomPemb);
            
         iTtlPeng.setValue(zz);
         iTtlPem.setValue(yyy);
    }

    public void edit(String ttlByr, JFormattedTextField iTtlBr, JFormattedTextField iTtlPeng, JFormattedTextField iTtlPem) {
        //To change body of generated methods, choose Tools | Templates.
        String TTL_peng, NOM_pemb,TTL_PEM,Nom_pemBy;
        NOM_pemb = String.valueOf(iTtlBr.getValue());
        TTL_peng= String.valueOf(iTtlPeng.getValue());
        TTL_PEM=String.valueOf(iTtlPem.getValue());
            
            BigDecimal nomPembBy = new BigDecimal(ttlByr);
            BigDecimal TTLpem = new BigDecimal(TTL_PEM);
            BigDecimal nomPemb = new BigDecimal(NOM_pemb);
            BigDecimal TTLPemb = new BigDecimal(TTL_peng);
            
            if( nomPembBy.compareTo(nomPemb) < 0){//nomSld>nomByg
                 BigDecimal zzz = nomPemb.subtract(nomPembBy);
                 BigDecimal zz =  TTLPemb.add(zzz);
                 BigDecimal yy = TTLpem.subtract(zzz);
                 iTtlPeng.setValue(zz);
                 iTtlPem.setValue(yy);
            } else{
                 BigDecimal zzz = nomPembBy.subtract(nomPemb);
                 BigDecimal zz =  TTLPemb.subtract(zzz);
                 BigDecimal yy = zzz.add(TTLpem);
                 iTtlPeng.setValue(zz);
                 iTtlPem.setValue(yy);
             }
    }

    public void delMat(String ttlByr,JFormattedTextField iTtlPeng, JFormattedTextField iTtlPem) {
       //To change body of generated methods, choose Tools | Templates.
        String TTL_peng, NOM_pemb,TTL_PEM,Nom_pemBy;
        TTL_peng= String.valueOf(iTtlPeng.getValue());
        TTL_PEM=String.valueOf(iTtlPem.getValue());
        
            BigDecimal nomPemb = new BigDecimal(ttlByr);
            BigDecimal TTLpem = new BigDecimal(TTL_PEM);
            BigDecimal TTLPemb = new BigDecimal(TTL_peng);         
        
                BigDecimal zz =  TTLPemb.subtract(nomPemb);
                BigDecimal yy = nomPemb.add(TTLpem);
                iTtlPeng.setValue(zz);
                iTtlPem.setValue(yy);
    }
    
}
