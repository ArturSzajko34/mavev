<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head></head>
<body><h3>Add Employee</h3>
<form:form method="POST" action="/employee" modelAttribute="employee">
    <table>
        <tr>
            <td><form:label path="id">ID</form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="age">Age</form:label></td>
            <td><form:input path="age"/></td>
        </tr>
        <tr>
            <td><form:label path="salary">Salary</form:label></td>
            <td><form:input path="salary"/></td>
        </tr>
        <tr>
            <td><form:label path="gender">Gender</form:label></td>
            <td><form:input path="gender"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form></body>
</html>