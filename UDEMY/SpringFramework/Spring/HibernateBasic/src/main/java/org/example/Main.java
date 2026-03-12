//hibernate-db connection using xml.

package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Laptop l1= new Laptop();
        l1.setLid(1);
        l1.setBrand("Hp");
        l1.setModel("Pavilion");
        l1.setRam(16);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Dell");
        l2.setModel("XPS");
        l2.setRam(32);

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Lenova");
        l3.setModel("Notepad");
        l3.setRam(16);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("bhargav");
        a1.setTech("Backend");

        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("Ajay");
        a2.setTech("FrontEnd");

        Alien a3 = new Alien();
        a3.setAid(103);
        a3.setAname("Neelesh");
        a3.setTech("DataBase");


        a1.setLaptops(Arrays.asList(l1,l2));
        a2.setLaptops(Arrays.asList(l2,l3));
        a3.setLaptops(Arrays.asList(l2));

        l1.setAliens(Arrays.asList(a1,a3));
        l2.setAliens(Arrays.asList(a1,a2));
        l3.setAliens(Arrays.asList(a1,a2));

//        create connection to database to store in it using session storage.
        Configuration cfg = new Configuration();
        //this will locate class name in db using hibernate
        cfg.addAnnotatedClass(org.example.Alien.class);
        cfg.addAnnotatedClass(org.example.Laptop.class);
        cfg.configure();  //to load xml file for connecting to database.

//        refactoring above 3 statements in a single statement.
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(org.example.Student.class)
//                .configure()
//                .buildSessionFactory();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();  //doing anything with database is a trasaction.

        session.persist(l1);
        session.persist(l2);  //instead of save use persist() as it is deprecated.
        session.persist(l3);

        session.persist(a1);
        session.persist(a2);
        session.persist(a3);


        transaction.commit();  //After doing any transaction we have to commit it to reflect changes in the database.



        //in order to fetch the data remove the transaction object and instead od persist use get() which takes t_name and primary key values as parameters and returns object.
//        session.get(Student.class,132);


//        we have to close the session after using it.
        session.close();
        sf.close();

        System.out.println(a2);



    }
}