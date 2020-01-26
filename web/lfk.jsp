<%-- 
    Document   : lfk
    Created on : 13 Oct, 2016, 7:08:16 PM
    Author     : Admin
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <form action="jkl" method="post" >
        <center>
        <span style="font-size: 100px;color:green; font-family: serif;"> Online Quize Application</span>  
        </center>
        <br>
        <br>
        <br>
        
 
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <% ResultSet rs=null; 
      {try
    {
      String query="select * from say";
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection m1= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","pakhi singh");   
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
 <br>  
<br>
 <br>       
          <%=i%>
        
        
            
            <span style="font-size: 40px;color:red; font-family: fantasy;">

          <%=rs.getString("question")%>
            </span>
            
            
            <br>
        
            
            <span style="font-size: 30px; font-family: papyrus;">
          <input type="radio" value='<%=rs.getString("A")%>' name="radio<%=i%>"/><%=rs.getString("A")%>
           </span>
           
           
       <br>
            
            <span style="font-size: 30px; font-family: papyrus;">
          <input type="radio" value='<%=rs.getString("B")%>' name="radio<%=i%>"/><%=rs.getString("B")%>
            </span>
            
            <br>
            
            <span style="font-size: 30px; font-family: papyrus;">
          <input type="radio" value='<%=rs.getString("C")%>' name="radio<%=i%>"/><%=rs.getString("C")%>
            </span>
           
            <br>
                   
            <span style="font-size: 30px; font-family: papyrus;">
          <input type="radio" value='<%=rs.getString("D")%>' name="radio<%=i%>"/><%=rs.getString("D")%>
            </span>
           
            <br>
       
        
          <input type="hidden" value='<%=rs.getString("E")%>' name="ans<%=i%>"/>
       
          
          
      <%
    i++;

}
%>

     
      
         
      
            <input style="margin-left: 10%; font-size: 25px;" type="submit" value="END EXAM"></input>
       
   
              
      
     
  
    
  </form>
      
</body>
</html>
