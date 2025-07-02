package com.xworkz.hotel.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "restaurant_name")
    private String name;

    @Column(name = "restaurant_price")
    private int price;

    @Column(name = "noofroom")
    private int noOfRoom;

    @Column(name = "noofPeople")
    private int noOfPeople;


    public Restaurant(String name, int price, int noOfRoom, int noOfPeople) {
        this.name = name;
        this.price = price;
        this.noOfRoom = noOfRoom;
        this.noOfPeople = noOfPeople;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", noOfRoom=" + noOfRoom +
                ", noOfPeople=" + noOfPeople +
                '}';
    }
}