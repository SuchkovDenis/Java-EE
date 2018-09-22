<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <link rel="shortcut icon" href="images/favicon.ico">
    <link rel="stylesheet" href="styles/style.css">
    <title>Контакты</title>
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

    <h2>Контакты</h2>

    <h3>Адрес</h3>

    <b>Телефон:</b> +7 (499) 289-89-00
    <br>
    <b>Адрес:</b> Кременчугская ул. 14, Москва, Российская Федерация
    <br>

    <h3>Напишите нам</h3>
    <form action="#" method="post">

        <input type="text" placeholder="Имя Фамилия" required>
        <br>
        <input type="email" placeholder="mail@example.com" required>
        <br>
        <input type="text" placeholder="Тема" required>
        <br>
        <textarea name="message"
                  id="msg"
                  cols="18"
                  rows="10"
                  placeholder="Введите текст сообщения сюда"
                  required></textarea>
        <br>
        <input type="submit" value="Отправить">
    </form>
    <br>

    <div class="footer">
        <span>Все права защищены&copy;</span>
    </div>
</div>
</body>
</html>