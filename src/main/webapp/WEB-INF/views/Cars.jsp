<!DOCTYPE HTML>
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body><h2> : ${cars.size()}</h2> <c:forEach items="${cars}" var="car">
    <tr>
        <div>Cars</div>
        <td>Car brand: <c:out value="${car.brand}"/></td>
        <br>
        <td>Car model: <c:out value="${car.model}"/></td>
        <br>
        <td>Car price: <c:out value="${car.price}"/></td>
        <br></tr>
    <br> </c:forEach></body>
</html>