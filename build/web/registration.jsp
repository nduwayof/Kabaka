<%-- 
    Document   : registration
    Created on : Mar 5, 2015, 10:20:54 AM
    Author     : Fabrice
--%>

<%@page import="rw.djuma.Individual"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kabaka | Registration</title>

        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        

        <link href="Kabaka/libs/bower_components/bootstrap/css/bootstrap.min.css" rel="stylesheet"/>
        <link href="Kabaka/css/main.css" rel="stylesheet"/>
        <link href="Kabaka/libs/bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet"/>
        <link href="Kabaka/css/icomoon.css" rel="stylesheet"/>
        


        <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Raleway:400,300,700' rel='stylesheet' type='text/css'>

        <link href="Kabaka/css/demo_style.css" rel="stylesheet" type="text/css">

        <link href="Kabaka/css/smart_wizard_vertical.css" rel="stylesheet" type="text/css">

        <script src="Kabaka/libs//bower_components/jquery/js/jquery.min.js"></script>
        <script type="text/javascript" src="Kabaka/js/jquery.smartWizard.js"></script>


        <script type="text/javascript">
            $(document).ready(function () {
                $('#wizard').smartWizard({transitionEffect: 'slide'});
                $('#individual').hide();
                $('#nonIndividual').hide();
                $('#deceasedDate').hide();
                $('#civilId').hide();
                $('#residentDjuma').hide();


                


            });
            function showIndividual() {
                $('#nonIndividual').hide();
                $('#individual').show();
                Location.reload();
            }
            function showNonIndividual() {
                $('#individual').hide();
                $('#nonIndividual').show();
                Location.reload();
            }
            function showDeceaseDate() {
                $('#deceasedDate').show();
            }
            function hideDeceaseDate() {
                $('#deceasedDate').hide();
            }
            function showCivil() {
                $('#civilId').show();

            }
            function hideCivil() {
                $('#civilId').hide();

            }
            function showresidentDjuma() {
                $('#residentDjuma').show();

            }
            function hideresidentDjuma() {
                $('#residentDjuma').hide();

            }

        </script>

    </head>
    <body>
        <jsp:include page="Kabaka/views/layout/navbar.jsp"/>
        <br>
        <br>
        <br>
        <br>
        <br>
        <div class="container">
            <form class="form-horizontal" id="dju">
                <table class="table table-responsive">
                    <tr>
                        <td> 
                            <div id="wizard" class="swMain">
                                <ul>
                                    <li><a href="#step-1">
                                            <label class="stepNumber">1</label>
                                            <span class="stepDesc">
                                                Step 1<br />
                                                <small>Enterprise Owner(s)</small>
                                            </span>
                                        </a></li>
                                    <li><a href="#step-2">
                                            <label class="stepNumber">2</label>
                                            <span class="stepDesc">
                                                Step 2<br />
                                                <small>Addresses</small>
                                            </span>
                                        </a></li>
                                    <li><a href="#step-3">
                                            <label class="stepNumber">3</label>
                                            <span class="stepDesc">
                                                Step 3<br />
                                                <small>Representative Contact</small>
                                            </span>                   
                                        </a></li>
                                </ul>
                                <div id="step-1">	
                                    <h2 class="StepTitle">Step 1 Enterprise Owner's Informations</h2>
                                    <br>
                                    <div class="form-group">
                                        <div class="col-md-7">
                                            <label>Please Specify the category of your Enterprise</label>
                                        </div>
                                        <div class="col-md-5">
                                            <div class="btn-group" data-toggle="buttons">
                                                <label>
                                                    <a class="btn btn-success" href="javascript:void(0)" onclick="showIndividual()">Individual</a>
                                                </label>
                                                <label>
                                                    <a class="btn btn-info" href="javascript:void(0)" onclick="showNonIndividual()">Non Individual</a>
                                                </label>
                                            </div>

                                        </div>
                                    </div>
                                    <div id="individual">
                                        <h3>Individual Enterprise</h3>
                                        <%
                                            String newTinNumber=Individual.newTinNumber();
                                        
                                        %>
                                        <h2 class="center" >New TIN Number is <span style="color: dodgerblue"><%=newTinNumber%></span></h2>
                                        <br>
                                        <jsp:include page="Kabaka/views/wizard/individual.jsp"/>
                                    </div>
                                    <div id="nonIndividual">
                                        <h3>Non Individual Enterprise</h3>
                                        <jsp:include page="Kabaka/views/wizard/nonIndividual.jsp"/>
                                    </div>

                                </div>
                                <div id="step-2">
                                    <h2 class="StepTitle">Step 2 Addresses for addresses</h2>
                                    <jsp:include page="Kabaka/views/wizard/addresses.jsp"/>                                
                                </div>                      
                                <div id="step-3">
                                    <h2 class="StepTitle">Step 3 Representative Contacts</h2>	
                                    <jsp:include page="Kabaka/views/wizard/representative.jsp"/>
                                    
                            </div>
                        </td>
                    </tr>
                </table>   
            </form>
        </div>
        <jsp:include page="Kabaka/views/layout/footer.jsp"/>
        <script src="Kabaka/libs//bower_components/bootstrap/js/bootstrap.min.js"></script>
        <script src="Kabaka/js/main.js"></script>
        <script>


        </script>
    </body>
</html>
