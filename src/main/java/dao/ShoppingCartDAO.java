package dao;

import models.Product;
import models.ShoppingCart;
import models.User;

import java.util.HashMap;
import java.util.Random;

public class ShoppingCartDAO {
    private final HashMap<String, ShoppingCart> shoppingCartHashMap = new HashMap<String, ShoppingCart>();
    private ProductDAO productDAO = new ProductDAO();

    public void checkout(ShoppingCart shoppingCart){
        shoppingCart.getProducts().forEach((product)->{

       });
    }
    public ShoppingCart getShoppingCart(String username) {
        return shoppingCartHashMap.get(username);
    }
    public ShoppingCart addToCart( Product product, ShoppingCart shoppingCart){

        shoppingCart.getProducts().add(product);
        return shoppingCart;

    }
    private String generateID(Product product){
        int id = new Random().nextInt(5000);
        return product.getId() + "_" + id;

    }
}
