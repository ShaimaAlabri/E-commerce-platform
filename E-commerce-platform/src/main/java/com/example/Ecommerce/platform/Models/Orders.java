package com.example.Ecommerce.platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Data
@Entity

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer OrderNumber;
@ManyToOne
    @JoinColumn(name = "users_id",referencedColumnName = "id")
Customer customer;
    @ManyToOne
@JoinColumn(name = "Product_id", referencedColumnName = "id")
    Products products;


}
