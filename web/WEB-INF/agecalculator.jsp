<%-- 
    Document   : agecalculator
    Created on : Sep 22, 2020, 4:16:36 PM
    Author     : 608787
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="currentAge"><br>
            <input type="submit" value="Age next birthday">
            </form>
            ${correct}${nextYearAge}${wrong}${nullAge}<br>
            <a href="url">Arithmetic Calculator</a>
        
    </body>
</html>
