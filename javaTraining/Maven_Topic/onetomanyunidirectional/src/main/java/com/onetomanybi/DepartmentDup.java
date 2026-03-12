package com.onetomanybi;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class DepartmentDup {
    @Id
    private int deptid;
    private String deptname;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "departmentDup")
//    we can either use mappedby or @joinColumn
    private List<EmployeeDup> empList = new ArrayList<>();

    public DepartmentDup() {
    }

    public DepartmentDup(int deptid, String deptname, List<EmployeeDup> empList) {
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

    public List<EmployeeDup> getEmpList() {
        return empList;
    }

    public void setEmpList(List<EmployeeDup> empList) {
        this.empList = empList;
    }
}
