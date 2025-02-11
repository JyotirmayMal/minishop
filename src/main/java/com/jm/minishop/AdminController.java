package com.jm.minishop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jm.minishop.model.Product;
import com.jm.minishop.service.ProductService;


@RestController
@RequestMapping("/admin/products")
public class AdminController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public String addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return "Product added successfully!";
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody Product product) {
        product.setId(id);
        productService.updateProduct(product);
        return "Product updated successfully!";
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "Product deleted successfully!";
    }
    
}
