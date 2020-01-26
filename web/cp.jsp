<%-- 
    Document   : cp
    Created on : 10 Sep, 2016, 3:11:19 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="cp.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="first.jsp"><img src="home-animated-pastels.gif" width="50" height="50" /></a>
    <center>
        <h1>
            CHANGE PASSWORD
        </h1>
        <form action="cp" method="post">
            <label>Username</label>
            <input type="text" name="nm">
            <br>
            <br>
            <label>
                Old Password
            </label>
            <input type="password" name="op">
            <br>
            <br>
            <label>New Password</label>
            <input type="password" name="np">
            <br>
            <br>
          <input style="width: 7%; height: 40px;box-shadow: 6px 6px 5px; color: grey; font-weight: bold; background-color: black; font-size: 20px;" type="submit" value="Update">

        </form>
    </center>
    </body>
</html>
