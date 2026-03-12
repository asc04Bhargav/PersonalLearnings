package com.spring.jpa.ex2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Objects;

@Entity
public class Employee {

    @Id
    private int empId;

    @Column
    private String empName;

    @Column
    private double salary;

    public Employee() {
    }

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Double.compare(salary, employee.salary) == 0 && Objects.equals(empName, employee.empName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, salary);
    }
}
