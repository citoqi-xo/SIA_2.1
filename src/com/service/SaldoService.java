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
public class SaldoService {

     public void addMat(JFormattedTextField iSaldo, JFormattedTextField iTotalSaldo,JFormattedTextField iTtlPem) {
        //To change body of generated methods, choose Tools | Templates.
        String TTL_SALDO, NOM_SALDO,TTL_PEM;
        NOM_SALDO = String.valueOf(iSaldo.getValue());
        TTL_SALDO= String.valueOf(iTotalSaldo.getValue());
        TTL_PEM=String.valueOf(iTtlPem.getValue());
        
            BigDecimal TTLpem = new BigDecimal(TTL_PEM);
            BigDecimal nomSaldo = new BigDecimal(NOM_SALDO);
            BigDecimal TTLSaldo = new BigDecimal(TTL_SALDO);
            
        if (TTL_PEM==null){
            BigDecimal zz = nomSaldo.add(TTLSaldo);
            iTotalSaldo.setValue(zz);
            iTtlPem.setValue(zz);
        }else{
            BigDecimal zz = nomSaldo.add(TTLSaldo);
            BigDecimal zzz = nomSaldo.add(TTLpem);
            iTotalSaldo.setValue(zz);
            iTtlPem.setValue(zzz);
        }
     }

    public void editMat(JFormattedTextField iSaldo, JFormattedTextField Bay, JFormattedTextField iTotalSaldo, JFormattedTextField iTtlPem) {
       //To change body of generated methods, choose Tools | Templates.
        String TTL_SALDO,NOM_BYG, NOM_SALDO,TTL_PEM,NOM_BAY;
        NOM_SALDO = String.valueOf(iSaldo.getValue());
        NOM_BAY = Bay.getText();
        TTL_SALDO= String.valueOf(iTotalSaldo.getValue());
        TTL_PEM=String.valueOf(iTtlPem.getValue());
            BigDecimal TTLpem = new BigDecimal(TTL_PEM);
            BigDecimal nomSaldo = new BigDecimal(NOM_SALDO);
            BigDecimal nomByg = new BigDecimal(NOM_BAY);
            BigDecimal TTLSaldo = new BigDecimal(TTL_SALDO);
            
             if(nomByg.compareTo(nomSaldo) < 0){//nomSld>nomByg
                 BigDecimal zzz = nomSaldo.subtract(nomByg);
                 BigDecimal zz =  TTLSaldo.add(zzz);
                 BigDecimal yy = zzz.add(TTLpem);
                 iTotalSaldo.setValue(zz);
                 iTtlPem.setValue(yy);
            } else{
                 BigDecimal zzz = nomByg.subtract(nomSaldo);
                 BigDecimal zz =  TTLSaldo.subtract(zzz);
                 BigDecimal yy = TTLpem.subtract(zzz);
                 iTotalSaldo.setValue(zz);
                 iTtlPem.setValue(yy);
             }
            
    }

    public void delMat(JFormattedTextField Bay,JFormattedTextField iTotalSaldo,JFormattedTextField iTtlPem) {
         //To change body of generated methods, choose Tools | Templates.
        String TTL_SALDO, NOM_BAY,TTL_PEM;
        
        NOM_BAY = Bay.getText();
        TTL_SALDO= String.valueOf(iTotalSaldo.getValue());
        TTL_PEM=String.valueOf(iTtlPem.getValue());


            BigDecimal TTLpem = new BigDecimal(TTL_PEM);
            BigDecimal nomSaldo = new BigDecimal(NOM_BAY);
            BigDecimal TTLSaldo = new BigDecimal(TTL_SALDO);
            BigDecimal zz = TTLSaldo.subtract(nomSaldo);
            BigDecimal yy = TTLpem.subtract(nomSaldo);
         iTotalSaldo.setValue(zz);
         iTtlPem.setValue(yy);
    }
  
}

   
    
//    private double MatSaldo(){
//
//        double nomSaldo = Double.parseDouble(isiSaldo.getText());
//        double byNomSaldo = Double.parseDouble(BynganNom.getText());
//        double ttlSaldo = Double.parseDouble(isiTotalSaldo.getText());
//        double s = 0;
//       
//        if(ttlSaldo!=0&&byNomSaldo!=0){
//            if (nomSaldo>byNomSaldo) {
//            double w = nomSaldo-byNomSaldo;
//            double ww = ttlSaldo+w;
//            s=ww;
//            }else if(nomSaldo<byNomSaldo){
//            double wc = byNomSaldo-nomSaldo;
//            double wcw = ttlSaldo-wc;
//            s=wcw;
////            }else if(nomSaldo==byNomSaldo){
////            double wcw = ttlSaldo-nomSaldo;
////            s=wcw;
//            }
//        } else if (nomSaldo!=0&byNomSaldo==0) {
//            double zz = ttlSaldo+nomSaldo;
//            s=zz;
//        }
//        return s;
//        
//    }
//     
//    private void upteSaldo(){
//        String a = Double.toString(MatSaldo());
//        if(MatSaldo()>=0){
//            saldoQue.editTotalSaldo(tglVw, a);
//            BynganNom.setText("0");
//            clear();
//        } else{
//            BynganNom.setText("0");
//            JOptionPane.showMessageDialog(this, "Saldo Habis! Mohon Isikan Saldo Dahulu");
//        }
//    }
//    
    

