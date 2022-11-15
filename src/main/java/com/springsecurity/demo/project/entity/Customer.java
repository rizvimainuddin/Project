package com.springsecurity.demo.project.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @OneToOne
    private User user;

    private long contact;
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                '}';
    }
}
