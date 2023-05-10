package com.example.Ecommerce.platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Data
@Entity

public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @ManyToOne
    @JoinColumn(name = "user_name", referencedColumnName = "name")
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    Customer customer;
    @ManyToOne
    @JoinColumn(name = "Orders_id", referencedColumnName = "id")
    Orders orders;
}
