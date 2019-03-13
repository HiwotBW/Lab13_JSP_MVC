package models;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;
    private User user;

    public ShoppingCart( User user) {
        this.products = new ArrayList<Product>();
        this.user = user;
    }
    public ShoppingCart() {
        this.products = new ArrayList<Product>();
        this.user = null;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
