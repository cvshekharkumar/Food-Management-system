package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registrationcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Edufect</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"course-table\">\n");
      out.write("        <ul>\n");
      out.write("            <li class=\"active\"><a href=\"home.jsp\">Back</a></li>\n");
      out.write("           \n");
      out.write("        </ul>\n");
      out.write("        </div>\n");
      out.write("      <form method=\"post\" action=\"Registrationcustomer_1.jsp\"> \n");
      out.write("          <table Id=\"course-table\" align=\"center\">\n");
      out.write("          <tr><td>Name</td><td><input type=\"text\" name=\"name\"></td></tr>\n");
      out.write("           <tr><td>password</td><td><input type=\"password\" name=\"passord\"></td></tr>\n");
      out.write("            <tr><td>email</td><td><input type=\"text\" name=\"email\"></td></tr>\n");
      out.write("          <tr><td>mobile</td><td><input type=\"text\" name=\"mobile\"></td></tr>\n");
      out.write("            \n");
      out.write("               <tr><td> Preference </td><td> <select name=\"city\">\n");
      out.write("                <option>Veg</option>\n");
      out.write("                 <option>Nonveg</option>\n");
      out.write("                     </select></td></tr>\n");
      out.write("\n");
      out.write("            <tr><TD>SUBMIT THE DETAILS</TD><td><input type=\"Submit\" value=\"ADD STUDENT\"></td></tr>\n");
      out.write("         </form>   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
