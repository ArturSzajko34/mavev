<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head></head>
<body><h3>Add Car</h3>
<form:form method="POST" action="/smartphone" modelAttribute="smartphone">
    <table>
        <tr>
            <td><form:label path="brand">Brand</form:label></td>
            <td><form:input path="brand"/></td>
        </tr>
        <tr>
            <td><form:label path="model">Model</form:label></td>
            <td><form:input path="model"/></td>
        </tr>
        <tr>
            <td><form:label path="price">Price</form:label></td>
            <td><form:input path="price"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form></body>
</html>