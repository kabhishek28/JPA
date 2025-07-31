package com.xworkz.keyboard.runner;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Runner {
    public static void main(String[] args) {
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("Xworkz");
        if(emf!=null){
            System.out.println("this is continued...............");
        }
    }
}
