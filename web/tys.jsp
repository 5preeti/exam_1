<%-- 
    Document   : tys
    Created on : 10 Sep, 2016, 3:10:02 PM
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
        <form action="tys" method="post">
            <label>CHOOSE TECHNOLOGY:</label>
           
            <select name="technology">
                <option value="c">C</option>
                <option value="cpp">CPP</option>
                <option value="java">JAVA</option>
            </select>
            <button type="submit"><img src="008027-glossy-black-icon-arrows-hand-clear-pointer-right.png" width="50px" height="30px"></button>
        </form>
    </body>
</html>
