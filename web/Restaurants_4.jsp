
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
            <li class="active"><a href="Restaurants.jsp">Home</a></li>
           
              <li  class="dropdown"><a href="#">Menu Item</a>
                <div class="dropdown-content">
                <a href="Restaurants_1.jsp">View Menu Item</a>           
                <a href="Restaurants_2.jsp">Add Menu Item</a>
                <a href="Restaurants_3.jsp">Modify Menu Item</a>           
                <a href="Restaurants_4.jsp">Delete Menu Item</a>
                </div>
            </li>
            <li><a href="Restaurants_5.jsp">Ordered Food</a></li>
           
             <li style="float:right"><a href="logout.jsp">Logout</a></li>
        </ul>
        </div>
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
          String name=(String)session.getAttribute("username");
      String pasord=(String)session.getAttribute("pasord");
       String quer="SELECT * FROM CourseMaster where Nam='"+name+"';";
      ResultSet rs = st.executeQuery(quer);
      
   %> 
 <%--
CourseMaster(Name,DURATION,TECHNOLOGY),studentMaster(name,passord,email,mobile,city),
CoursesEnrolled(studentid,courseid),feepaid
  --%>
      <form method="post" action="Restaurants_4_1.jsp">
      <table Id="course-table" align="center">
          <tr><td>SELECT THE RESTAURANT NAME TO DELETE</td><td>
          <select name="selectedEmployee">
              
          <% while(rs.next()){ %>
                <option value=<%=rs.getInt("id")%>>
                <%=rs.getString("nam")%>,
                <%=rs.getString("DURATION")%>,
                <%=rs.getString("TECHNOLOGY")%>,
                <%=rs.getString("fees")%>
                

            <%  }  %>
                </option>
             </form>
            </select>
             <br>
              </td></td><tr><td>SUBMIT THE DETAILS</td>
                 <td><input type="Submit" value="Delete Restaurant"></td></tr>
      </table>
</form>
  <%    
  }
  catch(Exception e){out.println(e);}
%>

    </body>
</html>



