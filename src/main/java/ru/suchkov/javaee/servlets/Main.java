package ru.suchkov.javaee.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/main")
public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"ru\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <link rel=\"shortcut icon\" href=\"images/favicon.ico\">\n" +
                "    <title>Главная</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <h1>Go Surf</h1>\n" +
                "    <ul>\n" +
                "        <li><a href=\"main\"><b>Главная</b></a></li>\n" +
                "        <li><a href=\"catalog\">Каталог</a></li>\n" +
                "        <li><a href=\"product\">Товар</a></li>\n" +
                "        <li><a href=\"card\">Корзина</a></li>\n" +
                "        <li><a href=\"order\">Заказ</a></li>\n" +
                "    </ul>\n" +
                "    <hr>\n" +
                "    <h2>Главная страница</h2>\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
