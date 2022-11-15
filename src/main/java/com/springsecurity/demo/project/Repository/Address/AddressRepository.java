package com.springsecurity.demo.project.Repository.Address;

import com.springsecurity.demo.project.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
    long count();
}