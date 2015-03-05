/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.djuma;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SULAIMAN
 */
public class Individual {
    private int id;
    private String ownerSurname="";
    private String ownerFirstName="";
    private String dob="";
    private Date dob1;
    private String deceadDate="";
    private Date deceadDate1;
    private String gender="";
    private String occupation="";
    private String nationality="";
    private String  nationalId="";
    private String socialSecurityNumber="";
    private String passport="";
    private String homePhone;
    private String  workPhone="";
    private String cellPhone="";
    private String faxNo="";
    private String  resident="";
    private boolean resident1;
    private String countryOfResidence="";
    private String  taxpayerType="";
    private String taxType="";
    private String  civilStatus="";
    private String  mariageName="";
    private String  mariageSurname="";
    private String mariageDob="";
    private Date mariageDob1;
    private String plotNo="";
    private String street="";
    private String  cellule="";
    private String sector="";
    private String district="";
    private String province="";
    private String mailingAddress="";
    private String mailHouseNo="";
    private String mailStreet="";
    private String  mailPoBox="";
    private String mailCity="";
    private String  mailCellule="";
    private String  mailSector="";
    private String mailDistrict="";
    private String mailProvince="";
    private String taxpayerRepresentativeName="";
    private String representativeTitle="";
    private String representativePhoneNo="";
    private String contactName="";
    private String contactTitle="";
    private String contactPhoneNo="";
    private String error;
    private String info;
    private boolean deletedStatus=false;
    private Timestamp doneAt=new Timestamp(new Date().getTime());
    private String doneBy="";
    private boolean valid=true;
    private String errorMariageDob;
    private String errorDob;
    private String errordecead;

    public Date getDob1() {
        return dob1;
    }

    public void setDob1(Date dob1) {
        this.dob1 = dob1;
    }

    public Date getDeceadDate1() {
        return deceadDate1;
    }

    public void setDeceadDate1(Date deceadDate1) {
        this.deceadDate1 = deceadDate1;
    }

    public boolean isResident1() {
        return resident1;
    }

    public void setResident1(boolean resident1) {
        this.resident1 = resident1;
    }

    public Date getMariageDob1() {
        return mariageDob1;
    }

    public void setMariageDob1(Date mariageDob1) {
        this.mariageDob1 = mariageDob1;
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

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public void setOwnerSurname(String ownerSurname) {
        this.ownerSurname = ownerSurname;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
        try{
        SimpleDateFormat j=new SimpleDateFormat("dd/MM/yyyy");
        dob1=j.parse(dob);
        }catch(Exception e){
        valid=false;
        }
    }

    public String getDeceadDate() {
        return deceadDate;
    }

    public void setDeceadDate(String deceadDate) {
        this.deceadDate = deceadDate;
        try{
        SimpleDateFormat j=new SimpleDateFormat("dd/MM/yyyy");
        deceadDate1=j.parse(deceadDate);
        }catch(Exception e){
        valid=false;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getFaxNo() {
        return faxNo;
    }

    public void setFaxNo(String faxNo) {
        this.faxNo = faxNo;
    }

    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
        try{
        resident1=Boolean.parseBoolean(resident);
        }catch(Exception e){
            valid=false;
        }
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getTaxpayerType() {
        return taxpayerType;
    }

    public void setTaxpayerType(String taxpayerType) {
        this.taxpayerType = taxpayerType;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public String getMariageName() {
        return mariageName;
    }

    public void setMariageName(String mariageName) {
        this.mariageName = mariageName;
    }

    public String getMariageSurname() {
        return mariageSurname;
    }

    public void setMariageSurname(String mariageSurname) {
        this.mariageSurname = mariageSurname;
    }

    public String getMariageDob() {
        return mariageDob;
    }

    public void setMariageDob(String mariageDob) {
        this.mariageDob = mariageDob;
        try{
            SimpleDateFormat j=new SimpleDateFormat("dd/MM/yyyy");
            mariageDob1=j.parse(mariageDob);
        }catch(Exception e){
            errorMariageDob="The date should have this format: dd/MM/yyyy";
        valid=false;
        }
    }

    public String getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCellule() {
        return cellule;
    }

    public void setCellule(String cellule) {
        this.cellule = cellule;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getMailHouseNo() {
        return mailHouseNo;
    }

    public void setMailHouseNo(String mailHouseNo) {
        this.mailHouseNo = mailHouseNo;
    }

    public String getMailStreet() {
        return mailStreet;
    }

    public void setMailStreet(String mailStreet) {
        this.mailStreet = mailStreet;
    }

    public String getMailPoBox() {
        return mailPoBox;
    }

    public void setMailPoBox(String mailPoBox) {
        this.mailPoBox = mailPoBox;
    }

    public String getMailCity() {
        return mailCity;
    }

    public void setMailCity(String mailCity) {
        this.mailCity = mailCity;
    }

    public String getMailCellule() {
        return mailCellule;
    }

    public void setMailCellule(String mailCellule) {
        this.mailCellule = mailCellule;
    }

    public String getMailSector() {
        return mailSector;
    }

    public void setMailSector(String mailSector) {
        this.mailSector = mailSector;
    }

    public String getMailDistrict() {
        return mailDistrict;
    }

    public void setMailDistrict(String mailDistrict) {
        this.mailDistrict = mailDistrict;
    }

    public String getMailProvince() {
        return mailProvince;
    }

    public void setMailProvince(String mailProvince) {
        this.mailProvince = mailProvince;
    }

    public String getTaxpayerRepresentativeName() {
        return taxpayerRepresentativeName;
    }

    public void setTaxpayerRepresentativeName(String taxpayerRepresentativeName) {
        this.taxpayerRepresentativeName = taxpayerRepresentativeName;
    }

    public String getRepresentativeTitle() {
        return representativeTitle;
    }

    public void setRepresentativeTitle(String representativeTitle) {
        this.representativeTitle = representativeTitle;
    }

    public String getRepresentativePhoneNo() {
        return representativePhoneNo;
    }

    public void setRepresentativePhoneNo(String representativePhoneNo) {
        this.representativePhoneNo = representativePhoneNo;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getContactPhoneNo() {
        return contactPhoneNo;
    }

    public void setContactPhoneNo(String contactPhoneNo) {
        this.contactPhoneNo = contactPhoneNo;
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

    public boolean isDeletedStatus() {
        return deletedStatus;
    }

    public void setDeletedStatus(boolean deletedStatus) {
        this.deletedStatus = deletedStatus;
    }

    public Individual() {
    }
    
    public void save(){
    try{
        if(valid){
        PreparedStatement st=SetCon.getCon().prepareStatement("insert into individual values(id,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        st.setString(1, ownerSurname);
        st.setString(2, ownerFirstName);
        st.setDate(3, new java.sql.Date(dob1.getTime()));
        st.setDate(4, new java.sql.Date(deceadDate1.getTime()));
        st.setString(5, gender);
        st.setString(6, occupation);
        st.setString(7, nationality);
        st.setString(8, nationalId);
        st.setString(9, socialSecurityNumber);
        st.setString(10, passport);
        st.setString(11, homePhone);
        st.setString(12, workPhone);
        st.setString(13, cellPhone);
        st.setString(14, faxNo);
        st.setBoolean(15, resident1);
        st.setString(16, countryOfResidence);
        st.setInt(17, Integer.parseInt(taxpayerType));
        st.setInt(18, Integer.parseInt(taxType));
        st.setString(19, civilStatus);
        st.setString(20, mariageName);
        st.setString(21, mariageSurname);
        st.setDate(22, new java.sql.Date(mariageDob1.getTime()));
        st.setString(23, plotNo);
        st.setString(24, street);
        st.setString(25, cellule);
        st.setString(26, sector);
        st.setString(27, district);
        st.setString(28, province);
        st.setString(29, mailingAddress);
        st.setString(30, mailHouseNo);
        st.setString(31, mailStreet);
        st.setString(32, mailPoBox);
        st.setString(33, mailCity);
        st.setString(34, mailCellule);
        st.setString(35, mailSector);
        st.setString(36, mailDistrict);
        st.setString(37, mailProvince);
        st.setString(38, taxpayerRepresentativeName);
        st.setString(39, representativeTitle);
        st.setString(40, representativePhoneNo);
        st.setString(41, contactName);
        st.setString(42, contactTitle);
        st.setString(43, contactPhoneNo);
        st.setTimestamp(44, doneAt);
        st.setString(45, doneBy);
        st.setBoolean(46, deletedStatus);
        st.execute();
        info="Registration done successfull";
        }
    }catch(Exception e){
    error="Try Again";
    valid=false;
    }
    
    }
    
    public static List<Individual>listIndividual(){
    List<Individual>list=new ArrayList<>();
        try{
    PreparedStatement st=SetCon.getCon().prepareStatement("select * from individual");
            ResultSet rs=st.executeQuery();
            while(rs.next()){
            Individual i=new Individual();
            i.setId(rs.getInt(1));
            i.setOwnerSurname(rs.getString(2));
            i.setOwnerFirstName(rs.getString(3));
            i.setDob1(rs.getDate(4));
            i.setDeceadDate1(rs.getDate(5));
            i.setGender(rs.getString(6));
            i.setOccupation(rs.getString(7));
            i.setNationality(rs.getString(8));
            i.setNationalId(rs.getString(9));
            i.setSocialSecurityNumber(rs.getString(10));
            i.setPassport(rs.getString(11));
            i.setHomePhone(rs.getString(12));
            i.setWorkPhone(rs.getString(13));
            i.setCellPhone(rs.getString(14));
            i.setFaxNo(rs.getString(15));
            i.setResident1(rs.getBoolean(16));
            i.setCountryOfResidence(rs.getString(17));
            i.setTaxpayerType(rs.getInt(18)+"");
            i.setTaxType(rs.getInt(19)+"");
            i.setCivilStatus(rs.getString(20));
            i.setMariageName(rs.getString(21));
            i.setMariageSurname(rs.getString(22));
            i.setMariageDob1(rs.getDate(23));
            i.setPlotNo(rs.getString(24));
            i.setStreet(rs.getString(25));
            i.setCellule(rs.getString(26));
            i.setSector(rs.getString(27));
            i.setDistrict(rs.getString(28));
            i.setProvince(rs.getString(29));
            i.setMailingAddress(rs.getString(30));
            i.setMailHouseNo(rs.getString(31));
            i.setMailStreet(rs.getString(32));
            i.setMailPoBox(rs.getString(33));
            i.setMailCity(rs.getString(34));
            i.setMailCellule(rs.getString(35));
            i.setMailSector(rs.getString(36));
            i.setMailDistrict(rs.getString(37));
            i.setMailProvince(rs.getString(38));
            i.setTaxpayerRepresentativeName(rs.getString(39));
            i.setRepresentativeTitle(rs.getString(40));
            i.setRepresentativePhoneNo(rs.getString(41));
            i.setContactName(rs.getString(42));
            i.setContactTitle(rs.getString(43));
            i.setContactPhoneNo(rs.getString(44));
            i.setDoneAt(rs.getTimestamp(45));
            i.setDoneBy(rs.getString(46));
            i.setDeletedStatus(rs.getBoolean(47));
            list.add(i);
            
            }
    }catch(Exception e){
    
    }
        return list;
    }
    
}
