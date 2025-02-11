package com.jm.minishop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jm.minishop.model.Product;
import com.jm.minishop.service.ProductService;



@Controller
public class ShopController 
{
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String getLandingPage() 
    {
        return "home.jsp";
    }
    @GetMapping("/calculator")
    public String showCalculator(@RequestParam(required = false, defaultValue = "0") int num1,
                                 @RequestParam(required = false, defaultValue = "0") int num2,
                                 Model model) 
    {
        int result= num1+num2;
        model.addAttribute("result", result);
        return "calculator.jsp";
    }
    @GetMapping("/shop")
    public String showProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "shop.jsp";
    }
    
}
