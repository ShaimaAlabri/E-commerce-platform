package com.example.Ecommerce.platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
public class Payments {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer pay_Amount;
    @ManyToOne
    @JoinColumn(name = "user_name", referencedColumnName = "name")
    Customer customer;
    @ManyToOne
    @JoinColumn(name = "Product_name", referencedColumnName = "name")
    Products products;

}
