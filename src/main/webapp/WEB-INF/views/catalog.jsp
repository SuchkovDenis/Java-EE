<%@ page import="ru.suchkov.javaee.database.Products" %>
<%@ page import="ru.suchkov.javaee.entity.Entity" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Products products = (Products) request.getAttribute("products");
%>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <link rel="shortcut icon" href="/images/favicon.ico">
    <link rel="stylesheet" href="styles/style.css">
    <title>Каталог</title>
</head>
<body>
<div class="container">
    <div class="header">
        <img src="images/logo.png" alt="logo" title="Go Surf">
        <ul>
            <li><a href="/homework">Главная</a></li>
            <li><a href="/homework/catalog">Каталог</a></li>
            <li><a href="/homework/contacts">Контакты</a></li>
        </ul>
    </div>
    <hr>
    <h2>Каталог</h2>
    <% for (Entity p : products.getEntities()) { %>
    <div class="prod">
        <img src="images/<%=p.getImage()%>"
             alt="<%=p.getName()%>"
             title="<%=p.getName()%>"
             height="200">
        <p>
            <%=String.format("%.2f",p.getPrice())%> руб
        </p>
        <a href="/homework/product?id=<%=p.getId()%>"><%=p.getName()%></a>
    </div>
    <% } %>

    <div class="footer">
        <span>Все права защищены&copy;</span>
    </div>
</div>
</body>
</html>
