package com.xworkz.keyboard.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "bottel_table")
public class BottelEntity {

    @Id
    @Column
    int id ;

    @Column(name = "bottel_shape")
    String shape;

    @Column(name = "bottel_size")
    int sizeOfTheBottle;

    @Override
    public String toString() {
        return "BottelEntity{" +
                "id=" + id +
                ", shape='" + shape + '\'' +
                ", sizeOfTheBottle=" + sizeOfTheBottle +
                '}';
    }
}
