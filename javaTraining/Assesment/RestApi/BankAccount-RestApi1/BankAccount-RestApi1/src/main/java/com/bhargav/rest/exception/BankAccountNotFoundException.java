package com.bhargav.rest.exception;

public class BankAccountNotFoundException extends RuntimeException{
    private int accountNumber;
    public BankAccountNotFoundException(int accountNumber) {
        this.accountNumber=accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccountNotFoundException{" +
                "accountNumber=" + accountNumber +
                '}';
    }
}
