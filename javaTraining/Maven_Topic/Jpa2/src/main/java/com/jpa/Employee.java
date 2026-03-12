package com.jpa;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Employee   {
//    Date d = new Date();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empNumber;

    @Column
    private String empName;

    @Column
    private LocalDate date;



    public Employee() {
    }

    public Employee(int empNumber, String empName, LocalDate date) {
        this.empNumber = empNumber;
        this.empName = empName;
        this.date = date;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(int empNumber) {
        this.empNumber = empNumber;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
