package com.onetomanyuni;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {
    @Id
    private int deptid;
    private String deptname;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "deptid") //(optional) line but one extra table will be created i.e called as link/ join table.
    private List<Employee> empList = new ArrayList<>();

    public Department() {
    }

    public Department(int deptid, String deptname, List<Employee> empList) {
        this.deptid = deptid;
        this.deptname = deptname;
        this.empList = empList;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }
}
