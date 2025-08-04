package com.xworkz.industry.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "x_workz_btm_table")
public class XworkzBTMEntity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_of_head")
    private String NameOfTheHead;

    @Column(name = "branch_name")
    private String branchName;

    @Column(name = "no_of_staff")
    private int noOfStaff;

    @Column(name = "no_of_student")
    private int noOfStudent;

    public XworkzBTMEntity(String nameOfTheHead, String branchName ,int noOfStaff,  int noOfStudent) {
        this.NameOfTheHead = nameOfTheHead;
        this.noOfStaff = noOfStaff;
        this.branchName = branchName;
        this.noOfStudent = noOfStudent;
    }
}
