<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Orders</title>
</head>
<body>
<h2>Order Manegment Screen</h2>
<form:form method="post" action="/orders" modelAttribute="order">
    <table>
        <tr>
            <td>Total</td>
            <td><form:input path="total"/></td>
        </tr>
        <tr>
            <td>Item</td>
            <td><form:input path="orderItems[0].product.id"/></td>
            <td><form:input path="orderItems[1].product.id"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Add Order"/>
            </td>
        </tr>
    </table>
</form:form>
<h3>Orders</h3>
<%--<c:if test="${!empty orderList}">
    <table class="data">
        <tr>
            <th>Customer Name</th>
            <th>order date</th>
            <th>total</th>
            <th>order items</th>
        </tr>
        <c:forEach items="${orderList}" var="order">
            <tr>
                <td>${order.user.username}</td>
                <td>${order.orderDate}</td>
                <td>${order.total}</td>
                <td></td>
            </tr>
            <c:if test="${!empty order.orderItems}">
                <c:forEach items="${order.orderItems}" var="orderItem">
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td>${orderItem.product.name}</td>
                    </tr>
                </c:forEach>
            </c:if>
        </c:forEach>
    </table>
</c:if>--%>
</body>
</html>