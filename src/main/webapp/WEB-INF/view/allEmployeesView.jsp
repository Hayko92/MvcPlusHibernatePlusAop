<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hayk
  Date: 27/04/21
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>All Employees</h1>
<br>
<table>
    <tr>
        <th>NAME</th>
        <th>SURNAME</th>
        <th>DEPARTMENT</th>
        <th>SALARY</th>
        <th>OPERATIONS</th>
    </tr>
    <c:forEach var="emp" items="${allEmployees}">
        <c:url var="updateButton" value="/updateInfo">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>
        <c:url var="deleteButton" value="/deleteEmployee">
            <c:param name="emplId" value="${emp.id}"/>
        </c:url>
        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td><input type="button" value="update" onclick="window.location.href='${updateButton}'">
                <input type="button" value="delete" onclick="window.location.href='${deleteButton}'"></td>
        </tr>
    </c:forEach>

</table>
<br>
<input type="button" name="add" value="Add" onclick="window.location.href = '/addNewEmployee'">
</body>
</html>
