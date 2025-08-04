package com.xworkz.hotel.runner;

import com.xworkz.hotel.entity.FoodItems;
import com.xworkz.hotel.entity.Restaurant;
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


        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant("Sagar" , 250 ,1,2));
        restaurantList.add(new Restaurant("Spice Garden", 400, 2, 4));
        restaurantList.add(new Restaurant("Tandoori Nights", 550, 3, 5));
        restaurantList.add(new Restaurant("Green Bowl", 180, 1, 3));
        restaurantList.add(new Restaurant("Royal Feast", 700, 4, 5));
        restaurantList.add(new Restaurant("Urban Tadka", 350, 2, 4));
        restaurantList.add(new Restaurant("Coastal Catch", 500, 3, 5));
        restaurantList.add(new Restaurant("Veggie Delight", 220, 1, 3));
        restaurantList.add(new Restaurant("Flavors of India", 600, 4, 5));
        restaurantList.add(new Restaurant("Quick Bites", 150, 1, 2));
        try{
            eM.getTransaction().begin();
//            for(FoodItems foodItem : foodItems) {
//                eM.persist(foodItem);
//            }

//            for(Restaurant restaurant : restaurantList){
////                eM.persist(restaurant);
//                eM.contains(restaurantList.toString());
//            }
            FoodItems foodItems1 = eM.find(FoodItems.class,3);
            foodItems1.setFoodPrice(60);
            eM.merge(foodItems1);
            eM.getTransaction().commit();
        }catch (Exception  e){
            if(eM.getTransaction().isActive()){
                eM.getTransaction().rollback();
            }
        }
        finally {
            eM.close();
        }


    }
}
