package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public final class modifyrestaurants_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <div id=\"course-table\">\n");
      out.write("        <ul>\n");
      out.write("            <li class=\"active\"><a href=\"admin.jsp\">Home</a></li>\n");
      out.write("            <li class=\"dropdown\"><a href=\"#\">Menu Items</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                <a href=\"viewallcourse.jsp\">View Menu Items</a>\n");
      out.write("                <a href=\"addcourse.jsp\">Add New Menu Items</a>\n");
      out.write("                <a href=\"modifycourse.jsp\">Modify Menu Items</a>\n");
      out.write("                <a href=\"deletecourse.jsp\">Delete Menu Items</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li  class=\"dropdown\"><a href=\"#\">Customers</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                <a href=\"viewallstudent.jsp\">View Customers</a>\n");
      out.write("                <a href=\"addstudent.jsp\">Add New Customers</a>\n");
      out.write("                <a href=\"modifystudent.jsp\">Modify Customers</a>\n");
      out.write("                <a href=\"deletestudent.jsp\">Delete Customers</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li  class=\"dropdown\"><a href=\"#\">Restaurants</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                <a href=\"viewallrestaurants.jsp\">View Restaurants</a>\n");
      out.write("                <a href=\"addrestaurants.jsp\">Add New Restaurants</a>\n");
      out.write("                <a href=\"modifyrestaurants.jsp\">Modify Restaurants</a>\n");
      out.write("                <a href=\"deleterestaurants.jsp\">Delete Restaurants</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li  class=\"dropdown\"><a href=\"#\">Customers Order</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                <a href=\"viewallcustomersorder.jsp\">View Customers Order</a>\n");
      out.write("                <a href=\"addcustomersorder.jsp\">Add New Customers Order</a>\n");
      out.write("                <a href=\"modifycustomersorder.jsp\">Modify Customers Order</a>\n");
      out.write("                <a href=\"deletecustomersorder.jsp\">Delete Customers Order</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li  class=\"dropdown\"><a href=\"#\">Customers Payment Menu page</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                <a href=\"enrol.jsp\">Enrol Customers Menu page</a>\n");
      out.write("                <a href=\"removestudent.jsp\">Remove Customers Menu page</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"fee.jsp\">Payment of Customers </a></li>\n");
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
       String quer="SELECT * FROM RestaurantMaster";
      ResultSet rs = st.executeQuery(quer);
      
   
      out.write("  \n");
      out.write("  ");
      out.write("\n");
      out.write("   <form method=\"post\" action=\"modifyrestaurants_1.jsp\">\n");
      out.write("      <table Id=\"course-table\" align=\"center\">\n");
      out.write("          <tr>\n");
      out.write("               \n");
      out.write("               <td>Restaurant Name</td>\n");
      out.write("                <td>Password</td>\n");
      out.write("                <td>Email</td>\n");
      out.write("                 <td>Mobile</td>\n");
      out.write("                 <td>City</td>\n");
      out.write("                 <td>Select</td>\n");
      out.write("            </tr>\n");
      out.write("          ");

 while(rs.next()){   
 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("             \n");
      out.write("                <td>");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("passord"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("mobile"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("city"));
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
      out.write("                 <td colspan=\"7\" align=\"center\" ><input type=\"submit\" value=\"Modify\"></td>\n");
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
