package com.springsecurity.demo.project.DTO.RequestDTO;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CustomerDetails {
    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private long contact;
}