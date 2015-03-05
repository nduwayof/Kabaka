/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.djuma;

import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author SULAIMAN
 */
public class TaxType {
    private int id;
    private String taxType;
    private String error;
    private String info;
    private Timestamp doneAt=new Timestamp(new Date().getTime());
    private String doneBy="";
    private boolean deletedStatus=false;
    private boolean valid=true;

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Timestamp getDoneAt() {
        return doneAt;
    }

    public void setDoneAt(Timestamp doneAt) {
        this.doneAt = doneAt;
    }

    public String getDoneBy() {
        return doneBy;
    }

    public void setDoneBy(String doneBy) {
        this.doneBy = doneBy;
    }

    public boolean isDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(boolean deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public TaxType() {
    }
    
   public void save(){
   try{
       if(valid){
       PreparedStatement st=SetCon.getCon().prepareStatement("insert into taxType values(id,?,?,?,?)");
       st.setString(1, taxType);
        st.setTimestamp(2, doneAt);
        st.setString(3, doneBy);
        st.setBoolean(4, deletedStatus);
        st.execute();
        info="New TaxPayerType Added";
       }
   }catch(Exception e){
   error="Try Again";
   valid=false;
   }
   }
}