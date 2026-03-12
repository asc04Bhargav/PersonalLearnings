package com.jpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class exampleMain2 {
    static EntityManagerFactory emf = null;
    static EntityManager em = null;
    static EntityTransaction et = null;

    public static void main(String[] args) {
//        addRecord();
        fetchAll();
    }

    public static void addRecord(){
        emf = Persistence.createEntityManagerFactory("test1");

        em= emf.createEntityManager();

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();

        e1.setEmpName("Sandeep");
        e1.setDate(LocalDate.of(2025,04,21));


        e2.setEmpName("Nithish");
        e2.setDate(LocalDate.of(2025,04,20));
//        e1.setDate("21-04-2025");

        e3.setEmpName("Rajat");
        e3.setDate(LocalDate.of(2025,04,22));

        e4.setEmpName("Uday");
        e4.setDate(LocalDate.of(2025,04,23));


        et = em.getTransaction();
        et.begin();  //transaction begin
        em.persist(e1); //persisting means saving the records.
        em.persist(e2);
        em.persist(e3);
        em.persist(e4);
        et.commit();

        System.out.println("Record added..");
    }

    public static void fetchAll(){
        emf = Persistence.createEntityManagerFactory("test1");

        em= emf.createEntityManager();

        Query q1 =em.createQuery("SELECT e FROM com.jpa.Employee as e");
//        Query q2 =em.createQuery("SELECT e.empNumber e.empName FROM com.jpa.Employee as e");

        List<Employee> prodList = q1.getResultList();

        for(Employee e : prodList){
            System.out.println(e.getDate()+" "+e.getEmpName());
        }
    }




}
