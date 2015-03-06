package org.apache.jsp.List;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import rw.djuma.TaxType;
import rw.djuma.TaxPayerType;
import rw.djuma.Individual;

public final class ListIndividual_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Kabaka | Individual Enterprise List</title>\n");
      out.write("        <script src=\"media/js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"media/js/jquery.dataTables.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"media/js/dataTable.tableTools.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"media/js/jquery.dataTables.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"media/css/jquery.dataTables.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"media/css/jquery.dataTables.min.css\" type=\"text/css\">  \n");
      out.write("        <link rel=\"stylesheet\" href=\"media/css/dataTables.tableTools.css\" type=\"text/css\">  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border=\"1\" id=\"djuma\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Surname</th>\n");
      out.write("                    <th>FirstName</th>\n");
      out.write("                    <th>Gender</th>\n");
      out.write("                    <th>TIN NUMBER</th>\n");
      out.write("                    <th>Nationality</th>\n");
      out.write("                    <th>TaxPayerType</th>\n");
      out.write("                    <th>TaxType</th>\n");
      out.write("                    <th>Representative Name</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                for(Individual i: Individual.listIndividual()){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(i.getOwnerSurname());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(i.getOwnerFirstName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(i.getGender());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(i.getTinNumber());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(i.getNationality());
      out.write("</td>\n");
      out.write("                    ");

                    for(TaxPayerType t: TaxPayerType.listTaxPayerType()){
                if(t.getId()==Integer.parseInt(i.getTaxpayerType())){
                
      out.write("\n");
      out.write("                 <td>");
      out.print(t.getTaxpayerType());
      out.write("</td>\n");
      out.write("                 ");
    
                    
                }}
                    
      out.write("\n");
      out.write("                    ");

                    for(TaxType ta: TaxType.listTaxType()){
                        if(ta.getId()==Integer.parseInt(i.getTaxType())){
                    
      out.write("\n");
      out.write("                    <td>");
      out.print(ta.getTaxType());
      out.write("</td>\n");
      out.write("                    ");

                    }
                    }
                    
      out.write("\n");
      out.write("                    <td>");
      out.print(i.getTaxpayerRepresentativeName());
      out.write("</td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");

                
                }
                
               
                
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("  <script type=\"text/javascript\"> \n");
      out.write("            $(document).ready(function(){\n");
      out.write("                 $('#djuma').dataTable({\n");
      out.write("            \"dom\" : 'CT<\"clear\">lfrtip',\n");
      out.write("            \"oTableTools\" : {\n");
      out.write("                \"sSwfPath\" : \"../swf/copy_csv_xls_pdf.swf\",\n");
      out.write("                \"aButtons\" : [ \"copy\", \"print\", {\n");
      out.write("                    \"sExtends\" : \"collection\",\n");
      out.write("                    \"sButtonText\" : \"Save\",\n");
      out.write("                    \"aButtons\" : [ \"csv\", \"xls\", \"pdf\" ]\n");
      out.write("                } ]\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("            });\n");
      out.write("        </script>");
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
