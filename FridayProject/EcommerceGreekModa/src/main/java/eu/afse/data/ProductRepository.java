package eu.afse.data;

import eu.afse.model.Color;
import eu.afse.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products;



    public ProductRepository() {
        products = new ArrayList<>();
        Product product1 = new Product("pants", 10, "coolest pants ever", Color.RED, 46, "linen");
        Product product2 = new Product("dress", 15, "coolest dress ever", Color.WHITE, 38, "cotton");
        Product product3 = new Product("shirt", 20, "coolest shirt ever", Color.BLACK, 42, "cashmere");
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }


    @Override
    public String toString() {
        return "ProductRepository{" +
                "products=" + products +
                '}';
    }

    public List<Product> getProducts() {
        return products;
    }


}
