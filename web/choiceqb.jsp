<%-- 
    Document   : choiceqb
    Created on : 30 Sep, 2016, 2:46:20 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
                <link rel="stylesheet" href="tys.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="first.jsp"><img src="home-animated-pastels.gif" width="50" height="50" /></a>
           <form action="choiceqb" method="post">
            <label>CHOOSE TECHNOLOGY:</label>
           
            <select name="technology">
                <option value="qbc">C</option>
                <option value="qbcpp">CPP</option>
                <option value="qbjava">JAVA</option>
            </select>
            <button type="submit"><img src="008027-glossy-black-icon-arrows-hand-clear-pointer-right.png" width="50px" height="30px"></button>
        </form>
    </body>
</html>
