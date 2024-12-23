package com.projectwhaleon.ecomerce.infra;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "v1")
public class CustomerController {
    
    @GetMapping("/index")
    public String index (){
        return "Welcome to Project Whaleon E-commerce API!";
    }

    @GetMapping("/index2")
    public String index2 (){
        return "Welcome to Project Whaleon E-commerce API! not security";
    }
}
