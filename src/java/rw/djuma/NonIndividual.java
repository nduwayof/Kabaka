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
public class NonIndividual {
    private int id;
    private String enterpriseType="";
    private String incBenefitsInvestment="";
    private String  noOfExpiration="";
    private String expirationDate="";
    private String registeredName="";
    private String   registrationDate="";
    private String comRegistrationNo="";
    private String resident="";
    private String countryOfResidence="";
    private String  entrepriseEmail="";
    private String nssfRegistrationNo="";
    private String entreprisePhoneNo="";
    private String entrepriseFaxNo="";
    private String startDate="";
    private String closeDate="";
    private String noOfShares="";
    private String sharesValue="";
    private String taxpayerType="";
    private String  taxType="";
    private String plotNo="";
    private String street="";
    private String cellule="";
    private String sector="";
    private String district="";
    private String province="";
    private String mailingAddress="";
    private String mailPlotNo="";
    private String mailingStreet="";
    private String mailingPoBox="";
    private String mailingCity="";
    private String  mailingCellule="";
    private String  malingSector="";
    private String malingDistrict="";
    private String malingProvince="";
    private String taxpayerRepresentativeName="";
    private String represntativeTitle="";
    private String representativePhoneNo="";
    private String contactName="";
    private String contactTitle="";
    private String contactPhone="";
    private String error;
    private String info;
    private boolean deletedSatus=false;
    private String doneBy="";
    private Timestamp doneAt=new Timestamp(new Date().getTime());
    private boolean valid=true;

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    
    
    public String getDoneBy() {
        return doneBy;
    }

    public void setDoneBy(String doneBy) {
        this.doneBy = doneBy;
    }

    public Timestamp getDoneAt() {
        return doneAt;
    }

    public void setDoneAt(Timestamp doneAt) {
        this.doneAt = doneAt;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getIncBenefitsInvestment() {
        return incBenefitsInvestment;
    }

    public void setIncBenefitsInvestment(String incBenefitsInvestment) {
        this.incBenefitsInvestment = incBenefitsInvestment;
    }

    public String getNoOfExpiration() {
        return noOfExpiration;
    }

    public void setNoOfExpiration(String noOfExpiration) {
        this.noOfExpiration = noOfExpiration;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getRegisteredName() {
        return registeredName;
    }

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getComRegistrationNo() {
        return comRegistrationNo;
    }

    public void setComRegistrationNo(String comRegistrationNo) {
        this.comRegistrationNo = comRegistrationNo;
    }

    public String getResident() {
        return resident;
    }

    public void setResident(String resident) {
        this.resident = resident;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getEntrepriseEmail() {
        return entrepriseEmail;
    }

    public void setEntrepriseEmail(String entrepriseEmail) {
        this.entrepriseEmail = entrepriseEmail;
    }

    public String getNssfRegistrationNo() {
        return nssfRegistrationNo;
    }

    public void setNssfRegistrationNo(String nssfRegistrationNo) {
        this.nssfRegistrationNo = nssfRegistrationNo;
    }

    public String getEntreprisePhoneNo() {
        return entreprisePhoneNo;
    }

    public void setEntreprisePhoneNo(String entreprisePhoneNo) {
        this.entreprisePhoneNo = entreprisePhoneNo;
    }

    public String getEntrepriseFaxNo() {
        return entrepriseFaxNo;
    }

    public void setEntrepriseFaxNo(String entrepriseFaxNo) {
        this.entrepriseFaxNo = entrepriseFaxNo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate;
    }

    public String getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(String noOfShares) {
        this.noOfShares = noOfShares;
    }

    public String getSharesValue() {
        return sharesValue;
    }

    public void setSharesValue(String sharesValue) {
        this.sharesValue = sharesValue;
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

    public String getMailPlotNo() {
        return mailPlotNo;
    }

    public void setMailPlotNo(String mailPlotNo) {
        this.mailPlotNo = mailPlotNo;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getMailingPoBox() {
        return mailingPoBox;
    }

    public void setMailingPoBox(String mailingPoBox) {
        this.mailingPoBox = mailingPoBox;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingCellule() {
        return mailingCellule;
    }

    public void setMailingCellule(String mailingCellule) {
        this.mailingCellule = mailingCellule;
    }

    public String getMalingSector() {
        return malingSector;
    }

    public void setMalingSector(String malingSector) {
        this.malingSector = malingSector;
    }

    public String getMalingDistrict() {
        return malingDistrict;
    }

    public void setMalingDistrict(String malingDistrict) {
        this.malingDistrict = malingDistrict;
    }

    public String getMalingProvince() {
        return malingProvince;
    }

    public void setMalingProvince(String malingProvince) {
        this.malingProvince = malingProvince;
    }

    public String getTaxpayerRepresentativeName() {
        return taxpayerRepresentativeName;
    }

    public void setTaxpayerRepresentativeName(String taxpayerRepresentativeName) {
        this.taxpayerRepresentativeName = taxpayerRepresentativeName;
    }

    public String getRepresntativeTitle() {
        return represntativeTitle;
    }

    public void setRepresntativeTitle(String represntativeTitle) {
        this.represntativeTitle = represntativeTitle;
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

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
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

    public boolean isDeletedSatus() {
        return deletedSatus;
    }

    public void setDeletedSatus(boolean deletedSatus) {
        this.deletedSatus = deletedSatus;
    }

    public NonIndividual() {
    }
    
    public void save(){
    try{
        PreparedStatement st=SetCon.getCon().prepareStatement("insert into nonIndividual values(id,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        st.setString(1, enterpriseType);
        st.setString(2, incBenefitsInvestment);
        st.setString(3, noOfExpiration);
        st.setString(4, expirationDate);
        st.setString(5, registeredName);
        st.setString(6, registrationDate);
        st.setString(7, comRegistrationNo);
        st.setBoolean(8, Boolean.parseBoolean(resident));
        st.setString(9, countryOfResidence);
        st.setString(10, entrepriseEmail);
        st.setString(11, nssfRegistrationNo);
        st.setString(12, entreprisePhoneNo);
        st.setString(13, entrepriseFaxNo);
        st.setString(14, startDate);
        st.setString(15, closeDate);
        st.setString(16, noOfShares);
        st.setString(17, sharesValue);
        st.setInt(18, Integer.parseInt(taxpayerType));
        st.setInt(19, Integer.parseInt(taxType));
        st.setString(20, plotNo);
        st.setString(21, street);
        st.setString(22, cellule);
        st.setString(23, sector);
        st.setString(24, district);
        st.setString(25, province);
        st.setString(26, mailingAddress);
        st.setString(27, mailPlotNo);
        st.setString(28, mailingStreet);
        st.setString(29, mailingPoBox);
        st.setString(30, mailingCity);
        st.setString(31, mailingCellule);
        st.setString(32,malingSector);
        st.setString(33, malingDistrict);
        st.setString(34, malingProvince);
        st.setString(35, taxpayerRepresentativeName);
        st.setString(36, represntativeTitle);
        st.setString(37, representativePhoneNo);
        st.setString(38, contactName);
        st.setString(39, contactTitle);
        st.setString(40, contactPhone);
        st.setString(41, doneBy);
        st.setTimestamp(42, doneAt);
        st.execute();
    }catch(Exception e){
    error="Try Again";
    valid=false;
    }
    
    }
    
    public static List<NonIndividual>listNonIndividual(){
    List<NonIndividual>list=new ArrayList<NonIndividual>();
    try{
    PreparedStatement st=SetCon.getCon().prepareStatement("select * from nonindividual");
        ResultSet rs=st.executeQuery();
        while(rs.next()){
        NonIndividual ni=new NonIndividual();
        ni.setId(rs.getInt(1));
        ni.setEnterpriseType(rs.getString(2));
        ni.setIncBenefitsInvestment(rs.getString(3));
        ni.setNoOfExpiration(rs.getString(4));
        ni.setExpirationDate(rs.getString(5));
        ni.setRegisteredName(rs.getString(6));
        ni.setRegistrationDate(rs.getString(7));
        ni.setComRegistrationNo(rs.getString(8));
        ni.setResident(rs.getBoolean(9)+"");
        ni.setCountryOfResidence(rs.getString(10));
        ni.setEntrepriseEmail(rs.getString(11));
        ni.setNssfRegistrationNo(rs.getString(12));
        ni.setEntreprisePhoneNo(rs.getString(13));
        ni.setEntrepriseFaxNo(rs.getString(14));
        ni.setStartDate(rs.getString(15));
        ni.setCloseDate(rs.getString(16));
        ni.setNoOfShares(rs.getString(17));
        ni.setSharesValue(rs.getString(18));
        ni.setTaxType(rs.getInt(19)+"");
        ni.setTaxType(rs.getInt(20)+"");
        ni.setPlotNo(rs.getString(21));
        ni.setStreet(rs.getString(22));
        ni.setCellule(rs.getString(23));
        ni.setSector(rs.getString(24));
        ni.setDistrict(rs.getString(25));
        ni.setProvince(rs.getString(26));
        ni.setMailingAddress(rs.getString(27));
        ni.setMailPlotNo(rs.getString(28));
        ni.setMailingStreet(rs.getString(29));
        ni.setMailingPoBox(rs.getString(30));
        ni.setMailingCity(rs.getString(31));
        ni.setMailingCellule(rs.getString(32));
        ni.setMalingSector(rs.getString(33));
        ni.setMalingDistrict(rs.getString(34));
        ni.setMalingProvince(rs.getString(35));
        ni.setTaxpayerRepresentativeName(rs.getString(36));
        ni.setRepresntativeTitle(rs.getString(37));
        ni.setRepresentativePhoneNo(rs.getString(38));
        ni.setContactName(rs.getString(39));
        ni.setContactTitle(rs.getString(40));
        ni.setContactPhone(rs.getString(41));
        ni.setDoneBy(rs.getString(42));
        ni.setDoneAt(rs.getTimestamp(43));
        list.add(ni);
        }
    }catch(Exception e){
    
    }
    
    return list;
    
    }
    
}
