package dao;

import models.Product;

import java.util.HashMap;

public class ProductDAO {
    private final HashMap<String, Product> productHashMap = new HashMap<String, Product>();

    public ProductDAO() {
        Product product1 = new Product("1", "book", 12,3);
        Product product2 = new Product("2", "phone", 120, 7);
        Product product3 = new Product("3", "laptop", 1200, 8);

        productHashMap.put(product1.getId(), product1);
        productHashMap.put(product2.getId(), product2);
        productHashMap.put(product3.getId(), product3);
    }

    public Product getProduct(String id) {
        return productHashMap.get(id);
    }
    public HashMap<String, Product>  getProducts() {
        return productHashMap;
    }
    public void updateQuantity(String productId){
       Product product =  productHashMap.get(productId);
       product.setQuantity(product.getQuantity() - 1);
    }
}
