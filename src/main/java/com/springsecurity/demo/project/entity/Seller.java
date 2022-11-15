package com.springsecurity.demo.project.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Seller {

    @OneToOne
    private User user;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String gst;
    private long company_contact;



    private String company_name;

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                '}';
    }
}
