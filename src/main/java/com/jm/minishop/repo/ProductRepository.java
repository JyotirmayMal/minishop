package com.jm.minishop.repo;


import com.jm.minishop.model.Product;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository 
{
    private final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product(1, "Laptop", 1000.0));
        products.add(new Product(2, "Smartphone", 500.0));
        products.add(new Product(3, "Headphones", 100.0));
        products.add(new Product(4, "Keyboard", 50.0));
        products.add(new Product(5, "Monitor", 300.0));
    }

    public List<Product> findAll() {
        return products;
    }

    public Product findById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void save(Product product) {
        products.add(product);
    }

    public void deleteById(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    public void update(Product updatedProduct) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == updatedProduct.getId()) {
                products.set(i, updatedProduct);
                return;
            }
        }
    }
}
