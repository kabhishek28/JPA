package com.xworkz.industry.repository;

import com.xworkz.industry.entity.XworkzBTMEntity;
import com.xworkz.industry.entity.XworkzRajajinagarEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DataRepositoryImplimentation implements DataRepository{

    EntityManagerFactory entityManagerFactory = null;
    EntityManager entityManager = null ;
    EntityTransaction entityTransaction = null ;

    @Override
    public void insertRajajinagar(XworkzRajajinagarEntity xworkzRajajinagarEntity) {
        entityManagerFactory = Persistence.createEntityManagerFactory("industryUnit");
        entityManager = entityManagerFactory.createEntityManager();
        entityTransaction = entityManager.getTransaction();

        try{
            entityTransaction.begin();
            System.out.println("Rajajinagar data as been saved");
            entityManager.persist(xworkzRajajinagarEntity);
            entityTransaction.commit();
        } catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();

            }
        }finally {
            entityManager.close();
        }
    }

    @Override
    public void insertBTM(XworkzBTMEntity xworkzBTMEntity) {
        entityManagerFactory = Persistence.createEntityManagerFactory("industryUnit");
        entityManager = entityManagerFactory.createEntityManager();
        entityTransaction = entityManager.getTransaction();

        try{

            entityTransaction.begin();
            System.out.println("BTM data as been saved");
            entityManager.persist(xworkzBTMEntity);
            entityTransaction.commit();

        } catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();

            }
        }finally {
            entityManager.close();
        }
    }
}