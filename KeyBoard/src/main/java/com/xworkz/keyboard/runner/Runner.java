package com.xworkz.keyboard.runner;

import com.xworkz.keyboard.entity.BottelEntity;
import com.xworkz.keyboard.entity.GlassEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

//        GlassEntity enity = new GlassEntity();
//        enity.setId(1);
//        enity.setGlassType("round");
//        BottelEntity bottelEntity = new BottelEntity(1,"box",2);


        List<GlassEntity> glassEntityList = new ArrayList<>();
        GlassEntity glassEntity = new GlassEntity(2 ,"cylinder");
        GlassEntity glassEntity1 = new GlassEntity(3 ,"Box");
        GlassEntity glassEntity2 = new GlassEntity(4 ,"triangle");
        GlassEntity glassEntity3 = new GlassEntity(5 ,"square");
        GlassEntity glassEntity4 = new GlassEntity(6 ,"Circle");
        GlassEntity glassEntity5 = new GlassEntity(7 ,"ellipse");
        GlassEntity glassEntity6 = new GlassEntity(8 ,"heptagon");
        GlassEntity glassEntity7 = new GlassEntity(9 ,"hexagon");
        GlassEntity glassEntity8 = new GlassEntity(10 ,"octagon");
        GlassEntity glassEntity9 = new GlassEntity(11,"polygon");

        glassEntityList.add(glassEntity);
        glassEntityList.add(glassEntity1);
        glassEntityList.add(glassEntity2);
        glassEntityList.add(glassEntity3);
        glassEntityList.add(glassEntity4);
        glassEntityList.add(glassEntity5);
        glassEntityList.add(glassEntity6);
        glassEntityList.add(glassEntity7);
        glassEntityList.add(glassEntity8);
        glassEntityList.add(glassEntity9);

        List<BottelEntity> bottelEntities = new ArrayList<>();
        BottelEntity bottelEntity= new BottelEntity(2,"cylinder",1);
        BottelEntity bottelEntity1 = new BottelEntity(3,"square",2);
        BottelEntity bottelEntity4 = new BottelEntity(4, "cylindrical", 1);
        BottelEntity bottelEntity5 = new BottelEntity(5, "hexagon", 2);
        BottelEntity bottelEntity6 = new BottelEntity(6, "flat", 3);
        BottelEntity bottelEntity7 = new BottelEntity(7, "rectangle", 2);
        BottelEntity bottelEntity8 = new BottelEntity(8, "cone", 1);
        BottelEntity bottelEntity9 = new BottelEntity(9, "triangle", 3);
        BottelEntity bottelEntity10 = new BottelEntity(10, "curved", 2);

        bottelEntities.add(bottelEntity);
        bottelEntities.add(bottelEntity1);
        bottelEntities.add(bottelEntity4);
        bottelEntities.add(bottelEntity5);
        bottelEntities.add(bottelEntity6);
        bottelEntities.add(bottelEntity7);
        bottelEntities.add(bottelEntity8);
        bottelEntities.add(bottelEntity9);
        bottelEntities.add(bottelEntity10);



        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Xworkz");

        EntityManager eM = emf.createEntityManager();

        EntityTransaction eT = eM.getTransaction();

        eT.begin();
//        eM.persist(enity);
//        eM.persist(bottelEntity);
//        for(GlassEntity glassEntity10 : glassEntityList){
//            eM.persist(glassEntity10);
//        }

//        for(BottelEntity bottel : bottelEntities){
//            eM.persist(bottel);
//        }


        GlassEntity glass = eM.find(GlassEntity.class ,1);
        BottelEntity bottel = eM.find(BottelEntity.class,1);
        System.out.println(glass.toString());
        eT.commit();
        eM.close();


//        EntityManager  entityManager=emf.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(enity);
//        entityManager.getTransaction().commit();
    }
}