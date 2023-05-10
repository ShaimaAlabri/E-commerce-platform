package com.example.Ecommerce.platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data

public class ShippingAddresses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name = "user_name", referencedColumnName = "name")
    @JoinColumn(name = "phoneNumber", referencedColumnName = "phoneNumber")
    @JoinColumn(name = "customerAddress", referencedColumnName = "customerAddress")
    Customer customer;
    @ManyToOne
    @JoinColumn(name = "Product_name", referencedColumnName = "name")
    Products products;
    @ManyToOne
    @JoinColumn(name = "OrderNumber", referencedColumnName = "OrderNumber")
    Orders orders;


}
