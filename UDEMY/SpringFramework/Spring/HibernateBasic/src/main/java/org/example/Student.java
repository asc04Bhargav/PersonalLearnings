package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private int rooNo;

    private String sName;
    private int sAge;

    public int getRooNo() {
        return rooNo;
    }

    public void setRooNo(int rooNo) {
        this.rooNo = rooNo;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rooNo=" + rooNo +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                '}';
    }
}
