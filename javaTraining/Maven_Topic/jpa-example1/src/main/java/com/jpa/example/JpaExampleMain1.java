package com.jpa.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaExampleMain1 {

    static EntityManagerFactory emf =null;
    static EntityManager em= null;
    static EntityTransaction et = null;

    public static void main(String[] args) {
//        addRecord();
        updateRecord();
//        deleteRecord();
    }

    public static void addRecord(){
//        create an instance of enittyManagerFactory
        emf = Persistence.createEntityManagerFactory("test1");
//        using emf create an entityManager
        em = emf.createEntityManager();
//
        Product p = new Product();
        p.setProdName("S25");
        p.setPrice(3200.00);

        et = em.getTransaction();
        et.begin();  //transaction begin
        em.persist(p); //persisting means saving the records.
        et.commit();
        System.out.println("Record added..");
    }

    public static void updateRecord(){
        emf = Persistence.createEntityManagerFactory("test1");
        em = emf.createEntityManager();

        Product p1 = em.find(Product.class,2);  //finding record which want to update
        p1.setProdName("Hi");
        p1.setPrice(4000.00);

        em.getTransaction().begin();
        em.persist(p1);
        em.getTransaction().commit();
        System.out.println("record Updated");

    }

    public static void deleteRecord(){
        emf = Persistence.createEntityManagerFactory("test1");
        em = emf.createEntityManager();

        Product p1 = em.find(Product.class,1);

        em.getTransaction().begin();
        em.remove(p1);
        em.getTransaction().commit();

        System.out.println("record deleted");
    }
}
