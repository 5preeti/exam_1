<%-- 
    Document   : qb2
    Created on : 30 Sep, 2016, 2:30:00 PM
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
        <center>
        <h1>Add Questions</h1>


    <body>
    <form action="qb2" method="post">
            <label>Question</label>
            <textarea name="ques"> </textarea>
            <br>
            <br>
            <label>choice 1</label>
            <input type="text" name="a">
            <br>
            <br>
            <label>choice 2</label>
            <input type="text" name="b">
            <br>
            <br>
            <label>choice 3</label>
            <input type="text" name="c">
            <br>
            <br>
            <label>choice 4</label>
            <input type="text" name="d">
            <br>
            <br>
            <label>Ans</label>
            <input type="password" name="e">
            <br>
            <br>
           <input style="width: 8%; height: 60px; color: grey; font-weight: bold; background-color: black; font-size: 40px;" type="submit" value="Store">

        </form>
   
        </center>
    </body>
</html>
