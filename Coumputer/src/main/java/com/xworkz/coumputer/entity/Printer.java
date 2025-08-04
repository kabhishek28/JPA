package com.xworkz.coumputer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "printer_table")
public class Printer {
    @Id
    @Column(name = "printer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "type")
    private String type; // e.g., Inkjet, Laser, Dot Matrix

    @Column(name = "color_printing")
    private boolean colorPrinting;

    @Column(name = "wireless")
    private boolean wireless;

    @Column(name = "print_speed_ppm")
    private int printSpeedPPM; // Pages Per Minute

    @Column(name = "resolution_dpi")
    private int resolutionDPI;

    @Column(name = "paper_support")
    private String paperSupport; // e.g., A4, A3, Legal

    @Column(name = "price")
    private double price;


    public Printer( String brand, String model, String type, boolean colorPrinting,
                   boolean wireless, int printSpeedPPM, int resolutionDPI,
                   String paperSupport, double price) {

        this.brand = brand;
        this.model = model;
        this.type = type;
        this.colorPrinting = colorPrinting;
        this.wireless = wireless;
        this.printSpeedPPM = printSpeedPPM;
        this.resolutionDPI = resolutionDPI;
        this.paperSupport = paperSupport;
        this.price = price;
    }
}
