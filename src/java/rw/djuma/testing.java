/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.djuma;

/**
 *
 * @author SULAIMAN
 */
public class testing {
    public static void main(String...args){
    TaxType t=new TaxType();
    t.setTaxType("PIT");
    t.setDoneBy("Djuma");
    //t.save();
    Individual i=new Individual();
    i.setOwnerSurname("Djuma");
    i.setDob("11/12/1990");
    i.setResident("1");
    i.setMariageDob("11/12/1989");
    i.setTaxType("1");
    i.setTaxpayerType("2");
    //i.save();
    }
}
