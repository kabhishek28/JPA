package com.xworkz.coumputer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "monitor_table")
public class Monitor {

    @Id
    @Column(name = "monitor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "size_inches")
    private double sizeInInches;

    @Column(name = "resolution")
    private String resolution;

    @Column(name = "refresh_rate_hz")
    private int refreshRateHz;

    @Column(name = "panel_type")
    private String panelType;

    @Column(name = "is_curved")
    private boolean isCurved;

    @Column(name = "response_time_ms")
    private double responseTimeMs;

    @Column(name = "ports")
    private String ports;

    @Column(name = "price")
    private double price;


    public Monitor( String brand, String model, double sizeInInches, String resolution,
                   int refreshRateHz, String panelType, boolean isCurved, double responseTimeMs,
                   String ports, double price) {

        this.brand = brand;
        this.model = model;
        this.sizeInInches = sizeInInches;
        this.resolution = resolution;
        this.refreshRateHz = refreshRateHz;
        this.panelType = panelType;
        this.isCurved = isCurved;
        this.responseTimeMs = responseTimeMs;
        this.ports = ports;
        this.price = price;
    }
}
