<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
    <h2>Simple Addition Calculator</h2>
    <form action="/calculator" method="get">
        Number 1: <input type="text" name="num1" required><br>
        Number 2: <input type="text" name="num2" required><br>
        <button type="submit">Calculate</button>
    </form>
        <h3>Result: ${result}</h3>
</body>
</html>
