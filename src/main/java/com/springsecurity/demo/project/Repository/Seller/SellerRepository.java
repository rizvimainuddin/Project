package com.springsecurity.demo.project.Repository.Seller;

import com.springsecurity.demo.project.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller,Long> {
    long count();
}