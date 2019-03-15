<%--
  Created by IntelliJ IDEA.
  User: 986933
  Date: 3/13/2019
  Time: 2:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="mct" uri="/WEB-INF/myTag.tld" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Products</h2>
<table>
    <mct:CurrentDate size="14" color="red"/>
    <thead>
    <th>
    <td>Product</td>
    <td>Price</td>
    <%--<td>Quantity</td>--%>
    <td></td>
    </th>
    </thead>
    <c:forEach items="${products.entrySet()}" var="product">
        <tr>
            <td><c:out value="${product.getValue().name}"/></td>
            <td><c:out value="${product.getValue().price}"/></td>
            <%--<td><c:out value="${product.getValue().quantity}"/></td>--%>
            <%--c:url--%>
            <td><a href='/cart?productId=${product.getValue().id}'>Add to Cart</a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
