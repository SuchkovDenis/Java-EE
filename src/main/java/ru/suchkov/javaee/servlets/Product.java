package ru.suchkov.javaee.servlets;

import ru.suchkov.javaee.database.Products;
import ru.suchkov.javaee.entity.Entity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/product")
public class Product extends HttpServlet {

    Products products = Products.getInstance();
    Entity entity;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        entity = products.getEntities().get(Integer.parseInt(req.getParameter("id"))-1);
        req.setAttribute("entity", entity);
        req.getRequestDispatcher("WEB-INF/views/product.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
