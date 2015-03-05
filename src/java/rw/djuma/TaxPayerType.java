/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.djuma;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SULAIMAN
 */
public class TaxPayerType {
    private int id;
    private String taxpayerType;
    private String error;
    private String info;
    private Timestamp doneAt=new Timestamp(new Date().getTime());
    private boolean deletedStatus=false;
    private String doneBy="";
    private boolean valid=true;

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    
    
    public TaxPayerType(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaxpayerType() {
        return taxpayerType;
    }

    public void setTaxpayerType(String taxpayerType) {
        this.taxpayerType = taxpayerType;
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

    public boolean isDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(boolean deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public String getDoneBy() {
        return doneBy;
    }

    public void setDoneBy(String doneBy) {
        this.doneBy = doneBy;
    }
    public void save(){
    try{
        if(valid){
        PreparedStatement st=SetCon.getCon().prepareStatement("insert into taxPayerType values(id,?,?,?,?)");
        st.setString(1, taxpayerType);
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
    
    public static List<TaxPayerType>listTaxPayerType(){
    List<TaxPayerType>list=new ArrayList<TaxPayerType>();
    
    try{
    PreparedStatement st=SetCon.getCon().prepareStatement("select * from taxPayerType");
        ResultSet rs=st.executeQuery();
        while(rs.next()){
        TaxPayerType t=new TaxPayerType();
        t.setId(rs.getInt(1));
        t.setTaxpayerType(rs.getString(2));
        t.setDoneAt(rs.getTimestamp(3));
        t.setDoneBy(rs.getString(4));
        t.setDeletedStatus(rs.getBoolean(5));
        list.add(t);
        }
    }catch(Exception e){
    
    }
    
    return list;
    }
}
