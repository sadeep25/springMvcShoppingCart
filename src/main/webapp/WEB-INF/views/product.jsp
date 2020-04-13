<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>products</title>
</head>
<body>
<h2>Product Manegment Screen</h2>
<form:form method="post" action="/products" modelAttribute="product">
    <table>
        <tr>
            <td>Product Name</td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><form:input path="price" /></td>
        </tr>
        <tr>
            <td>Description</td>
            <td><form:textarea path="description" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Add Product"/>
            </td>
        </tr>
    </table>
</form:form>
<h3>Products</h3>
<c:if  test="${!empty productList}">
    <table class="data">
        <tr>
            <th>Name</th>
            <th>Price</th>
            <th>Description</th>
        </tr>
        <c:forEach items="${productList}" var="product">
            <tr>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.description}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>