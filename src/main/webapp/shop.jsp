<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.jm.minishop.model.Product" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>Shop</title>
</head>
<body>
    <h2>Available Products</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
        </tr>
        <% for (com.jm.minishop.model.Product product : (java.util.List<com.jm.minishop.model.Product>) request.getAttribute("products")) { %>
            <tr>
                <td><%= product.getId() %></td>
                <td><%= product.getName() %></td>
                <td><%= product.getPrice() %></td>
            </tr>
        <% } %>
    </table>
</body>
</html>
