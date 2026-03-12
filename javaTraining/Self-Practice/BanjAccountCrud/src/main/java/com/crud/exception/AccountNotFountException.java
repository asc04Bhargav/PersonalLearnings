package com.crud.exception;

public class AccountNotFountException extends Exception{
    private int accountNumber;

    public AccountNotFountException() {
    }

    public AccountNotFountException(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "AccountNotFountException{" +
                "accountNumber=" + accountNumber +
                '}';
    }
}
