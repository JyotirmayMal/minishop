package com.jm.minishop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ShopController 
{


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
    
}
