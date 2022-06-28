<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/28/2022
  Time: 8:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/Converter" method="post">
    <label>Product Description: </label><br/>
    <input type="text" name="ProductDescription" placeholder="ProductDescription" value=""/>
    <br/>
    <label>List Price: </label><br/>
    <input type="text" name="ListPrice" placeholder="ListPrice" value=""/>
    <br/>
    <label>Discount Percent: </label>
    <br/>
    <input type="text" name="DiscountPercent" placeholder="DiscountPercent" value=""/>
    <br/>
    <input type = "submit" id = "submit" value = "Converter"/>
</form>
</body>
</html>
