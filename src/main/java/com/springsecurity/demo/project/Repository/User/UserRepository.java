package com.springsecurity.demo.project.Repository.User;


import com.springsecurity.demo.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    long count();
}
