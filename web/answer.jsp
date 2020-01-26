<%-- 
    Document   : answer
    Created on : 12 Oct, 2016, 12:16:44 PM
    Author     : Admin
--%>

<%@page import="com.sun.xml.ws.transport.tcp.io.OutputWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
  <%
     
    String id[]= new String[6];
    for(int i=0;i<6;i++){
      id[i]=request.getParameter("radio"+i);
      System.out.println(id[i]);
    }
    String str[]= new String[6];
    for(int j=0;j<6;j++){
      str[j]=request.getParameter("ans"+j);
      System.out.println(str[j]);
    }

    int count=0;
    //String answers[]=str.split(" ");
    for(int i=0;i<str.length;i++){
      if(id[i].equals(str[i])){
{

      count++;
      //System.out.println(id[i]);
      }
    }
   out.println("Your "+count+" answers are correct"); 
%>

    </body>
</html>
