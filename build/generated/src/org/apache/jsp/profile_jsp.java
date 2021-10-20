package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <li class=\"active\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("           \n");
      out.write("              <li  class=\"dropdown\"><a href=\"#\">Ordered food</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                <a href=\"customer_1.jsp\">View Ordered food</a>           \n");
      out.write("                <a href=\"customer_2.jsp\">Cancel Ordered food</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"profile.jsp\">Payment Detail</a></li>\n");
      out.write("           \n");
      out.write("             <li style=\"float:right\"><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
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
     
       String quer="select name,passord,DURATION,nam,eid,fees,studentid,amount,courseid from studentMaster Inner join CoursesEnrolled on CoursesEnrolled.studentid=studentMaster.id Inner join CourseMaster on CoursesEnrolled.courseid=CourseMaster.id Inner join feepaid on feepaid.id=CoursesEnrolled.eid where name='"+name+"'and passord='"+pasord+"';";
      ResultSet rs = st.executeQuery(quer);
      
   
      out.write("  \n");
      out.write("  ");
      out.write("\n");
      out.write("   <form method=\"post\" action=\"fee_2.jsp\">\n");
      out.write("      <table Id=\"course-table\" align=\"center\">\n");
      out.write("               ");

 while(rs.next()){   
 
      out.write("\n");
      out.write("   <tr><td align=\"center\" colspan=\"2\" bgcolor=\"#4CAF50\"><font color=\"#FFFFFF\"><h2>Payment Form Details</h2></font>\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("          <tr>\n");
      out.write("                <td>CUSTOMER NAME</td><td>");
      out.print(rs.getString("name"));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("         \n");
      out.write("          <tr>\n");
      out.write("              <td>FOOD NAME</td><td>");
      out.print(rs.getString("DURATION"));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("               <td>TOTAL Amount</td> <td>");
      out.print(rs.getString("fees"));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("               <td>Amount PAID</td><td>");
      out.print(rs.getString("amount"));
      out.write("</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("              <td>Amount REMAINING</td><td>");
      out.print(rs.getInt("fees")-rs.getInt("amount"));
      out.write("</td> \n");
      out.write("          </tr>     \n");
      out.write("            ");
  }  
      out.write("\n");
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
