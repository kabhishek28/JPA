package com.xworkz.mouse;


//import com.sun.org.apache.xerces.internal.impl.XMLEntityManager;

//import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Mouse {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Xworkz");

        if(emf!=null){
            System.out.println("Mouse is continued..........");
        }
    }
}
