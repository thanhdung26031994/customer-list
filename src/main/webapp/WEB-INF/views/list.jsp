<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 26/02/2024
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sách</title>
    <style>
        table {
            border: 1px solid #000;
        }

        th, td {
            border: 1px dotted #555;
        }
    </style>
</head>
<body>
<div>
    <p>There are ${customer.size()} customer</p>
</div>
<div>
    <table style="width: 50%;">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
        </tr>
        <c:forEach items="${customer}" var="c" varStatus="loop">
            <tr>
                <td>${c.id}</td>
                <td>
                    <a href="info.jsp?id=${c.id}">${c.name}</a>
                </td>
                <td>${c.email}</td>
                <td>${c.address}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
