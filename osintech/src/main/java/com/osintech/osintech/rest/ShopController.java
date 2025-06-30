package com.osintech.osintech.rest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ShopController {

    private static final String UPLOAD_DIRECTORY =  System.getProperty("user.dir") + "/uploads";

    @GetMapping("")
    public String returnSzymonName()
    {
        return "shop-page-1";
    }

    @GetMapping("/product1")
    public String returnProduct(){
        return "product-page-1";
    }
}
