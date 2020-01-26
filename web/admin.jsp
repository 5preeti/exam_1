<%-- 
    Document   : admin
    Created on : 21 Oct, 2016, 3:52:56 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="first.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="first.jsp"><img src="home-animated-pastels.gif" width="50" height="50" /></a>
        <form action="admin" method="post">
            <label>
                ADMIN
            </label>
            <br>
            <input type="text" name="box1">
            <br>
            <br>
             <label>
               PASSWORD
            </label>
            <br>
            <input type="password" name="box2">
            <br>
            <br>
            <input style="width: 7%; height: 40px;box-shadow: 7px 7px 6px; color: grey; font-weight: bold; background-color: black; font-size: 20px;" type="submit" value="submit">
              <br>
        
            
        </form>
    
    </body>
</html>
