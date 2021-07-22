/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.query.SaldoQuery;
import java.math.BigDecimal;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

/**
 *
 * @author ARCH
 */
public class SubTransService {

     public void addMat(JFormattedTextField iSaldo, JFormattedTextField iTotalSaldo) {
        //To change body of generated methods, choose Tools | Templates.
        String TTL_SALDO, NOM_SALDO,TTL_PEM;
        NOM_SALDO = String.valueOf(iSaldo.getValue());
        TTL_SALDO= String.valueOf(iTotalSaldo.getValue());
       

            BigDecimal nomSaldo = new BigDecimal(NOM_SALDO);
            BigDecimal TTLSaldo = new BigDecimal(TTL_SALDO);
            
        if (TTL_SALDO==null){
            
            iTotalSaldo.setValue(nomSaldo);
        }else{
            BigDecimal zz = nomSaldo.add(TTLSaldo);
            iTotalSaldo.setValue(zz);
            
        }
     }

    public void editMat(JFormattedTextField iSaldo, JFormattedTextField Bay, JFormattedTextField iTotalSaldo) {
       //To change body of generated methods, choose Tools | Templates.
        String TTL_SALDO,NOM_BYG, NOM_SALDO,TTL_PEM,NOM_BAY;
        NOM_SALDO = String.valueOf(iSaldo.getValue());
        NOM_BAY = String.valueOf(Bay.getValue());
        TTL_SALDO= String.valueOf(iTotalSaldo.getValue());
        
            BigDecimal nomSaldo = new BigDecimal(NOM_SALDO);
            BigDecimal nomByg = new BigDecimal(NOM_BAY);
            BigDecimal TTLSaldo = new BigDecimal(TTL_SALDO);
            
             if(nomByg.compareTo(nomSaldo) < 0){//nomSld>nomByg
                 BigDecimal zzz = nomSaldo.subtract(nomByg);
                 BigDecimal zz =  TTLSaldo.add(zzz);
                 iTotalSaldo.setValue(zz);
            } else{
                 BigDecimal zzz = nomByg.subtract(nomSaldo);
                 BigDecimal zz =  TTLSaldo.subtract(zzz);
                 iTotalSaldo.setValue(zz);
             }
            
    }
}