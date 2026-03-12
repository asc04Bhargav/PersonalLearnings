package com.onetomanybi;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class EmployeeDup {
    @Id
    private int empid;
    private String empname;
    @ManyToOne
    private DepartmentDup departmentDup;


    public EmployeeDup() {
    }

    public EmployeeDup(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public DepartmentDup getDepartmentDup() {
        return departmentDup;
    }

    public void setDepartmentDup(DepartmentDup departmentDup) {
        this.departmentDup = departmentDup;
    }
}
