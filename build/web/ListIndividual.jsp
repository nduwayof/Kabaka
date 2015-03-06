<%-- 
    Document   : ListIndividual
    Created on : Mar 6, 2015, 1:13:48 AM
    Author     : SULAIMAN
--%>

<%@page import="rw.djuma.TaxType"%>
<%@page import="rw.djuma.TaxPayerType"%>
<%@page import="rw.djuma.Individual"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kabaka | Individual Enterprise List</title>
        <script src="media/js/jquery.js" type="text/javascript"></script>
        <script src="media/js/jquery.dataTables.js" type="text/javascript"></script>
        <script src="media/js/dataTable.tableTools.min.js" type="text/javascript"></script>
        <script src="media/js/jquery.dataTables.min.js" type="text/javascript"></script>
        <link rel="stylesheet" href="media/css/jquery.dataTables.css" type="text/css">
        <link rel="stylesheet" href="media/css/jquery.dataTables.min.css" type="text/css">  
        <link rel="stylesheet" href="media/css/dataTables.tableTools.css" type="text/css"> 
                <link href="Kabaka/libs/bower_components/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>

    </head>
    <body>
        <a class="btn btn-primary btn-lg" href="registration.jsp">
            <i class="glyphicon glyphicon-arrow-left bigger-130">
                    Back To Registration
            </i>
                </a>
           
          <center>
              <form action="report.jsp" method="POST">
                  Select Tax Payer Type To Print: <select name="taxpayerType">
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
                  <button  type="Submit"class="btn btn-primary btn-lg">
            <i class="glyphicon glyphicon-print">
                    Print
            </i>
                </button>
              </form>
            
          </center>
        <div>
        <table border="1" id="djuma">
            <thead>
                <tr>
                    <th>Surname</th>
                    <th>FirstName</th>
                    <th>Gender</th>
                    <th>TIN NUMBER</th>
                    <th>Nationality</th>
                    <th>TaxPayerType</th>
                    <th>TaxType</th>
                    <th>Representative Name</th>
                </tr>
            </thead>
            <tbody>
                <%
                for(Individual i: Individual.listIndividual()){
                %>
                <tr>
                    <td><%=i.getOwnerSurname()%></td>
                    <td><%=i.getOwnerFirstName()%></td>
                    <td><%=i.getGender()%></td>
                    <td><%=i.getTinNumber()%></td>
                    <td><%=i.getNationality()%></td>
                    <%
                    for(TaxPayerType t: TaxPayerType.listTaxPayerType()){
                if(t.getId()==Integer.parseInt(i.getTaxpayerType())){
                %>
                 <td><%=t.getTaxpayerType()%></td>
                 <%    
                    
                }}
                    %>
                    <%
                    for(TaxType ta: TaxType.listTaxType()){
                        if(ta.getId()==Integer.parseInt(i.getTaxType())){
                    %>
                    <td><%=ta.getTaxType()%></td>
                    <%
                    }
                    }
                    %>
                    <td><%=i.getTaxpayerRepresentativeName()%></td>

                </tr>
                
                <%
                
                }
                
               
                
                %>
            </tbody>
        </table>
        </div>
    </body>
</html>
  <script type="text/javascript"> 
            $(document).ready(function(){
                 $('#djuma').dataTable({
            "dom" : 'CT<"clear">lfrtip',
            "oTableTools" : {
                "sSwfPath" : "../swf/copy_csv_xls_pdf.swf",
                "aButtons" : [ "copy", "print", {
                    "sExtends" : "collection",
                    "sButtonText" : "Save",
                    "aButtons" : [ "csv", "xls", "pdf" ]
                } ]
            }
        });
            });
        </script>