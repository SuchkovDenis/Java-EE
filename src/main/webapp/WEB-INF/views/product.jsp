<%@ page import="ru.suchkov.javaee.entity.Entity" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Entity entity = (Entity) request.getAttribute("entity");
%>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <link rel="shortcut icon" href="images/favicon.ico">
    <link rel="stylesheet" href="styles/style.css">
    <title><%=entity.getName()%></title>
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

    <div class="product">
        <h1><%=entity.getName()%></h1>
        <a href="images/product1.png" target="_blank">
            <img src="images/<%=entity.getImage()%>"
                 alt="<%=entity.getName()%>"
                 title="<%=entity.getName()%>">
        </a>

        <div class="shortDescription">
            <h2>Описание товара</h2>
            <p>
                <%=entity.getShortDescription()%>
            </p>
        </div>

        <div class="characters">
            <h2>Характеристики товара</h2>
            <ul>
                <% for (String c : entity.getCharacteristics()) { %>
                <li><%=c%></li>
                <% } %>
            </ul>
        </div>

        <div class="fullDescription">
            <h2>Подробное описание товара</h2>
            <p>
                <%=entity.getFullDescription()%>
            </p>
            <p>
                <b><%=entity.getAddetInfoName()%></b>
            </p>
            <p>
                <%=entity.getAddetInfoDescription()%>
            </p>
        </div>
    </div>

    <a href="">Купить</a>
    <hr>

    <div class="footer">
        <span>Все права защищены&copy;</span>
    </div>
</div>
</body>
</html>