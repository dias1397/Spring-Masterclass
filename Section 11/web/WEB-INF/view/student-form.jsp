<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: João Dias
  Date: 09/03/2020
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Student Registration Form</title>
    </head>
    <body>
        <form:form action="processForm" modelAttribute="student">
            First Name: <form:input path="firstName"/>
            <br>
            Last Name: <form:input path="lastName"/>
            <br><br>
            <input type="submit" value="Submit">
        </form:form>
    </body>
</html>
