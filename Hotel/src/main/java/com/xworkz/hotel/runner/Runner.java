package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.FoodItems;
import org.w3c.dom.ls.LSException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {


        EntityManagerFactory eMF  = Persistence.createEntityManagerFactory("Xworkz2");
        EntityManager eM = eMF.createEntityManager();

        List<FoodItems> foodItems = new ArrayList<>();

        foodItems.add( new FoodItems("Dosa", 40, "1 Plate"));
        foodItems.add(new FoodItems("Idli", 30, "2 Pieces"));
        foodItems.add( new FoodItems("Vada Pav", 20, "1 Piece"));
        foodItems.add( new FoodItems("Biryani", 120, "Full Plate"));
        foodItems.add( new FoodItems("Paneer Tikka", 150, "Half Plate"));
        foodItems.add( new FoodItems("Samosa", 15, "1 Piece"));
        foodItems.add( new FoodItems("Pasta", 90, "Regular"));
        foodItems.add( new FoodItems("Pizza", 250, "Medium Size"));


        List
        try{
            eM.getTransaction().begin();
            for(FoodItems foodItem : foodItems) {
                eM.persist(foodItem);
            }
            eM.getTransaction().commit();
        }catch (Exception  e){
            System.out.println(e);
        }
        finally {
            eM.close();
        }


    }
}
