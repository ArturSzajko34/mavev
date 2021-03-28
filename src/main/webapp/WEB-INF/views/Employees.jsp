<!DOCTYPE HTML>
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body><h2> : ${employees.size()}</h2> <c:forEach items="${employees}" var="employees">
    <tr>
        <div>Employees</div>
        <td>Employees name: <c:out value="${employees.name}"/></td>
        <br>
        <td>Employees age: <c:out value="${employees.age}"/></td>
        <br>
        <td>Employees salary: <c:out value="${employees.salary}"/></td>
        <br>
        <td>Employees id: <c:out value="${employees.id}"/></td>
        <br>
        <td>Employees gender: <c:out value="${employees.gender}"/></td>
        <br></tr>
    <br> </c:forEach></body>
</html>
