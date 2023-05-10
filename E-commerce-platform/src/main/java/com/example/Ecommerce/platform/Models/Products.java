package com.example.Ecommerce.platform.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Getter
@Setter
@Data

public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Integer id;
    String name;

}
