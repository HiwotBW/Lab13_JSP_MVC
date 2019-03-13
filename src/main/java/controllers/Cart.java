package controllers;

import dao.ProductDAO;
import dao.ShoppingCartDAO;
import models.Product;
import models.ShoppingCart;
import models.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class Cart  extends HttpServlet {
    private ShoppingCartDAO cartDAO = new ShoppingCartDAO();
    private ProductDAO productDAO = new ProductDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String productId = req.getParameter("productId");
        ShoppingCart shoppingCart = (ShoppingCart)req.getSession().getAttribute("cart");
        if(shoppingCart == null){
            shoppingCart = new ShoppingCart();
        }

        shoppingCart = cartDAO.addToCart(productDAO.getProduct(productId), shoppingCart);
        productDAO.updateQuantity(productId);
        req.getSession().setAttribute("cart",shoppingCart);


        req.setAttribute("products", productDAO.getProducts());
        req.getRequestDispatcher("/products.jsp").forward(req, resp);

    }
}
