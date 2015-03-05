<%-- 
    Document   : individual
    Created on : Mar 5, 2015, 1:16:08 PM
    Author     : Fabrice
--%>

<div class="form-group">
    <div class="col-md-3">
        <label for="surname">Owner's Surname</label>
    </div>
    <div class="col-md-9">
        <input type="text" class="form-control" name="ownerSurname">
    </div>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="firstName">First name</label>
    </div>
    <div class="col-md-9">
        <input type="text" class="form-control" name="ownerFirstName">
    </div>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="dob">Date of Birth</label>
    </div>
    <div class="col-md-9">
        <input type="date" class="form-control" name="dob">
    </div>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="status">Is the owner alive</label>
    </div>
    <div class="col-md-9">
        <a class="btn btn-info" href="javascript:void(0)" onclick="showDeceaseDate()">
            If no click on this button
        </a>
    </div>
</div>
<div class="form-group" id="deceasedDate">
    <div class="col-md-3">
        <label for="deceasedDate">Deceased Date</label>
    </div>
    <div class="col-md-7">
        <input type="date" class="form-control" name="deceadDate">
    </div>
    <div class="col-md-2">
        <a class="btn btn-info" href="javascript:void(0)" onclick="hideDeceaseDate()">
            Hide
        </a>
    </div>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="gender">Gender</label>
    </div>
    <div class="col-md-9">
        <select class="form-control" name="gender">
            <option>Male</option>
            <option>Female</option>
        </select>
    </div>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="occupation">Occupation</label>
    </div>
    <div class="col-md-9">
        <input type="text" name="occupation" class="form-control">
    </div>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="nationality">Nationality</label>
    </div>
    <div class="col-md-9">
        <select name="nationality" class="form-control">
            <option>Rwandese</option>
            <option>Ugandan</option>
            <option>Tanzanian</option>
            <option>Kenyan</option>
            <option>Burundian</option>
        </select>
    </div>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="nationalId">National ID NO</label>
    </div>
    <div class="col-md-9">
        <input type="text" name="nationalId" class="form-control">
    </div>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="socialSecurityNumber">Social Security Number</label>
    </div>
    <div class="col-md-9">
        <input type="text" name="socialSecurityNumber" id="socialSecurityNumber" class="form-control">
    </div>
</div>
<div class="form-group">
    <div class="col-md-3">
        <label for="passport">Passport</label>
    </div>
    <div class="col-md-9">
        <input type="text" name="passport" id="socialSecurityNumber" class="form-control">
    </div>
</div>