package com.springsecurity.demo.project.service.Customer;

import com.springsecurity.demo.project.DTO.RequestDTO.CustomerDetails;
import com.springsecurity.demo.project.Repository.Address.AddressRepository;
import com.springsecurity.demo.project.Repository.Customer.CustomerRepository;
import com.springsecurity.demo.project.Repository.Role.RoleRepository;
import com.springsecurity.demo.project.Repository.User.UserRepository;
import com.springsecurity.demo.project.entity.Customer;
import com.springsecurity.demo.project.entity.Role;
import com.springsecurity.demo.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    AddressRepository addressRepository;


    public void createCustomer(CustomerDetails customerDetails) {
        User user = new User();
        List<User> userList = new ArrayList<>();
        userList.add(user);


        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        Role role = roleRepository.findById(2L).get();
        List<Role> roleList = new ArrayList<>();
        user.setRole(roleList);

        role.setUser(userList);

        user.setEmail(customerDetails.getEmail());
        user.setFirstName(customerDetails.getFirstName());
        user.setMiddleName(customerDetails.getMiddleName());
        user.setLastName(customerDetails.getLastName());
        user.setPassword(customerDetails.getPassword());
        user.setPasswordUpdatedDate(formatter.format(date));
        user.setCreatedBy(role.getAuthority());
        user.setModifiedBy(role.getAuthority());
        user.setModifiedOn(formatter.format(date));
        user.setCreatedOn(formatter.format(date));
        user.setInvalidAttemptCount(0);

        Customer customer = new Customer();
        customer.setContact(customerDetails.getContact());
        customer.setUser(user);

        user.setCustomer(customer);
        userRepository.save(user);
        System.out.println(user.toString());

    }
}