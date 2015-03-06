package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import rw.djuma.Individual;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Kabaka | Registration</title>\n");
      out.write("\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <link href=\"Kabaka/libs/bower_components/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"Kabaka/css/main.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"Kabaka/libs/bower_components/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"Kabaka/css/icomoon.css\" rel=\"stylesheet\"/>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Raleway:400,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <link href=\"Kabaka/css/demo_style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <link href=\"Kabaka/css/smart_wizard_vertical.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <script src=\"Kabaka/libs//bower_components/jquery/js/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"Kabaka/js/jquery.smartWizard.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#wizard').smartWizard({transitionEffect: 'slide'});\n");
      out.write("                $('#individual').hide();\n");
      out.write("                $('#nonIndividual').hide();\n");
      out.write("                $('#deceasedDate').hide();\n");
      out.write("                $('#civilId').hide();\n");
      out.write("                $('#residentDjuma').hide();\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("            });\n");
      out.write("            function showIndividual() {\n");
      out.write("                $('#nonIndividual').hide();\n");
      out.write("                $('#individual').show();\n");
      out.write("                Location.reload();\n");
      out.write("            }\n");
      out.write("            function showNonIndividual() {\n");
      out.write("                $('#individual').hide();\n");
      out.write("                $('#nonIndividual').show();\n");
      out.write("                Location.reload();\n");
      out.write("            }\n");
      out.write("            function showDeceaseDate() {\n");
      out.write("                $('#deceasedDate').show();\n");
      out.write("            }\n");
      out.write("            function hideDeceaseDate() {\n");
      out.write("                $('#deceasedDate').hide();\n");
      out.write("            }\n");
      out.write("            function showCivil() {\n");
      out.write("                $('#civilId').show();\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function hideCivil() {\n");
      out.write("                $('#civilId').hide();\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function showresidentDjuma() {\n");
      out.write("                $('#residentDjuma').show();\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function hideresidentDjuma() {\n");
      out.write("                $('#residentDjuma').hide();\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Kabaka/views/layout/navbar.jsp", out, false);
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form class=\"form-horizontal\" id=\"dju\">\n");
      out.write("                <table class=\"table table-responsive\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td> \n");
      out.write("                            <div id=\"wizard\" class=\"swMain\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#step-1\">\n");
      out.write("                                            <label class=\"stepNumber\">1</label>\n");
      out.write("                                            <span class=\"stepDesc\">\n");
      out.write("                                                Step 1<br />\n");
      out.write("                                                <small>Enterprise Owner(s)</small>\n");
      out.write("                                            </span>\n");
      out.write("                                        </a></li>\n");
      out.write("                                    <li><a href=\"#step-2\">\n");
      out.write("                                            <label class=\"stepNumber\">2</label>\n");
      out.write("                                            <span class=\"stepDesc\">\n");
      out.write("                                                Step 2<br />\n");
      out.write("                                                <small>Addresses</small>\n");
      out.write("                                            </span>\n");
      out.write("                                        </a></li>\n");
      out.write("                                    <li><a href=\"#step-3\">\n");
      out.write("                                            <label class=\"stepNumber\">3</label>\n");
      out.write("                                            <span class=\"stepDesc\">\n");
      out.write("                                                Step 3<br />\n");
      out.write("                                                <small>Representative Contact</small>\n");
      out.write("                                            </span>                   \n");
      out.write("                                        </a></li>\n");
      out.write("                                </ul>\n");
      out.write("                                <div id=\"step-1\">\t\n");
      out.write("                                    <h2 class=\"StepTitle\">Step 1 Enterprise Owner's Informations</h2>\n");
      out.write("                                    <br>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"col-md-7\">\n");
      out.write("                                            <label>Please Specify the category of your Enterprise</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-5\">\n");
      out.write("                                            <div class=\"btn-group\" data-toggle=\"buttons\">\n");
      out.write("                                                <label>\n");
      out.write("                                                    <a class=\"btn btn-success\" href=\"javascript:void(0)\" onclick=\"showIndividual()\">Individual</a>\n");
      out.write("                                                </label>\n");
      out.write("                                                <label>\n");
      out.write("                                                    <a class=\"btn btn-info\" href=\"javascript:void(0)\" onclick=\"showNonIndividual()\">Non Individual</a>\n");
      out.write("                                                </label>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"individual\">\n");
      out.write("                                        <h3>Individual Enterprise</h3>\n");
      out.write("                                        ");

                                            String newTinNumber=Individual.newTinNumber();
                                        
                                        
      out.write("\n");
      out.write("                                        <h2 class=\"center\" >New TIN Number is <sul style=\"color: dodgerblue\">");
      out.print(newTinNumber);
      out.write("</sul></h2>\n");
      out.write("                                        <br>\n");
      out.write("                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Kabaka/views/wizard/individual.jsp", out, false);
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"nonIndividual\">\n");
      out.write("                                        <h3>Non Individual Enterprise</h3>\n");
      out.write("                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Kabaka/views/wizard/nonIndividual.jsp", out, false);
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"step-2\">\n");
      out.write("                                    <h2 class=\"StepTitle\">Step 2 Addresses for addresses</h2>\n");
      out.write("                                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Kabaka/views/wizard/addresses.jsp", out, false);
      out.write("                                \n");
      out.write("                                </div>                      \n");
      out.write("                                <div id=\"step-3\">\n");
      out.write("                                    <h2 class=\"StepTitle\">Step 3 Representative Contacts</h2>\t\n");
      out.write("                                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Kabaka/views/wizard/representative.jsp", out, false);
      out.write("\n");
      out.write("                                    \n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>   \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Kabaka/views/layout/footer.jsp", out, false);
      out.write("\n");
      out.write("        <script src=\"Kabaka/libs//bower_components/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"Kabaka/js/main.js\"></script>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
