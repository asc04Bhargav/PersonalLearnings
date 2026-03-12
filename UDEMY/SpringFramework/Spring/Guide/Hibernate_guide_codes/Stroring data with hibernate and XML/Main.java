//hibernate-db connection using xml.

package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.ConnectionBuilder;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setsName("sagar");
        s1.setsAge(21);
        s1.setRooNo(97);

//        create connection to database to store in it using session storage.
        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.example.Student.class);  //this will locate class name in db using hibernate
        cfg.configure();  //to load xml file for connecting to database.

//        refactoring above 3 statements in a single statement.
//        SessionFactory sf = new Configuration()
//                .addAnnotatedClass(org.example.Student.class)
//                .configure()
//                .buildSessionFactory();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();  //doing anything with database is a trasaction.

        session.persist(s1);  //instead of save use persist() as it is deprecated.

        transaction.commit();  //After doing any transaction we have to commit it to reflect changes in the database.



        //in order to fetch the data remove the transaction object and instead od persist use get() which takes t_name and primary key values as parameters and returns object.
        session.get(Student.class,132);


//        we have to close the session after using it.
        session.close();
        sf.close();

        System.out.println(s1.getsName());



    }
}