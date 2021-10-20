package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public final class customer_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <div id=\"course-table\">\n");
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
      String Nam=request.getParameter("Nam");
      String id=request.getParameter("id");
      String gmai=request.getParameter("gmai");
      String rn=request.getParameter("rn");
      String fn=request.getParameter("fn");
     String pf=request.getParameter("pf");
       String sta=request.getParameter("sta");
     String ad=request.getParameter("ad");
       String qq="Update minupage set id="+id+" where id="+id+" ;";
        int resu = st.executeUpdate(qq);
        String r="Update minupage set Nam='"+Nam+"' where id="+id+" ;";
        int rer = st.executeUpdate(r);
        String up="Update minupage set gmai='"+gmai+"' where id="+id+" ;";
         int rr = st.executeUpdate(up);
        String uup="Update minupage set rn='"+rn+"' where id="+id+" ;";
        int ry = st.executeUpdate(uup);
        String qqr="Update minupage set fn='"+fn+"' where id="+id+" ;";
        int restu = st.executeUpdate(qqr);
          String sk="Update minupage set pf='"+pf+"' where id="+id+" ;";
         int rrt = st.executeUpdate(sk);
           String qtqr="Update minupage set sta='"+sta+"' where id="+id+" ;";
        int restut = st.executeUpdate(qtqr);
          String stk="Update minupage set ad='"+ad+"' where id="+id+" ;";
         int rrtr = st.executeUpdate(stk);
       String quer="SELECT * FROM minupage  where Nam='"+name+"';";
      ResultSet rs = st.executeQuery(quer);
      
   
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("      <table Id=\"course-table\" align=\"center\">\n");
      out.write("           <tr>\n");
      out.write("               \n");
      out.write("                <td>Your Name</td>\n");
      out.write("                <td>Your Phone Number</td>\n");
      out.write("                <td>Restaurant Name</td>\n");
      out.write("                 <td>Food Name</td>\n");
      out.write("                 <td>Price of food</td>\n");
      out.write("                 <td>Status</td>\n");
      out.write("                 <td>Address</td>\n");
      out.write("            </tr>\n");
      out.write("    ");

 while(rs.next()){   
 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td>");
      out.print(rs.getString("Nam"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("gmai"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("rn"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("fn"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("pf"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("sta"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(rs.getString("ad"));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
  }  
      out.write("\n");
      out.write("</table>\n");
      out.write("  ");
    
  }
  catch(Exception e){out.println(e);}

      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
