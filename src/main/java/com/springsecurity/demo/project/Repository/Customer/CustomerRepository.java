package com.springsecurity.demo.project.Repository.Customer;

import com.springsecurity.demo.project.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    long count();
}
