package com.xworkz.coumputer.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Entity
@Table(name = "cpu_table")
public class CPU {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "cores")
    private int cores;

    @Column(name = "threads")
    private int threads;

    @Column(name = "clock_speed_ghz")
    private double clockSpeedGHz;

    @Column(name = "architecture")
    private String architecture;

    @Column(name = "integrated_graphics")
    private boolean integratedGraphics;

    @Column(name = "cache_mb")
    private double cacheMB;

    @Column(name = "power_watts")
    private int powerConsumptionWatts;

    @Column(name = "socket_type")
    private String socketType;


    public CPU( String brand, String model, int cores, int threads, double clockSpeedGHz, String architecture, boolean integratedGraphics, double cacheMB, int powerConsumptionWatts, String socketType) {
        this.brand = brand;
        this.model = model;
        this.cores = cores;
        this.threads = threads;
        this.clockSpeedGHz = clockSpeedGHz;
        this.architecture = architecture;
        this.integratedGraphics = integratedGraphics;
        this.cacheMB = cacheMB;
        this.powerConsumptionWatts = powerConsumptionWatts;
        this.socketType = socketType;
    }
}
