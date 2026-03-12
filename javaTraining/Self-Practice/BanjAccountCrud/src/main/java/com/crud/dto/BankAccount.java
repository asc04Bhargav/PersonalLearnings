package com.crud.dto;

import java.util.Objects;

public class BankAccount {
    private int AccountNumber;
    private String AccountType;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, String accountType, double balance) {
        AccountNumber = accountNumber;
        AccountType = accountType;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return AccountNumber == that.AccountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(AccountNumber);
    }
}
