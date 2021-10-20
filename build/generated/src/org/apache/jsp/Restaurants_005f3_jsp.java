package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public final class Restaurants_005f3_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Edufect</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div id=\"course-table\">\n");
      out.write("        <ul>\n");
      out.write("            <li class=\"active\"><a href=\"Restaurants.jsp\">Home</a></li>\n");
      out.write("           \n");
      out.write("              <li  class=\"dropdown\"><a href=\"#\">Menu Item</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                <a href=\"Restaurants_1.jsp\">View Menu Item</a>           \n");
      out.write("                <a href=\"Restaurants_2.jsp\">Add Menu Item</a>\n");
      out.write("                <a href=\"Restaurants_3.jsp\">Modify Menu Item</a>           \n");
      out.write("                <a href=\"Restaurants_4.jsp\">Delete Menu Item</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"Restaurants_5.jsp\">Ordered Food</a></li>\n");
      out.write("           \n");
      out.write("             <li style=\"float:right\"><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"course-table\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

  Connection conn = null;
  String url="jdbc:mysql://localhost:3306/";
  String dbName ="database2";
  String  driver="com.mysql.jdbc.Driver";
  String userName="root";
  String password="";
  Statement st;
  try{
      Class.forName(driver).newInstance();
      conn= DriverManager.getConnection(url+dbName,userName,password);
      st=conn.createStatement();
          String name=(String)session.getAttribute("username");
      String pasord=(String)session.getAttribute("pasord");
       String quer="SELECT * FROM CourseMaster where Nam='"+name+"';";
      ResultSet rs = st.executeQuery(quer);
      
   
      out.write("   \n");
      out.write("   ");
      out.write("\n");
      out.write("   <form method=\"post\" action=\"Restaurants_3_1.jsp\">\n");
      out.write("      <table Id=\"course-table\" align=\"center\">\n");
      out.write("          <tr>\n");
      out.write("                \n");
      out.write("                <td>Restaurant Name</td>\n");
      out.write("                <td>Food Name</td>\n");
      out.write("                <td>Preference</td>\n");
      out.write("                 <td>Price of food</td>\n");
      out.write("                <td>Select</td>\n");
      out.write("            </tr>\n");
      out.write("          ");

 while(rs.next()){   
 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("              \n");
      out.write("                <td>");
      out.print(rs.getString("nam"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("duration"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("technology"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getInt("fees"));
      out.write("</td>\n");
      out.write("                <td><input type=\"radio\" name=\"selectedStudent\" value=\"");
      out.print(rs.getInt("id"));
      out.write("\"</td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");
  }  
      out.write("\n");
      out.write("            \n");
      out.write("           \n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                 <td colspan=\"6\" align=\"center\" ><input type=\"submit\" value=\"Modify\"></td>\n");
      out.write("                 \n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("             <br><br>\n");
      out.write("  </form>\n");
      out.write("  ");
    
  }
  catch(Exception e){out.println(e);}

      out.write("\n");
      out.write("     </div>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
