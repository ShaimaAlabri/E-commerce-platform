package com.example.Ecommerce.platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Data
public class Invoices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Float total_amount;
    Integer id;
    @ManyToOne
    @JoinColumn(name = "User_name", referencedColumnName = "name")
    Customer customer;
    @ManyToOne
    @JoinColumn(name = "Order_number",referencedColumnName = "OrderNumber")
    Orders orders;
    @ManyToOne
    @JoinColumn(name = "Payment_Amount", referencedColumnName = "pay_Amount")
    Payments payments;
    @ManyToOne
    @JoinColumn(name = "Product_name", referencedColumnName = "name")
    Products products;

}
