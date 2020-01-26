<%-- 
    Document   : marks
    Created on : 11 Oct, 2016, 2:23:00 PM
    Author     : Admin
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <form action="answer.jsp" method="post" >
    <table>
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> JSP Page</title>
    </head>
    <body>
    
        <% ResultSet rs=null; 
      {try
    {
      String query="select * from clanguage";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection m1= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","pakhisingh");   
           Statement s= m1.prepareStatement(query);
            rs=s.executeQuery(query);
 
           
    }
    catch(Throwable t)
    {
        System.out.println(t);
    }
    }
int i=1;
while(rs.next()){
%>
    </body>
      <tr>
        <td>
          <%=i%>
        </td>
        <td>
          <%=rs.getString("question")%>
        </td>
        <td>
          <input type="radio" value="A1" name="radio<%=i%>"/><%=rs.getString("A1")%>
        </td>
        <td>
          <input type="radio" value="A2" name="radio<%=i%>"/><%=rs.getString("A2")%>
        </td>
        <td>
          <input type="radio" value="A3" name="radio<%=i%>"/><%=rs.getString("A3")%>
        </td>
        <td>
          <input type="radio" value="A4" name="radio<%=i%>"/><%=rs.getString("A4")%>
        </td>
        <td>
          <input type="text" value='<%=rs.getString("A5")%>' name="ans<%=i%>"/>
        </td>
      </tr>

      <%
i++;
}
%>

      <tr>
        <td>
          <input type="submit" value="submit"></input>
        </td>
      </tr>
    </table>
  </form>
</html>
    
