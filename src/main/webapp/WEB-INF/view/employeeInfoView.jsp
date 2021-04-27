<%--
  Created by IntelliJ IDEA.
  User: Hayk
  Date: 27/04/21
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Employee Info</h2>
<form:form  action="/saveEmployee" modelAttribute="employee">
    NAME <form:input path="name"/>
    <br><br>
    SURNAME <form:input path="surname"/>
    <br><br>
    DEPARTMENT <form:input path="department"/>
    <br><br>
    SALARY <form:input path="salary"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
