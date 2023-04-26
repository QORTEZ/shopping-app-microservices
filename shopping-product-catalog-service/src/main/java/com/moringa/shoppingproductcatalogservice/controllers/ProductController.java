package com.moringa.shoppingproductcatalogservice.controllers;

import com.moringa.shoppingproductcatalogservice.model.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/{productId}")
    public Product getProduct(@PathVariable String productId){
        return new Product(productId,"Paint",56.00);
    }
}
