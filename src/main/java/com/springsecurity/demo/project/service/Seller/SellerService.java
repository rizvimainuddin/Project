package com.springsecurity.demo.project.service.Seller;

import com.springsecurity.demo.project.DTO.RequestDTO.SellerDetails;
import com.springsecurity.demo.project.Repository.Role.RoleRepository;
import com.springsecurity.demo.project.Repository.Seller.SellerRepository;
import com.springsecurity.demo.project.Repository.User.UserRepository;
import com.springsecurity.demo.project.entity.Role;
import com.springsecurity.demo.project.entity.Seller;
import com.springsecurity.demo.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SellerService {

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    SellerRepository sellerRepository;

    @Autowired
    UserRepository userRepository;

    public void createService(SellerDetails sellerDetails){
        User user = new User();
        List<User> userList = new ArrayList<>();
        userList.add(user);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        Role role = roleRepository.findById(3L).get();
        List<Role> roleList = new ArrayList<>();
        user.setRole(roleList);

        role.setUser(userList);


        user.setEmail(sellerDetails.getEmail());
        user.setFirstName(sellerDetails.getFirstName());
        user.setMiddleName(sellerDetails.getMiddleName());
        user.setLastName(sellerDetails.getLastName());
        user.setPassword(sellerDetails.getPassword());
        user.setPasswordUpdatedDate(formatter.format(date));
        user.setCreatedBy(role.getAuthority());
        user.setModifiedBy(role.getAuthority());
        user.setModifiedOn(formatter.format(date));
        user.setCreatedOn(formatter.format(date));
        user.setInvalidAttemptCount(0);

        Seller seller = new Seller();
        seller.setUser(user);
        seller.setGst(sellerDetails.getGst());
        seller.setCompany_contact(sellerDetails.getCompanyContact());
        seller.setCompany_name(sellerDetails.getCompanyName());
        seller.setUser(user);

        user.setSeller(seller);

        System.out.println(user.toString());
        userRepository.save(user);
    }
}