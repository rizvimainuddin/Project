package com.springsecurity.demo.project.Controller.Seller;

import com.springsecurity.demo.project.DTO.RequestDTO.SellerDetails;
import com.springsecurity.demo.project.service.Seller.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sellerController {

    @Autowired
    SellerService sellerService;

    @PostMapping("/seller")
    public void createCustomer(@RequestBody SellerDetails seller){
        System.out.println(seller.toString());
        sellerService.createService(seller);
    }
}