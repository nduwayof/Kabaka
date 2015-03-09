<%-- 
    Document   : individual
    Created on : Mar 5, 2015, 1:16:08 PM
    Author     : Fabrice
--%>

<%@page import="rw.djuma.TaxPayerType"%>
<%@page import="rw.djuma.TaxType"%>
<div class="form-group">
    <div class="col-md-3">
        <label for="surname">Enterprise type:</label>
    </div>
    <div class="col-md-9">
        <label>
            <input type="radio" name="ci">Corporation
        </label>
        <label>
            <input type="radio" name="c">Partnership
        </label><label>
            <input type="radio" name="ci">Government body
        </label><label>
            <input type="radio" name="ci">Coop
        </label>
        <label>
            <input type="radio" name="c">Trust
        </label>
        <label>
            <input type="radio" name="civ">Non profit
        </label>
        
    </div>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="surname">Benefits from investment incentives ?</label>
    </div>
    <label>
            <input type="radio" name="ci">YES
        </label>
    <label>
            <input type="radio" name="ci">NO
        </label>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="occupation">Registered Name :</label>
    </div>
    <div class="col-md-9">
        <input type="text" name="" class="form-control">
    </div>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="occupation">Commercial registration No :</label>
    </div>
    <div class="col-md-9">
        <input type="text" name="occupation" class="form-control">
    </div>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="dob">Registration date</label>
    </div>
    <div class="col-md-9">
        <input type="date" class="form-control" name="">
    </div>
</div>
<div class="form-group" >
    <div class="col-md-3">
        <label for="resident">Resident :</label>
        <label>
            <input type="radio" name="" value="1" onclick="hideresidentDjuma()">Yes
        </label>
        <label>
            <input type="radio" name="" value="0" onclick="showresidentDjuma()">No
        </label>
    </div>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="taxpayerType">Type of Taxpayer</label>
    </div>
    <div class="col-md-9">
        <select class="form-control" name="">
            <%
            for(TaxPayerType t: TaxPayerType.listTaxPayerType()){
            if(t.isDeletedStatus()==false){
            %>
            <option value="<%=t.getId()%>"><%=t.getTaxpayerType()%></option>
            <%
            }
            }
            %>
        </select>
    </div>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="taxType">Type of Taxes</label>
    </div>
    <div class="col-md-9">
        <select class="form-control" name="">
            <%
            for(TaxType t: TaxType.listTaxType()){
            if(t.isDeletedStatus()==false){
            %>
            <option value="<%=t.getId()%>"><%=t.getTaxType()%></option>
            <%
            }
            }
            %>
        </select>
    </div>
</div>
<div id="">
    <h3>Partner Informations</h3>
    <div class="form-group">
        <div class="col-md-3">
            <label for="name">Enterprise Emai</label>
        </div>
        <div class="col-md-9">
            <input type="text" name="" class="form-control">
        </div>
    </div>
    <div class="form-group">
        <div class="col-md-3">
            <label for="surname">NSSF registration No</label>
        </div>
        <div class="col-md-9">
            <input type="text" name="" class="form-control">
        </div>
    </div>
 
</div>
