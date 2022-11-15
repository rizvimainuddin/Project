package com.springsecurity.demo.project.Controller.Customer;

import com.springsecurity.demo.project.DTO.RequestDTO.CustomerDetails;
import com.springsecurity.demo.project.service.Customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class customerController {

    @Autowired
    CustomerService customerService;



    @PostMapping("/customer")
    public void createCustomer(@RequestBody CustomerDetails customer){
        System.out.println(customer.toString());
        customerService.createCustomer(customer);
    }
}