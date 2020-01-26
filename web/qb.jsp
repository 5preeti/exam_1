<%-- 
    Document   : qb
    Created on : 10 Sep, 2016, 3:10:29 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <link rel="stylesheet" href="qb2style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Add Questions</h1>
        <form action="qb" method="post">
            <label>Question</label>
            <textarea name="que"> </textarea>
            <br>
            <br>
            <label>Choice 1</label>
            <input type="text" name="a1">
             <br>
            <br>
            <label>Choice 2</label>
            <input type="text" name="a2">
             <br>
            <br>
            <label>Choice 3</label>
            <input type="text" name="a3">
             <br>
            <br>
            <label>Choice 4</label>
            <input type="text" name="a4">
             <br>
            <br>
            <label>Ans</label>
            <input type="password" name="a5">
             <br>
            <br>
            <input style="width: 8%; height: 60px; color: grey; font-weight: bold; background-color: black; font-size: 40px;" type="submit" value="Store">

        </form>
    </center>
    </body>
</html>
