package com.example.FirstProject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.Date;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Data
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = AUTO)
    private int id;

    private String name;
    private int quantity;
    private BigDecimal Price;
    private String description;
    private String Category;
    private String brand;
    private Boolean isAvailable;
    private Date releaseDate;

    public Product() {}

    public Product(String name, int quantity, BigDecimal price, String description, String category, String brand, Boolean isAvailable, Date releaseDate) {
        this.name = name;
        this.quantity = quantity;
        Price = price;
        this.description = description;
        Category = category;
        this.brand = brand;
        this.isAvailable = isAvailable;
        this.releaseDate = releaseDate;
    }
}
