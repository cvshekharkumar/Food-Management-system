
<html>
    <head>
        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Edufect</title>
        <link rel="stylesheet" href="css.css"/>
    </head>
    <body>
       <div id="course-table">
        <ul>
            <li class="active"><a href="admin.jsp">Home</a></li>
            <li class="dropdown"><a href="#">Menu Items</a>
                <div class="dropdown-content">
                <a href="viewallcourse.jsp">View Menu Items</a>
                <a href="addcourse.jsp">Add New Menu Items</a>
                <a href="modifycourse.jsp">Modify Menu Items</a>
                <a href="deletecourse.jsp">Delete Menu Items</a>
                </div>
            </li>
            <li  class="dropdown"><a href="#">Customers</a>
                <div class="dropdown-content">
                <a href="viewallstudent.jsp">View Customers</a>
                <a href="addstudent.jsp">Add New Customers</a>
                <a href="modifystudent.jsp">Modify Customers</a>
                <a href="deletestudent.jsp">Delete Customers</a>
                </div>
            </li>
            <li  class="dropdown"><a href="#">Restaurants</a>
                <div class="dropdown-content">
                <a href="viewallrestaurants.jsp">View Restaurants</a>
                <a href="addrestaurants.jsp">Add New Restaurants</a>
                <a href="modifyrestaurants.jsp">Modify Restaurants</a>
                <a href="deleterestaurants.jsp">Delete Restaurants</a>
                </div>
            </li>
            <li  class="dropdown"><a href="#">Customers Order</a>
                <div class="dropdown-content">
                <a href="viewallcustomersorder.jsp">View Customers Order</a>
                <a href="addcustomersorder.jsp">Add New Customers Order</a>
                <a href="modifycustomersorder.jsp">Modify Customers Order</a>
                <a href="deletecustomersorder.jsp">Delete Customers Order</a>
                </div>
            </li>
            <li  class="dropdown"><a href="#">Customers Payment Menu page</a>
                <div class="dropdown-content">
                <a href="enrol.jsp">Enrol Customers Menu page</a>
                <a href="removestudent.jsp">Remove Customers Menu page</a>
                </div>
            </li>
            <li><a href="fee.jsp">Payment of Customers </a></li>
             <li style="float:right"><a href="logout.jsp">Logout</a></li>
        </ul>
        </div>
        
    <center><H1><br><br><b> ENROLLMENT DELETED SUCCESSFULLY</b></H1></center>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%
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
      String kd=request.getParameter("selectedStudent");
      String uery="delete from feepaid where id="+ kd;
      int esult=st.executeUpdate(uery);
       String quy="delete from CoursesEnrolled where eid="+ kd;
      int rult=st.executeUpdate(quy);
      
   %> 
  <%    
  }
  catch(Exception e){out.println(e);}
%>

    </body>
</html>
  <%--
CourseMaster(Nam,DURATION,TECHNOLOGY),studentMaster(name,passord,email,mobile,city),
CoursesEnrolled(studentid,courseid),feepaid
  --%>
