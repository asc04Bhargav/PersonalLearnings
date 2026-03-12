package com.onetomanybi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DepartmentEmployeeDupMain1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();


        DepartmentDup d1 = new DepartmentDup();
        d1.setDeptid(1);
        d1.setDeptname("sales");
//        now add Employee class objects to the list inside d1
        EmployeeDup e1 = new EmployeeDup(101,"Scott");
        EmployeeDup e2 = new EmployeeDup(102,"Smith");
        EmployeeDup e3 = new EmployeeDup(103,"Alien");
        d1.getEmpList().add(e1);
        d1.getEmpList().add(e2);
        d1.getEmpList().add(e3);
        e1.setDepartmentDup(d1);


        et.begin();
        em.persist(d1);
        et.commit();

        System.out.println("Record Added using bidirectional");
    }


}
