package com.hotelsystem.hotelkitchensystem.example.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Customer_Table")
public class Customer {

    @Id
    @GeneratedValue
    private int CustomerId;
    //    @Column(nullable = false)
    private String CusFirstName;

    //    @Column(nullable = false)
    private String CusLastName;

    //    @Column(nullable = false)
    private String Email;

    //    @Column(nullable = false)
    private int Age;

    //    @Column(nullable = false)
    private String Address;

    //    @Column(nullable = false)
    private String NIC;

    //    @Column(nullable = false)
    private String TeleNumber;

    //    @Column(nullable = false)
    private String Password;

}
