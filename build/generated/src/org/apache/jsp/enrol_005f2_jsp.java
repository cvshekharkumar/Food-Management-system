package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;

public final class enrol_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      String quer=" select name,nam,eid,studentid,courseid from studentMaster Inner join CoursesEnrolled on CoursesEnrolled.studentid=studentMaster.id Inner join CourseMaster on CoursesEnrolled.courseid=CourseMaster.id;";
      ResultSet rs = st.executeQuery(quer);
      String selectedstudent=request.getParameter("selectedstudent");
      String selectedcourse=request.getParameter("selectedcourse");
      String selectedfees=request.getParameter("selectedfees");
      
   
      out.write(" \n");
      out.write("\n");

    int count=0;
  while(rs.next())
       {
          String studentid=rs.getString("studentid");
          String courseid=rs.getString("courseid");
     
         if(studentid.equals(selectedstudent) && courseid.equals(selectedcourse))
           {
                 count ++;
            }
       
          }      
      if(count > 0){
          
      out.write("\n");
      out.write("               <link rel=\"stylesheet\" href=\"css.css\"/>\n");
      out.write("              <table Id=\"course-table\" align=\"center\">\n");
      out.write("               <div id=\"course-table\">\n");
      out.write("                This is already Enrolled<a href=\"enrol.jsp\"><br>Try again</a>\n");
      out.write("               </div>\n");
      out.write("              </table>\n");
      out.write("              ");
 
      }
       if(count == 0){
           
                   session.setAttribute("selectedstudent",selectedstudent);
                   session.setAttribute("selectedcourse",selectedcourse);
                   session.setAttribute("selectedfees",selectedfees);
                   response.sendRedirect("enrol_1.jsp");
              }

  }
  catch(Exception e){out.println(e);}

      out.write('\n');
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
