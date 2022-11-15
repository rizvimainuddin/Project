package com.springsecurity.demo.project.Repository.Role;

import com.springsecurity.demo.project.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    long count();
}
