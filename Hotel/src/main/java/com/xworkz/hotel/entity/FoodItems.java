package com.xworkz.hotel.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "food3")
public class FoodItems {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "food_name")
    private String foodName;

    @Column(name = "food_price")
    private int foodPrice;

    @Column(name = "food_quntity")
    private String foodQuntity;

    public FoodItems(String foodName, int foodPrice, String foodQuntity) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodQuntity = foodQuntity;
    }
}
