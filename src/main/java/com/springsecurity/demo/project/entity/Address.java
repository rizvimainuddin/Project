package com.springsecurity.demo.project.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {
    //TO GENERATE GETTERS AND SETTERS
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String city;
    private String state;
    private String country;
    private String address_line;
    private long zip_code;
    private String label;
}
