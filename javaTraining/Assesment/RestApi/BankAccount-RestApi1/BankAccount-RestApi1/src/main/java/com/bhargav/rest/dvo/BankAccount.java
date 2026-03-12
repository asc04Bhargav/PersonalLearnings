package com.bhargav.rest.dvo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class BankAccount {
    @Id
    private int accountNumber;
    private String customerName;
    private double actBalance;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, String customerName, double actBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.actBalance = actBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getActBalance() {
        return actBalance;
    }

    public void setActBalance(double actBalance) {
        this.actBalance = actBalance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return accountNumber == that.accountNumber && Double.compare(actBalance, that.actBalance) == 0 && Objects.equals(customerName, that.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, customerName, actBalance);
    }
}
