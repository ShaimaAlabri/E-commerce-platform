package com.example.Ecommerce.platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Data
@Entity
public class ShoppingCarts {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @ManyToOne
    @JoinColumn(name = "User_id", referencedColumnName = "id")
    Customer customer;
}
